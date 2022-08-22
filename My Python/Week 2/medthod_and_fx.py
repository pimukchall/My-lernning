def cal_area (width , height) :
    area = width * height
    return area

x = int(input("width : "))
y = int(input("height : "))
area = cal_area(x,y)
print(area)