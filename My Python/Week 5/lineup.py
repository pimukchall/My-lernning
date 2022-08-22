from cProfile import label
import matplotlib.pyplot as plt

y = [5,15,20,10,5]
x = [1,2,3,4,5]
plt.plot(x, y, ls = '-' , c= 'r' , label = 'สินค้า #1')

y =[15,20,10,5,15]
plt.plot(x, y, ls = '--' , c='c' , label = 'สินค้า #2')

y = [10,5,15,15,20]
plt.plot(x, y, ls= ':' , c='m' , label = 'สินค้า #3')

plt.rcParams['font.sans-serif'] = 'tahoma'
plt.rcParams['font.family'] = 'tahoma'
plt.rcParams['font.size'] = 14
plt.legend(loc = 'best')

plt.show()

