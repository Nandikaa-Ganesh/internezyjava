import java.util.Scanner;

public class posneg {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        float num;
        System.out.println("Enter a number");
        num = obj.nextFloat();
        if (num>=0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is negative.");
        }
        obj.close();
    }
    
}
