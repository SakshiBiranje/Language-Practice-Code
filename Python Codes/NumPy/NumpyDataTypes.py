#numpy data types
import numpy as np

arr = np.array([1, 2, 3, 4])

print(arr.dtype)

arr1 = np.array(['apple', 'banana', 'cherry'])

print(arr1.dtype)

arr2 = np.array([1, 2, 3, 4], dtype='S')

print(arr2)
print(arr2.dtype)

arr3 = np.array([1, 2, 3, 4], dtype='i4')

print(arr3)
print(arr3.dtype)


#Change data type from float to integer by using 'i' as parameter value

arr = np.array([1.1, 2.1, 3.1])

newarr = arr.astype('i')

print(newarr)
print(newarr.dtype)


#Change data type from float to integer by using int as parameter value

arr = np.array([1.1, 2.1, 3.1])

newarr = arr.astype(int)

print(newarr)
print(newarr.dtype)


#Change data type from integer to boolean

arr = np.array([1, 0, 3])

newarr = arr.astype(bool)

print(newarr)
print(newarr.dtype)