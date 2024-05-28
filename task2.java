import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lang1,lang2,math,phy,che,soc;
        System.out.println("Enter Language 1 marks: ");
        lang1 = s.nextInt();
        System.out.println("Enter Language 2 marks: ");
        lang2 = s.nextInt();
        System.out.println("Enter Physics marks: ");
        phy = s.nextInt();
        System.out.println("Enter Chemistry marks: ");
        che = s.nextInt();
        System.out.println("Enter Social marks: ");
        soc = s.nextInt();
        int tot_marks =  lang1+lang2+phy+che+soc;
        int avg = tot_marks/6;
        System.out.println("Totak marks obtained by the student is: "+tot_marks);
        System.out.println("Average marks that user has obtained is: "+avg);
        if (avg<40){
            System.out.println("The student has failed in Examinations!\n The grade of Student is 'F'");
        }
        else if(avg<100 && avg>90){
            System.out.println("The student has passed with 'O' grade");
        }
        else if(90>avg && avg > 80){
            System.out.println("The student has passed with 'S' grade");
        }
        else if(80>avg && avg>70){
            System.out.println("The student has passed with 'A' grade");
        }
        else if(70>avg && avg>60){
            System.out.println("The student has passed with 'B' grade");
        }
        else if(60>avg && avg>50){
            System.out.println("The student has passed with 'C' grade");
        }
        else if(50>avg && avg>40){
            System.out.println("The student has passed with 'D' grade");
        }
    }
    
}
