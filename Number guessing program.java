import java.util.Scanner;

class Number {
    public static void main(String args []){

        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int  userNumber=0;

        do{

            System.out.println("Guess the number (0-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("WOOHOO..CORRECT NUMBER!!");
                break;
            }

            else if(userNumber > myNumber){
                System.out.println("Your number is too large");
            }

            else{
                System.out.println("Your number is too small");
            }

        } while(userNumber >= 0);

        System.out.println("My number was : "+ myNumber);
    }
}
