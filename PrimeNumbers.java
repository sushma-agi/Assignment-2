import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=0;
    int n=0;
    int count;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter n value");
    n=scan.nextInt();
    System.out.println("prime numbers between 1 to "+n+" are ");
    for(int j=2;j<=n;j++)
    {
    	
    count=0;
    for(i=1;i<=j;i++) {
    	if(j%i==0)
    	{
    		count++;
    	}
    }
    if(count==2)
    {
    	System.out.println(j+" ");
    }
    }
    }

}
