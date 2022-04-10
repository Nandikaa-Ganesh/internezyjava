import java.util.Scanner;
public class buzz {
    public static void main(String[] args){
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        if (num%7==0 || num%10==7){
            System.out.println("The number is a buzz number.");
        }
        else{
            System.out.println("The number is not a buzz number.");
        }
        obj.close();
    }
    
}
