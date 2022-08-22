import pandas as pd

list = [[9435 , "SOMSREE" , 95 , 51 , 159] , [9435 , "SOMSAK" , 69 , 71 , 177] , [9435 , "SOMBOON" , 56 , 90 , 181] , [9435 , "SOMJAI" , 48 , 42 , 161]]
bmilist = pd.DataFrame(list, columns= ["HOSPCODE" , "NAME" , "AGE" , "WEIGHT" , "HEIGHT"])

bmilist["BMI"] = bmilist ["WEIGHT"] / ((bmilist ["HEIGHT"] /100) ** 2)  
# print(bmilist)

print(bmilist[bmilist["BMI"] >22])