import java.util.Scanner;

public class mystery {
    static int reversenum(int a){
        String s = Integer.toString(a);
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {    
            str=str+s.charAt(i);
        }
         
        int rev=Integer.parseInt(str);
        return rev;
    }
    public static void main(String[] args){
        int num, temp, sum, rev;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        for(int i=0;i<=num/2; i++){
            temp = i;
            rev = reversenum(i);
            sum = temp+rev;
            if(sum==num){
                System.out.println(temp+"+"+rev+"="+num);
                System.out.println("The entered number is a mystery number");
                break;
            }
            else if(i==num/2){
                System.out.println("The entered number is not a mystery number.");
            }
            else{
                continue;
            }

        }
        obj.close();

    }
}
