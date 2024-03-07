# reshaping arrays
#Convert the following 1-D array with 12 elements into a 2-D array.
#The outermost dimension will have 4 arrays, each with 3 elements:

import numpy as np
arr = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12])

newarr = arr.reshape(4, 3) #(rows,cols)

print(newarr)
print("\n")

#2 arrays that contains 3 arrays, each with 2 elements
newarr = arr.reshape(2, 3, 2) #(no. of arrays, rows, cols)

print(newarr)

#Check if the returned array is a copy or a view:

arr = np.array([1, 2, 3, 4, 5, 6, 7, 8])
# the base attribute to check if an array owns it's data or not
print(arr.reshape(2, 4).base)

newarr = arr.reshape(2, 2, -1)   #here -1 is like an unknown dimension

print(newarr)

#Convert the array into a 1D array:

arr = np.array([[1, 2, 3], [4, 5, 6]])

newarr = arr.reshape(-1)

print(newarr)