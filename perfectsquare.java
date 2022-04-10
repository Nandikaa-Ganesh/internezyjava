import java.util.Scanner;
class perfectsquare { 
    public static void main(String[] args)  
    { 
	System.out.print("Enter any number:");
	Scanner scanner = new Scanner(System.in);
	double num = scanner.nextDouble(); 
	scanner.close();
    double sq = Math.sqrt(num); 
	if ((sq - Math.floor(sq)) == 0) 
		System.out.print(num+ " is a perfect square number"); 
	else
		System.out.print(num+ " is not a perfect square number"); 
    } 
}