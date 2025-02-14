#dictionary in python

d1 = { 'apple':100,'mango':200,'kiwi':50}
print(d1)  # key - value pair
print(type(d1))  #type 
print(d1.keys()) #keys
print(d1.values()) #values of keys

d1['guava'] = 40 #add element
print(d1 )

#functions in dict 

d2 ={'banana': 60,'berry':90}
d1.update(d2)   # upade d1 by adding d2 to d1
print(d1)
d1.pop('mango')  #to delete any element 
print(d1)
