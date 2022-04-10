import java.util.Scanner;

public class evil {
    public static void main(String[] args){
        int num, count=0, temp;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        while (num>0){
            temp = num%2;
            if (temp==1){
                count=count+1;
            }
            num = num/2;
        }
        if (count%2==0){
            System.out.println("The number is an evil number");
        }
        else{
            System.out.println("The number is not an evil number.");
        }
        obj.close();
    }
    
}
