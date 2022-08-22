def compute_area (b , h) :
    a = 0.5* b * h
    return a

b = float(input("base : "))
h = float(input("height : "))
a = compute_area(b,h)
print("The area of the triangle is = " ,a)