#NumpyArrayJoin
import numpy as np
# to join two arrays together
arr1 = np.array([1, 2, 3])
arr2 = np.array([4, 5, 6])
arr = np.concatenate((arr1, arr2))

print(arr)

#Join two 2-D arrays along rows (axis=1)
arr1 = np.array([[1, 2], [3, 4]])

arr2 = np.array([[5, 6], [7, 8]])

arr = np.concatenate((arr1, arr2), axis=1)

print(arr)

#Joining Arrays Using Stack Functions
arr = np.stack((arr1, arr2), axis=1)

print(arr)
#hstack() to stack along rows
arr = np.hstack((arr1, arr2))

print(arr)

#vstack()  to stack along columns
arr = np.vstack((arr1, arr2))

print(arr)

#dstack() to stack along height, which is the same as depth.
arr = np.dstack((arr1, arr2))

print(arr)