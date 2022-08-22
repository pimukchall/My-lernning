#Ref to item in list using loop
a = [1,True,'Three',4.5]
display(a)

b = [1,2,3,4,5,6,7]
for x in b:
    print(x,'',end='')
    
a = [1,2,3,4,5]
a = [x*10 for x in a]
b = [-1,2,3,4,-5]
b = [x for x in a if x%2==0] #b = [2.4]
c = [abs(x) for x in a if x<0] #c = [1,3,5]
