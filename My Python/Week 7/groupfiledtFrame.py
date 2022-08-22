import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("C:\\Users\\Pimuk\\Documents\\My Python\\Week 7\\hypertension_all.csv")

# df1 = pd.DataFrame(df, columns=['เขตบริการสุขภาพ' , 'จังหวัด' , '2559' , '2560' , 'ประชากรกลางปี'])
# df2 = pd.DataFrame(df, columns=['one','two','three','four','five'])
print(df)

plt.plot(df['2561'])
plt.show()
