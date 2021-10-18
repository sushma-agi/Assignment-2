import java.util.*;
public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int check,rem,sum=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=scan.nextInt();
    check=n;
    while(check!=0)
    {
    	rem=check%10;
    	sum=sum+(rem*rem*rem);
    	check=check/10;
    }
    if(sum==n)
    {
    	System.out.println("Armstrong number");
    	
   }
    else
    	System.out.println("not Armstrong number");
    
	}

}
