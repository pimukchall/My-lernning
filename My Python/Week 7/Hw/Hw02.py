num = int(input("Input Number : "))
temp = []
ans = 0
for i in range (1,num) :
    m1 = i%3
    m2 = i%5
    if m1 == 0 or m2 == 0 :
        temp.append(i)

for i in temp :
    ans+=i

print(temp)
print("Ans = ",ans)
