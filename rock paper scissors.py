import random

# enter what computer will choose
user_choice = int(input("Enter 0 for rock, 1 for scissors, 2 for paper "))

# computer's choice
computer_choice = random.randint(0,2)
print(f"computer chose {computer_choice}")

if computer_choice == user_choice:
    print("It's a draw")
elif computer_choice == 2 and user_choice == 0:
    print("computer wins")
elif computer_choice == 0 and user_choice == 2:
    print("you win")
elif computer_choice == 1 and user_choice == 0:
    print("YOu win")
elif computer_choice == 0 and user_choice == 1:
    print("computer wins")
elif computer_choice == 1 and user_choice == 2:
    print("computer wins")
elif computer_choice == 2 and user_choice == 1:
    print("you win")
else:
    print("wrong input")

