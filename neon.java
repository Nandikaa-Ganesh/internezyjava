import java.util.Scanner;

public class neon {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num, neon=0,rem, square;
        System.out.println("Enter a number ");
        num = obj.nextInt();
        square = num*num;
        while(square>0){
            rem = square%10;
            neon = neon + rem;
            square = square / 10;
        }
        if (neon==num){
            System.out.println("The number is a neon number");
        }
        else{
            System.out.println("The number is not a neon number.");
        }
        obj.close();
    }
    
}
