import numpy as np
import pandas as pd

# 1. select some row define label index using operator loc same as series knowledge
#df.loc[['lebel1','label2',label3',...]]
# 2. select some row of every colum by define as positon index using operator iloc
# as df.iloc[[pos1,pos2,pos3,...]]
data = {'one' : np.random.randint(100,1000,10),
        'two' : np.random.randint(1,10,10),
        'three' : np.random.rand(10),
        'four' : np.random.randint(1,100,10),
        'five' : np.random.uniform(-10,10,10),
        'six' : np.random.choice([101,555,108,123,777],10)
        }

df = pd.DataFrame(data, index=list('abcdefghij'))

print(df)

print(df.loc[['a','b','c','d','j']]) #print some row of every colum using position index operator as iloc

print(df.iloc[[1,3,5,9]]) #print some row of every colum using position index operator as iloc