import matplotlib.pyplot as plt
import numpy as np

# print(plt.style.available)

plt.style.use("seaborn")
# plt.style.use("seaborn-white")

y = np.random.randint(1,11,5)
x = list ("ABCDE")

plt.plot(x,y)
plt.show()