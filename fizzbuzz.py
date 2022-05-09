# wap that prints the solution of the game between numbers 1 to 100
# when no. is divisible by 3, print fizz
# when no. is divisible by 5, print buzz
# when no. is divisible by 3 and 5, print fizzbuzz

for i in range(1,101):
    if i%3 == 0 and i%5==0:
        print("fizzbuzz")
        continue

    elif i%3 == 0:
        print("fizz")

    elif i%5==0:
        print("buzz")

    else:
        print(i)
