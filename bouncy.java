import java.util.Scanner;

public class bouncy {
    public static void main(String[] args){
        int num, trend, t1, t2, bouncy=1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        t1 = num%10;
        num = num/10;
        t2 = num%10;
        if (t1>t2){
            //System.out.println("Decreasing");
            trend = 1;
        }
        else{
            //System.out.println("Increasing");
            trend = 2;
        }
        switch(trend){
            case 1:{
                while(num>0){
                    num = num/10;
                    t1 = t2;
                    t2 = num%10;
                    if (t1>t2){
                        //System.out.println("Decreasing");
                        bouncy=1;
                        continue;
                    }
                    else{
                        //System.out.println("Increasing");
                        bouncy = 0;
                        break;
                    }
                }
            }
            case 2:{                
            while(num>0){
                num = num/10;
                t1 = t2;
                t2 = num%10;
                if (t1<t2){
                    //System.out.println("Increasing");
                    bouncy=1;
                    continue;
                }
                else{
                    //System.out.println("Decreasing");
                    bouncy = 0;
                    break;
                }
            }
            }
        }
        //System.out.println(bouncy);
        if (bouncy==0){
            System.out.println("The number is a bouncy number");
        }
        else{
            System.out.println("The number is not a bouncy number");
        }
        obj.close();
    }
    
}
