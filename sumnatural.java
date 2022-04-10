import java.util.Scanner;

public class sumnatural{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int sum=0, num;
        System.out.println("Enter n value:");
        num = obj.nextInt();
        System.out.println("The sum of first n natural numbers are: ");
        for(int i=1; i<=num; i++){
            sum = sum+i;
        }
        System.out.println(sum);
        //sum = num*(num+1)/2;
        System.out.println(sum);
        obj.close();
    }
    
}
