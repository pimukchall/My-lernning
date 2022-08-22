import matplotlib.pyplot as plt
y = [80,70,60,50,40]
x = ['mon' , 'tue' , 'wed' , 'thur' , 'fri']

plt.bar(x,y, color='y' , alpha=0.9)
plt.xticks(rotation=45)

plt.show()