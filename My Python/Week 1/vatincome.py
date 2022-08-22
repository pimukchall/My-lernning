income = int(input("รับเงินมา: ")) 
if income > 300001 :
    print(income/100*10)
elif income > 150001 :
    print(income/100*5)
elif income == 150000 :
    print(income)