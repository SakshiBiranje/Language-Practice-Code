#function 
def my_function():
  print("Hello from a function")

my_function()
print("\n")

def my_function(fname):
  print(fname + " Biranje")

my_function("Radha")
my_function("Sridha")
my_function("Vrinda")
print("\n")
#This function expects 2 arguments, and gets 2 arguments:


def my_function(fname, lname):
  print(fname + " " + lname)

my_function("Sakshi", "Biranje")
print("\n")
#If the number of arguments is unknown, add a * before the parameter name:

def my_function(*kids):
  print("The youngest child is " + kids[0])

my_function("Sakshi", "Santosh", "Vanita")
