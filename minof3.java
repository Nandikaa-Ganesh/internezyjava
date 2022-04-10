import java.util.Scanner;

public class minof3 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a, b, c, t, min;
        System.out.println("Enter 3 numbers:");
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        t = (a<b)?a:b;
        min = (t<c)?t:c;
        System.out.println("The minimum of 3 numbers is: "+min);
        obj.close();
    }
    
}
