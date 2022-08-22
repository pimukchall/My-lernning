user = input("ชื่อ")
Password = input("Password : ")
if user == "pimuk" and Password == "1234" :
    print("การยืนยันผู้ใช้งานถูกต้อง")
if Password == "1234" :
    print("Your Password is Correct.")
elif Password == "123456789" :
    print("Your Password is Correct.")     
else: 
    print("Your Password is Incorrect.")