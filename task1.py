tasks = []

def addtask():
    task = input("Please enter your task: ")
    tasks.append(task)
    print("Your task has been added! \n")


def showtasks():
    if tasks:
        for index,task in enumerate(tasks):
            print(index,".",task)  
        print("\n")
    else:
        print("There are no tasks to  display!\n")   


def deletetask():
    if tasks:
        showtasks()
        task = int(input("Please enter task index: "))
        tasks.pop(task)       
        print("the task has been removed from the List!\n")    
    else:
        print("Sorry! There are no tasks! \n")          

print("*** WELCOME TO TO-DO LIST ***")
while True:
    print("1. Add task")
    print("2. show tasks")
    print("3. Delete task")
    print("4. Exit\n")
    choice = int(input("Enter your choice: "))
    if choice==1:
        addtask()
    elif choice==2:
        showtasks()
    elif choice==3:
        deletetask()
    elif choice==4:
        print("Have a nive day! \n")
        break
    else:
        print("Invalid choice! \n")      


