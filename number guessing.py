import random

def check_ans(n):
    a = int(input("Make a guess"))
    if a>n:
        print("low")
    elif a<n:
        print("high")
    else :
        print("nice")

print("Welcome to Number Guessing game")
n = random.randint(0,100)
print(n)
choice = input("Enter hard, medium or easy")

if(choice == "hard"):
    i=5
    while i!=0:
        check_ans(n)
        i-1

if(choice == "medium"):
    i=10
    while i!=0:
        check_ans(n)
        i-1

if(choice == "easy"):
    i=15
    while i!=0:
        check_ans(n)
        i-1
