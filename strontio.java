import java.util.Scanner;

public class strontio {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num, result, ten, hund;
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        result = num*2;
        result = result/10;
        ten = result%10;
        result = result/10;
        hund = result%10;
        if (ten==hund){
            System.out.println("The given number is Strontio number.");
        }
        else{
            System.out.println("The given number is not a Strontio number.");
        }
        obj.close();
    }
    
}
