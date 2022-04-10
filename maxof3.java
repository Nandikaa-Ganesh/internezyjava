import java.util.Scanner;

public class maxof3 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a, b, c, t, max;
        System.out.println("Enter 3 numbers:");
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        t = (a>b)?a:b;
        max = (t>c)?t:c;
        System.out.println("The maximum of 3 numbers is: "+max);
        obj.close();
    }
    
}
