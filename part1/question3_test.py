from question3 import make_oven, alchemy_combine

def test_alchemy_combine():

  assert alchemy_combine(
    make_oven(),
    ["lead", "mercury"],
    5000
  ) == ['Boiled lead', 'Boiled mercury']

  assert alchemy_combine(
    make_oven(),
    ["water", "air"],
    -100
  ) ==  ['Frozen water', 'Frozen air']

  assert alchemy_combine(
    make_oven(),
    ["cheese", "dough", "tomato"],
    150
  ) == ['Boiled cheese', 'Boiled dough', 'Boiled tomato']