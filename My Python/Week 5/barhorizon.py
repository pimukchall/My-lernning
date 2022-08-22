import matplotlib.pyplot as plt

import numpy as np



plt.style.use("ggplot")



y = [2, 4, 1, 2, 3, 2, 1, 2, 3, 2]

x = np.arange(1, 11)




plt.bar(x, y, color='m')

plt.title('Bar Plot')

plt.xlabel('Play')

plt.ylabel('Score')

plt.grid(color='y', alpha = 0.2)



plt.show()