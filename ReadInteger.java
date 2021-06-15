import java.util.Scanner;
public class Pro11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			n=n%10;
			sum=sum+n;
			n=n/10;
		}
		System.out.println(sum);

	}

}