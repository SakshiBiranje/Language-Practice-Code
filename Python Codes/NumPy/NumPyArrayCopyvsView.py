# NumPy Array Copy vs View
import numpy as np

#Make a copy, change the original array, and display both arrays
arr = np.array([1, 2, 3, 4, 5])
x = arr.copy()
arr[0] = 42

print(arr)
print(x)

#Make a view, change the original array, and display both arrays
arr = np.array([1, 2, 3, 4, 5])
x = arr.view()
arr[0] = 42

print(arr)
print(x)

#Print the value of the base attribute to check if an array owns it's data or not:

arr = np.array([1, 2, 3, 4, 5])

x = arr.copy()
y = arr.view()

print(x.base)
print(y.base)


