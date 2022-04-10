import java.util.Scanner;

public class spy {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num, sum=0, product=1, rem;
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        while(num>0){
            rem = num%10;
            sum = sum + rem;
            product = product*rem;
            num = num/10;
        }
        if (sum==product){
            System.out.println("The given number is a spy number");
        }
        else{
            System.out.println("The given number is not a spy number");
        }
        obj.close();
    }
    
}
