money = input("เงินต้น: ")
interest = input("ดอกเบี้ย: ")
years = input("ปี: ")
total = (float(money) * (float(interest)*0.01) * float(years)) + float(money)
print(total)