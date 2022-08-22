import pandas as pd

data = [5,15,10,15,20,15,10,5]
idx = ['a','b','a','c','c','d','b','c']

sr = pd.Series(data, index=idx)

print(sr.sort_index())

g = sr.groupby(idx).sum()
# g = sr.groupby(idx).count()
# g = sr.groupby(idx).mean()
# g = sr.groupby(idx).max()

print(g)