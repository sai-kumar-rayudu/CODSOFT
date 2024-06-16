import random # using random function to generate random charecters for password
import string # im going to use string built in method for charecters
password = []
print("\n**** WELCOME TO PASSWORD GENERATOR ****\n")

lenght = int(input("Enter password length: "))
use_uppercase = input("Include uppercase letters(y/n): ").strip().lower()=='y' #this line checks the input and assigns boolen value to variable
use_lowercase = input("Include lowercase letters(y/n): ").strip().lower()=='y'
use_digits = input("Include digits(y/n): ").strip().lower()=='y'
use_special = input("Include special charecters(y/n): ").strip().lower()=='y'

if use_lowercase:
    lower = string.ascii_lowercase
    password.append(random.choice(lower)) # lets make sure that atleast one charecter is includede in password
else:
    lower = ''
if use_uppercase:
    upper = string.ascii_uppercase
    password.append(random.choice(upper))
else:
    upper = ''
if use_digits:
    digits = string.digits
    password.append(random.choice(digits))
else:
    digits = ''
if use_special:
    special = string.punctuation
    password.append(random.choice(special))
else:
    special = ''

allchars = lower+upper+digits+special

if not allchars:
    print("Error no charecters are selected")
else:
    #lets fill the remaining space with desired chars randomly
    while len(password)<=lenght:
        password.append(random.choice(allchars))

    #shuffling letters in password for better results
    random.shuffle(password)

    #giving the resultant password as a string
    password = "".join(password)

    #printing resultant password
    print("\n Resultant password:",password,"\n")
