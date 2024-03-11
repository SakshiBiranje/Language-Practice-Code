#Load the CSV into a DataFrame:

import pandas as pd
df = pd.read_csv('data.csv')

print(df.to_string())

#Print the DataFrame without the to_string() method:

import pandas as pd

df = pd.read_csv('data.csv')

print(df) 

#Check the number of maximum returned rows:

import pandas as pd

print(pd.options.display.max_rows) 

#Increase the maximum number of rows to display the entire DataFrame:

import pandas as pd

pd.options.display.max_rows = 9999

df = pd.read_csv('data.csv')

print(df) 
