package interviewprogram;

import java.util.Scanner;

public class Floydstrinagle {

	public static void main(String[] args) {
		int n,i,j,k=1;
		System.out.println("enter the number of line you need to floydstringle");
		Scanner as=new Scanner(System.in);
		n=as.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.println(" "+k++);
			}
			
			System.out.println();
		}
		
	}

}
