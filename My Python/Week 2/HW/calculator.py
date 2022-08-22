print ("1 add")
print ("2 subtract")
print ("3 multiply")
print ("4 divide")

num1 = int(input("Input your number : " ))
num2 = int(input("Input your number : " ))

def add(num1,num2) :
    return (num1 + num2)
def subtract(num1,num2) :
    return (num1 - num2)
def multiply(num1,num2) :
    return (num1 * num2)
def divide(num1,num2) :
    return (num1 / num2)

def calculator (opt,num1,num2):
    switcher = {
        "1" : add(num1,num2) ,
        "2" : subtract ,
        "3" : multiply ,
        "4" : divide 
    }
    return switcher.get(opt , "Please type only number (1-4)")

choose = input("Choose a calculator option. : ")

print(calculator(choose,num1,num2))