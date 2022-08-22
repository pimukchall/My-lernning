import pandas as pd

data = {'one' : [11,22,33,44] , 'two' : [55,66,77,88], 'three' : [101,108,109,110]}

print(data)

df1 = pd.DataFrame(data, index=['p1','p2','p3','p4'])
print('\n',df1)

data2 = [[11,22,33,44],[55,66,77,88],[101,108,109,110]]
df2 = pd.DataFrame(data2, columns=['one','two','three','four'])

print('\n',df2)
