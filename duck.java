import java.util.Scanner;

public class duck {
    public static void main(String[] args){
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        if (num==0){
            System.out.println("The number is a duck number");
        }
        while (num>0){
            if(num%10==0){
                System.out.println("The number is a duck number");
                break;
            }
            else if(num<10){
                System.out.println("The number is not a duck number.");
            }
            num = num/10;
        }
        obj.close();
    }
    
}
