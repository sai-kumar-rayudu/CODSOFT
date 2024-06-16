if __name__=="__main__":
    print("*** WWELCOME TO CALCULATOR ***")
    a= int(input("Enter the first number: "))
    b= int(input("Enter the second number: "))
    opt = input("Enter your desired operator(+,-,*,/): ")
    if opt == '+':
        print("Addition of two numbers is:",a+b)
    elif opt== '-':
        print("Substraction of two numbers is:",a-b)
    elif opt=='/':
        if b!=0:
            print("Division of two numbers is:",a/b)
        else:
            print("zero division is not possible!")
    elif opt == '*':
        print("Multiplication of two numbers is:",a*b)
    else:
        print("Invalid operator!")    
