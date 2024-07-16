num3 = (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
key = int(input("Enter the element to find: "))  # Convert input to integer

i = 0
while i < len(num3):
    if num3[i] == key:
        print(f"Element found at index {i}")
        break
    i += 1
else:
    print("Element not found")