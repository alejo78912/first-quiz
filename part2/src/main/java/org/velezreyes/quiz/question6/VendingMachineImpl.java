package org.velezreyes.quiz.question6;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine{

private Map<String, Drink> knownDrinks;
private int currentAmount;	
private static final int QUARTER_VALUE = 25;
	
public static VendingMachine getInstance() {
  return new VendingMachineImpl();
}

public VendingMachineImpl() {
    knownDrinks = new HashMap<>();
    knownDrinks = new HashMap<>();
    knownDrinks.put("ScottCola", new DrinkClass("ScottCola", 75, true));
    knownDrinks.put("KarenTea", new DrinkClass("KarenTea", 100, false));
}

@Override
public void insertQuarter() {
	
	currentAmount += QUARTER_VALUE;
	
}

@Override
public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (knownDrinks.containsKey(name)) {
        Drink selectedDrink = knownDrinks.get(name); 
        if (currentAmount >= selectedDrink.getPriceInCents()) {
            currentAmount -= selectedDrink.getPriceInCents();
            return selectedDrink;
        } else {
            throw new NotEnoughMoneyException();
        }
    } else {
        throw new UnknownDrinkException();
    	}
	}
	
}



