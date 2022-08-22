level = int(input("ระดับของพนักงาน : "))
price_product = int(input("ขายสินค่าได้ : "))

if (price_product >= 50000) :
    bonus = ((price_product * 0.05) + price_product)
    print (bonus)
    
elif (level >= 3) :
    bonus = ((price_product * 0.05) + price_product)
    print ((bonus*0.05) + bonus)