#Returns True for every row that is a duplicate, otherwise False

import pandas as pd

df = pd.read_csv('data.csv')

print(df.duplicated())