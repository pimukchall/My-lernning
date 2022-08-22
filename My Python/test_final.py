# print((9.5*4.5-2.5*3)/(45.5-3.5))

# a = int(input("input number : "))
# b = int(input("input number : "))
# c = int(input("input number : "))
# -----------------------------------------------------------------

# number = [a,b,c]
# print(min(number))
# print(max(number))

# -----------------------------------------------------------------
# from pandas import array
# n = int(input("input number : "))
# list1 = []
# for i in range(n):
#     list1.append(int(input("input : ")))
# print(list1)

# end = 'end'

# while (True) :
#     k = input("input : ")
#     if k == end :
#      break 

# -----------------------------------------------------------------
# number = 123
# sum_of_digits = 0 
# for digit in str(number):
#   sum_of_digits += int(digit)
  
# print(sum_of_digits)
 
 
# -----------------------------------------------------------------    
# from random import randint
# def t1(length):
#     t = [randint(0,100) 
# for i in range(length)]
#     t.sort()
#     return t
# L = t1(5)
# print("Left : ",L)
# R = t1(5)
# print("Right : ",R)
# arr = L + R
# arr.sort()
# print("Merged: ",arr)


# -----------------------------------------------------------------
# import random

# ran_end = random.randint(1,9)
# print(ran_end)

# while (True) :
#         k = int(input("Your guess : "))
#         if k == ran_end : 
#             break 


# -----------------------------------------------------------------
# price = int(input("input Price : "))
# money = int(input("Your Money : "))
# bank = [1000,500,100,50,20,10,5,2,1]
# total = money - price

# for i in bank:
#     if total >= i:
#         print("{} บาท = {}".format(i, int(total / i)))
#         total = total % i
# -----------------------------------------------------------------


# from operator import length_hint
# demo = open('C:\\Users\Pimuk\Documents\My Python\Week 7\demofile.txt')

# content = demo.readline()
# print (content)

# content_list = content.split()
# print(content_list)

# content_count = {}
# for i in content_list:
#     if i in content_count :
#         content_count[i] += 1
#     else:
#         content_count[i] = 1
    
# print(content_count)

# content_list.sort()
# print(content_list)

# score = open("studentScore.txt", "r")
# dict = {
#     "Name" : [],
#     "Score" : []
# }
# for line in score:
#     row = line.split()
#     dict["Name"].append(row[0])
#     dict["Score"].append(int(row[1]))
# ans = {
#     "Name" : [],
#     "Score" : []
# }
# print(dict)
# ans["Score"] = dict["Score"].copy()
# ans["Score"].sort()
# ans["Score"].reverse()
# li = dict["Score"].copy()
# for i in range(0,len(ans["Score"])) :
#     for j in range(0,len(ans["Score"])) :
#         if ans["Score"][i] == dict["Score"][j] :
#             ans["Name"].insert(0,dict["Name"][j])
# ans["Name"].reverse()
# temp = []
# for i in ans["Name"]:
#     if i not in temp:
#         temp.append(i)
# ans["Name"] = temp
# print(ans)

import pandas as pd
from matplotlib import pyplot as plt
def fillDefaults(dataset):
    for col in dataset.columns:
        if col == None :
            dataset[col] = "1"
    return dataset
def AverageSd(dataset):
    sd = dataset.sd()
    avr = sd.mean()
    return avr
data = pd.read_csv("ex.csv")
data = fillDefaults(data)
AverageSd = AverageSd(data)
print("Average of standard deviation = ", AverageSd)
plt.plot(data["total_profit"],c="r")
plt.plot(data["total_units"],c="b")
plt.show()