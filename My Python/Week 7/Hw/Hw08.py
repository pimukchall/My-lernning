num = input("Input Number :")
li_st = num.split()
li_int = [int(i) for i in li_st]
li_int.sort()
li_int.pop(0)
li_int.pop(len(li_int) - 1)
ans = sum(li_int)
print(ans)

