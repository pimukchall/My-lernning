import pandas as pd
df = pd.read_csv("C:\\Users\\Pimuk\\Documents\\My Python\\Week 4\\staffs.csv")
# print(df)

df["รายได้"] = df ["ค่าจ้าง"] * df["ชั่วโมง"]
# print(df)

print(df["ค่าจ้าง"])