import numpy as np
import pandas as pd

data = {'price' : [200,300,250,5000], 'sales': [0,30,25,50], 'stock': [8,0,5,1]}

df=pd.DataFrame(data,index=['p1','p2','p3','p4'])

print(df,'\n using boolean index')

df1 = df[df['price'] >=300]

print('\n Boolean index Masking 1 : \n' , df1)

df2 = df[(df.price >=200)& (df.price<=300)]
print('\n Boolean index : Masking 2: \n',df2)

#only some colum display
df3 = df[df['stock']==0]

print('\n some colum select !! \n' , df3)

#only price and stock

df4 = df[df['price','stock']]['df.stock' >0]
print('\n Only price and stock \n', df4)
