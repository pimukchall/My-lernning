import math
a = float(input("input float number : "))
b = float(input("input float number : "))
c = float(input("input float number : "))
cr = c * math.pi/180
area = 1/2 * a * b * math.sin(cr)
print("area = " , area)