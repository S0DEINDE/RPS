import random


def convert(inp):
    randomizer = "RPS"
    return randomizer[inp]


def conv_ascii(contestant):
    if contestant == "P":
        return "📃"
    elif contestant == "R":
        return "🪨"
    elif contestant == "S":
        return "✂️"
    else:
        return " "


def winner(x, y, namer):
    if x == y:
        print("DRAW")

    elif x == 'R' and y == 'P':
        print("CPU Wins")
    elif x == 'R' and y == 'S':
        print(namer + " Wins")

    elif x == 'P' and y == 'R':
        print(namer + " Wins")
    elif x == 'P' and y == 'S':
        print("Computer Wins")

    elif x == 'S' and y == 'R':
        print("Computer Wins")
    elif x == 'S' and y == 'P':
        print(namer + " Wins")


def main():
    print("Welcome to ")
    print('''~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    
    ~~~~~~~~~~~~~~~~  ROCK, PAPER, SCISSORS! ~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ''')
    namer = input("What is your name?")

    user = input(namer + " Rock, Paper or Scissors?(Rock(R),Paper(P) or Scissors(S):")
    user.upper()
    cpu = random.randint(0, 2)
    computer = convert(cpu)
    print(conv_ascii(user), " VS ", conv_ascii(computer))
    winner(user, computer, namer)
    print("Thanks for playing")

    print("~~~~~~~~~~~~~~~~~~~~~THANKS FOR USING MY PROGRAM!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")


main()
