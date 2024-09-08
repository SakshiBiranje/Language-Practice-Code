# for loop
fruits = ["apple", "banana", "cherry"]
for x in fruits:
  print(x)

# to print each character in a string
  for x in "banana":
   print(x)
   
# to print each element in a list and break when it is "banana"
fruits = ["apple", "banana", "cherry"]
for x in fruits:
  print(x)
  if x == "banana":
    break
  
print("\n")
# to print each element in a list and continue to the next iteration 
fruits = ["apple", "banana", "cherry"]
for x in fruits:
  if x == "banana":
    break
  print(x)