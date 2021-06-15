import java.util.Scanner;
public class Pro7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter maximum limit of the array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter number of elements of the array: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("All the elements of the array: ");
		for(int i=0;i<n;i++) {
			
			System.out.print(a[i]+" ");
		}

	}

}
