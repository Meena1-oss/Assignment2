import java.util.Scanner;
public class Pro12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s1= sc.nextLine();
		String s2[]=s1.split(" ");
		String s3=" ";
		for(int i=0;i<s2.length;i++) {
			s3=s3+s2[s2.length-1-i];
		}
		System.out.print(s3);
	}

}