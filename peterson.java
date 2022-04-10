import java.util.Scanner;

public class peterson {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num, fact, temp, rem, sum=0;
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        temp = num;
        while (num>0){
            rem = num%10;
            fact=1;
            while (rem>0){
                fact = fact*rem;
                rem--;
            }
            sum = sum+fact;
            num = num/10;
        }
        if (sum==temp){
            System.out.println("The given number is a peterson number.");
        }
        else{
            System.out.println("The given number is not a peterson number.");
        }
        obj.close();

    }
    
}
