from numpy import average
a = []
std = int(input("number of student : "))
    
for i in range(std):
    score = int(input("Student : "))
    a.append([score])
    
av = average (a)
print("Average score" , int(av))
    
print("Highest score : " ,max(a)[0])

b = []
c = []

for j in a:
    # print(j)
    if j[0] >= 5 :
        b.append([j])
        avhi = average (b)
    else :
        c.append([j])
        avlow = average (c)

print("Average high score" , int(avhi))
print("Average low score" , int(avlow))
        
