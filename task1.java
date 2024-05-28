import java.util.Random;
import java.util.Scanner;

class task1{
    public static void main(String[]args){
        int escore=0,hscore=0;
        Random rand  = new Random();
        Scanner s= new Scanner(System.in);
        
        System.out.println("*** WELCOME TO NUMBER GUESSING GAME ***");
        System.out.println("select your mode: ");
        System.out.println("1. Easy mode \n2. Hard mode");
        int opt = s.nextInt();
        while(opt==1 || opt==2){
            if(opt==1){
                easymode();
                escore++;
            }
            else if(opt==2){
                hscore=hardmode()+hscore;
            }
            System.out.println("Want to play again? ");
            System.out.println("1.Easy mode \n2.Hard mode \n3.Quit");
            opt = s.nextInt();
        }
        System.out.println("Your score in each modes: \n1.Easy mode score: "+escore+"\n2.Hard mode score: "+hscore);

    }

    public static void easymode() {
        int num, guess,chances=0;
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        num = rand.nextInt(1,100);
        System.out.println("enter your guess(1-100): ");
        guess = s.nextInt();
        if(guess == num){
            System.out.println("Your guess correct! You are the most luckiest person");
        }
        //easy mode has unlimited chances
        while(guess != num){
            if(guess>num){
                System.out.println("Your guess is greater than the number");
            }
            else if(guess <num){
                System.out.println("Your guess is smaller than the number");
            }
            System.out.println("Enter your guess(1-100): ");
            guess = s.nextInt();
            chances++;
            }
            if(guess == num){
                System.out.println("Your guess is correct! the NUMBER is: "+num);
                System.out.println("Number of chances taken: "+chances);
            }
        
    }

    public static int hardmode() {
        int score=0;
        int num, guess;
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        num = rand.nextInt(1,100);
        System.out.println("enter your guess(1-100): ");
        guess = s.nextInt();
        if(guess == num){
            System.out.println("Your guess correct! you are the most luckiest person!");
            return score++;
        }
        //hard mode has limited chances
        for(int i=1;i<=3;i++){
            if(guess>num){
                System.out.println("Your guess is greater than the number");
            }
            else if(guess == num){
                System.out.println("Your guess is correct the NUMBER is: "+num);
                System.out.println("Cleared in number of chances: "+ i);
                score++;
                break;
            }
            else if(guess <num){
                System.out.println("Your guess is smaller than the number");
            }
            System.out.println("your remaining chances: "+(3-i));
            System.out.println("enter your guess(1-100): ");
            guess = s.nextInt();
        }
        if(guess !=num){
            System.out.println("The number is: "+num);
        }
        else{
            System.out.println("Your guess is correct! you won! the number is: "+num);
        }
        return score;
    }
}