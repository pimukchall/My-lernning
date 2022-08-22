#Function : clear(), get(key), pop(key)
#Ex 
country = {'th':'Thailand', 'fr':'France', 'jp':'Japan'}
for key in country:
    print(country[key])
    
#Ex 
if 'th' in country:
    print(country['th'])
    
#Ex get()
d = {'one':'หนึ่ง', 'two':'สอง', 'three':'สาม'}
print(d.get('three'))

x = d.pop('one')
print(x)
print(d)