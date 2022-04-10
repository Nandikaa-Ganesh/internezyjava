import java.util.Scanner;

public class krishnamurthy {
    public static void main(String[] args){
        int num,temp, fact, sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = obj.nextInt();
        temp = num;
        while (num>0){
            fact=1;
            for(int i=num%10; i>=1; i--){
                fact = fact*i;
            }
            //System.out.println(fact);
            sum = sum + fact;
            num = num/10;
        }
        //System.out.println(sum);
        if (temp==sum){
            System.out.println("The number is a krishnamurthy number.");
        }
        else{
            System.out.println("The number is not a krishnamurthy number.");
        }
        obj.close();
        

    }
    
}
