def isbn(number) :
    temp = 0
    for i  in range(0,9) :
        if (number[i] == "0") :
            temp += 0
        else:
            temp += int(number[i]) * (10-i)

    print(temp)
    n = 0
    for j in range(0,9) :
        temp1 = temp+j
        if((temp1%11)==0) :
            n = j
            break

    return number + str(n)

ibn = input("Input ISBN : ")
print("ISBN:",isbn(ibn))



