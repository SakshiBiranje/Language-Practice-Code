import pandas as pd
#Set "Duration" = 45 in row 7
#cleaning Wrong data

df = pd.read_csv('data.csv')

df.loc[7,'Duration'] = 45

print(df.to_string())