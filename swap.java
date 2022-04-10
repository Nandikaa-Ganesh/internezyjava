import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        int a, b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Before swapping: ");
        System.out.println("A: "+a+" B: "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping: ");
        System.out.println("A: "+a+" B: "+b);
        obj.close();
    }
    
}
