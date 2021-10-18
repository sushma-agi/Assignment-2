import java.util.Scanner;
public class CubesOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,n;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number");
    n=scan.nextInt();
    
    for(i=1;i<=n;i++)
    {
    	System.out.println(+i*i*i);
    }
    
	}

}
