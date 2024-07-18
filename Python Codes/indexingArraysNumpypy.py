#indexing of arrays
import numpy as np

arr = np.array([1, 2, 3, 4])

print(arr[0])
print(arr[2])
print(arr[1] + arr[2])

#print particular element from matrix
arr = np.array([[1,2,3,4,5], [6,7,8,9,10]])

print('2nd element on 1st row: ', arr[0, 1])

#print 
arr = np.array([[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]])

print(arr[0, 1, 2])