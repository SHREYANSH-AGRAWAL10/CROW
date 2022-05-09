import random
from art import logo
from art import stages
from words import word_list

print(logo)

lives = 6

word = random.choice(word_list)

a = []          #create empty list
for q in range(len(word)):
    a+="_"      #add underscores for the number of letters
print(a)

end_game = False
while not end_game:

    guess = input("guess a letter ")

    for position in range(len(word)):
        letter = word[position]
        if letter == guess:
            a[position] = letter
    print(a)

    if guess not in word:
        lives-=1
        if lives ==0:
            print("You lose")
            end_game = True

    if "_" not in a:
        print("win")
        end_game = True

    print(stages[lives])
