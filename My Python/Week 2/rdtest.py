import random
coin = random.randint(0,100)
for i in range(7):
    guess = int(input("guess : "))
    if guess == coin:
        print(" Bingo ")
        break;
    if guess < coin:
        print(" too low ")
    else:
        print("too high ")