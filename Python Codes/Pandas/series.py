#Pandas is a Python library.

#Pandas is used to analyze data.

import pandas as pd

df = pd.read_csv('data.csv')

print(df.to_string()) 

#Create a simple Pandas Series from a list:

import pandas as pd

a = [1, 7, 2]

myvar = pd.Series(a)

print(myvar)

#Return the first value of the Series:

print(myvar[0])

#Create your own labels:

import pandas as pd

a = [1, 7, 2]

myvar = pd.Series(a, index = ["x", "y", "z"])

print(myvar)

#Return the value of "y":

print(myvar["y"])

#Create a simple Pandas Series from a dictionary:

import pandas as pd

calories = {"day1": 420, "day2": 380, "day3": 390}

myvar = pd.Series(calories)

print(myvar)

