import java.util.Scanner;

public class isbn {
    public static void main(String[] args){
        long num, count=1, sum=0, temp;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a 10-digit number: ");
        num = object.nextLong();
        for(count=1; count<11; count++){
            temp = num%10;
            sum = sum + temp*count;
            num = num/10;
        }
        if (sum%11==0){
            System.out.println("The given number is an ISBN number.");
        }
        else{
            System.out.println("The given number is not an ISBN number.");
        }
        object.close();
    }

    
    
}
