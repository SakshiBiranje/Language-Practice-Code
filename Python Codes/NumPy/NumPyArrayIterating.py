import numpy as np

# 1D Array 
arr = np.array([1, 2, 3])

for x in arr:
  print(x)

#2D Array
arr = np.array([[1, 2, 3], [4, 5, 6]])
for x in arr:
  print(x)

#3D Array
arr = np.array([[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]])

for x in arr:
  print(x)

#Iterate down to the scalars
arr = np.array([[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]])


for x in arr:
  for y in x:
    for z in y:
      print(z)

#Iterating with nditer() 
arr = np.array([[[1, 2], [3, 4]], [[5, 6], [7, 8]]])

for x in np.nditer(arr):
  print(x)


  