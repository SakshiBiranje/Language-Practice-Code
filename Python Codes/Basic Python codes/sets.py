# sets in python - unindexed , mutable , unordered collection

s1 ={1, 3.14,"radha"}
print(s1)
s1.add("Hello")  #add values
print(s1)
s1.remove("Hello")  #remove element
print(s1)
s1.update([10,20,"sakshi"])  #update 
print(s1)

#functions in sets

s1={"sakshi", 31.4,40,30,1}
s2={1,2,3,4,30,"radha"}
print(s1)
#to make combination of two sets
print(s1.union(s2))
#to find common elements in two sets
print(s1.intersection(s2))
