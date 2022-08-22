from re import I
from unittest import result

number1 = int(input(" ต้องการสูตรคูณแม่ไหน? : "))
number2 = int(input(" ต้องการสูตรคูณแม่ไหน? : "))
for i in range (number1 , number2+1) :
    for j in range(1,13) :
        result = i*j 
        print("%d x %d = %d"%(i , j , result))
    print("\n")