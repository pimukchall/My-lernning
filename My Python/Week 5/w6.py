#Tuple group of multiple value in same name
#Declare tuple use(), no change, no del member, seqence member cannot change

a = (1,2,3)
b = ()

List = [1,2,3,4]
#c = tuple(list)
d = tuple([7,8,9])
#e = tuple(10,11,12,13) #error นะจ๊ะ


#Function of tuple

A = (1,3,5,7,9)
print(a.index(5))
if 10 in a:
    print(a.index)
    
    
#Dictionnary(key,value)
#Ex
num = {0:'Zero', 1:'One', 2:'Two'}
country = {'th':'Thailand', 'fr':'France', 'jp':'Japan'}
odd_even = {'Odd': [1,3,5,7,9], 'Even': [2,4,6.,8,10]}


#Seek member
Thai = country['th']
print(Thai)
print(country['jp'])


#Member ref of dictionary
#Ex
country = {'th':'Thailand', 'fr':'France', 'jp':'Japan'}
for key in country:
    print(country[key])
    
Odd_even = {'Odd': [1,3,5,7,9], 'Even': [2,4,6,8,10]}
for key in Odd_even:
    print(key, ':', end='')
    for v in Odd_even(key):
        print(v,'',end = '')
    print()
    
    
#Apply dic with function and operator
#Dic can not use +,-,*,/ but can use in, not in 
#Ex
country = {'th':'Thailand', 'fr':'France', 'jp':'Japan'}
a = 'th' in country
b = 'jp' in country
if 'fr' not in country:
    print('Sorry')
    
del country['jp']
print(len(country))