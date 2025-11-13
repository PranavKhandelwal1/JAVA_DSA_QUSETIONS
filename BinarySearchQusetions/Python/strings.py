name = "Pranav khandelwal"
firstName = name[0:6]
lastName = name[7:16]
print("First Name:", firstName * 2)
print("Last Name:", lastName * 2)

print("Length of the name:", len(name))
print(name.lower())
print(name.upper())
print(name.replace("khandelwal", "Khandelwal"))
print("Index of 'khandelwal':", name.index("khandelwal"))
print("Count of 'a':", name.count("a"))
print("Is alphabetic?:", name.replace(" ", "").isalpha())
print(name[0]) #Accessing first character using indexing "P"
print(name[-17]) #Negative indexing to get the first character "P"
print(firstName +" "+ lastName)
print(name[0:3])