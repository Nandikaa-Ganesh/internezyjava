import java.lang.Math;
import java.util.Scanner;
public class tech {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        double half1, half2, sum=0, result;
        int count=0, num, temp;
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        temp = num;
        while (num>0){
            count=count+1;
            num = num/10;
            //System.out.println(num);
        }
        num=temp;
        temp = count/2;
        //System.out.println(temp+" "+count);
        if (count%2==0){
            half1 = Math.round(num/(Math.pow(10,temp)));
            half2 = Math.round(num%(Math.pow(10,temp)));
            sum = half1+half2;
            //System.out.println(sum);
            result = sum*sum;
            //System.out.println(result);
            if (result==num){
                System.out.println("The number is a tech number");
            }
            else{
                System.out.println("The number is not a tech number");
            }

        }
        else{
            System.out.println("The number does not have even number of digits.");
        }
        obj.close();
    }
    
}
