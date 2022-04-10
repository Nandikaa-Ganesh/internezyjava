import java.util.Scanner;

public class nthprime {
    public static void main(String[] args)
	{
		System.out.println("Enter a number.");
		Scanner obj = new Scanner(System.in);
        int count = 0;
		int n = obj.nextInt();
        for (int i=2; i>=0; i++){
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
		if (f==0){
			count = count+1;
            if (count==n){
                System.out.println("The required prime number is: ");
                System.out.println(i);
                break;
            }
        }
	}
    obj.close();
}
    
}
