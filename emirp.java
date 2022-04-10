import java.util.Scanner;

public class emirp {
    public static void main(String[] args){
            int rev=0, rem=0;
            int num=0;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the number: ");
            num = obj.nextInt();
            while (num!=0){
                rem = num%10;
                rev = rev*10+rem;
                num = num/10;
            }
            int i = rev;
            int j = 2;
            int f = 0;
            while (j<=(i/2))
                {
                if (i%j==0)
                {
                    f=1;
                }
                j+=1;
                }
            if (f==0)
                {System.out.println("The given number is an emirp number.");}
            else
            {System.out.println("The given number is not emirp number.");}

            obj.close();
    
        }
    
}

