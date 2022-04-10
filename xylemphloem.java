import java.util.Scanner;

public class xylemphloem {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num, extr=0, mid=0, temp, digit;
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        temp = num;
        while (num>0){
            digit = num%10;
            if(num==temp || num<10){
                extr = extr + digit;
            }
            else{
                mid = mid + digit;
            }
            num = num/10;
        }
        if (extr==mid){
            System.out.println("The number is Xylem number.");
        }
        else{
            System.out.println("The number is Phloem number.");
        }
        obj.close();
    }
    
}
