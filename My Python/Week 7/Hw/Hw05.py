
start = 25
end = 50
prime = []

for i in range (start,end+1) :
     if ( i%2 != 0 and i%3 != 0 and i%5 != 0 and i%7 != 0) : prime.append(i)

print("Prime Number :",prime)

