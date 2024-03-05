# array slicing numpy
#synatax : arr[start:end]  or arr[start:end:step]
# step is kind of gap u want in array if it is like arr[1:5:2] : it will print array from 1 to 5 index with gap of 1 element or by skipping 1 w
import numpy as np

arr = np.array([1,2,3,4,5,6,7])
print(arr[1:5])
print(arr[1:5:2])
print(arr[:4])
print(arr[4:])

arr1 = np.array([[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]])
print(arr1[0:2, 2])
print(arr1[2,1:4])