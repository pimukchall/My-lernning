import numpy as np

# Work1
# a = np.random.rand(3,3)
# print("Sum : %.3f" % a.sum())
# print("Max : %.3f" % a.max())

# Work2
v = np.random.randint(0,10,9)
vnew = v.reshape(3,3)
print("vew :" , vnew)

less_than__five = vnew[vnew<5]
print("less_than__five : " , less_than__five)

print("Sum : %.2f" % less_than__five.sum())
print("Mean : %.2f" % less_than__five.mean())