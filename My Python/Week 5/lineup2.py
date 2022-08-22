import matplotlib.pyplot as plt

import numpy as np



y = np.random.randint(1, 6, 4)

x= list('ABCD')



plt.subplot(2, 2 ,1)

plt.plot(x, y, 'ro-')



y = np.random.randint(1, 6, 4)

plt.subplot(2, 2 ,2)

plt.plot(x, y, 'ro--')




y = np.random.randint(1, 6, 4)

plt.subplot(2, 2 ,3)

plt.plot(x, y, 'ro:')




y = np.random.randint(1, 6, 4)

plt.subplot(2, 2 ,4)

plt.plot(x, y, 'ro-.')



plt.subplots_adjust(wspace=0.3, hspace=0.3)



plt.show()