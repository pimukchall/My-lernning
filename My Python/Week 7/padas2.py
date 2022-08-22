import pandas as pd
import numpy as np
data = {'one' : np.random.randint(100,1000,10),
        'two' : np.random.randint(1,10,10),
        'three' : np.random.rand(10),
        'four' : np.random.randint(1,100,10),
        'five' : np.random.uniform(-10,10,10),
        'six' : np.random.choice([101,555,108,123,777],10)
        }

df = pd.DataFrame(data,index=list('abcdefghij'))
print(df)
print()

print(df[1::3][['two','four','five']])