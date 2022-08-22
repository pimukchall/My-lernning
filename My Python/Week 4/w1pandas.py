import pandas as pd

print("-------------------------------------------------------")

s1 = pd.Series(["a" , "b" , "c"])
print(s1)
print(s1[1])

s2 = pd.Series([5 , 10 , 15] , ["Bankok" , "Pathumthani" , "Nonthaburi"])
print(s2)
print(s2["Pathumthani"])

print("-------------------------------------------------------")

list = [[1, "A" , 500 , 12] , [2 , "B" , 400 , 17] , [3 , "C" , 350 , 18]]
df = pd.DataFrame(list, columns= ["code" , "name" , "salary" , "hour"])

print(df)
print(df["name"])
df1 = df[["name" , "salary"]]
print(df1)

print("-------------------------------------------------------")
print("สร้างแถวเพิ่ม")
df["income"] = df ["salary"] * df["hour"]
print(df)

print("-------------------------------------------------------")
print("ลบแถว")

df.drop ("income" , axis = 1 , inplace = True)
print(df)

print("-------------------------------------------------------")
print("เลือกแถวและเลือกคอลั่ม")

print(df.loc[1])
print(df.loc[0, "name"])
print(df.loc[[0,2],["name","salary"]])

print("-------------------------------------------------------")
