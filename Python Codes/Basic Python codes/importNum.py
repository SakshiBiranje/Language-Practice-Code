import numpy as np
arr = np.array([1, 2, 3, 4, 5])
print(arr)

#1D array
import numpy as np
arr =np.array([21,1,5,7,94])
print(arr)

#2D array
import numpy as np 
arr = np.array([[12,23,34],[6,4,21]])
print(arr)

#3D array
import numpy as np 
arr = np.array([[[12,23,34], [65,43,21]], [[87,45,62], [15,29,48]]])
print(arr)


#dimension of arrays
import numpy as np
a = np.array(42)
b = np.array([1, 2, 3, 4, 5])
c = np.array([[1, 2, 3], [4, 5, 6]])
d = np.array([[[1, 2, 3], [4, 5, 6]], [[1, 2, 3], [4, 5, 6]]])

print(a.ndim)
print(b.ndim)
print(c.ndim)
print(d.ndim)


#dimensions
import numpy as np
arr = np.array([1, 2, 3, 4], ndmin=5)

print(arr)
print('number of dimensions :', arr.ndim)