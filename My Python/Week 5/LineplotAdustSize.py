import matplotlib.pyplot as plt
import numpy as np

y = np.random.randint(1,11,5)
x = list ("ABCDE")

plt.rcParams["figure.figsize"] = (10,5) # width=10 , Height = 5"
plt.plot(x,y)
plt.show() 