#Get a quick overview by printing the first 10 rows of the DataFrame:
import pandas as pd

df = pd.read_csv('data.csv')

print(df.head(10))

#Print the first 5 rows of the DataFrame:

df = pd.read_csv('data.csv')

print(df.head())   #by default it will print the first 5 rows of the DataFrame

#Print the last 5 rows of the DataFrame:

print(df.tail()) 

#Print information about the data:

print(df.info()) 
