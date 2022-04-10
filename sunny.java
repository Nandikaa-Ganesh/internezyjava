import java.util.Scanner;
import java.lang.Math;

public class sunny {
    public static void main(String[] args){
        double num;
        double temp;
        double sqrot;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        temp = num + 1;
        sqrot = Math.sqrt(temp);
        num = sqrot*sqrot;
        if (num==temp){
            System.out.println("The number is a sunny number");
        }
        else{
            System.out.println("The number is not a sunny number.");
        }
        obj.close();
    }
    
}
