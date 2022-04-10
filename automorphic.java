import java.util.Scanner;

public class automorphic {
    public static void main(String[] args){
            Scanner obj = new Scanner(System.in);
            int num, square, digit1, digit2;
            System.out.println("Enter a number: ");
            num = obj.nextInt();
            square = num*num;
            digit1 = num%10;
            digit2 = square%10;
            if (digit1==digit2){
                System.out.println("The number is an automorphic number.");
            }
            else{
                System.out.println("The number is not an automorphic number.");
            }
            obj.close();
    }
}
