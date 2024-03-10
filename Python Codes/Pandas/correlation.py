#Show the relationship between the columns
# df.corr()  The number varies from -1 to 1.

import pandas as pd

df = pd.read_csv('data.csv')

print(df.corr())