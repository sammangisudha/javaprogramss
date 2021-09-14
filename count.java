package countdigit;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter num");
		int num=sc.nextInt();
		while(num!=0) {
			num=num/10;
			count++;
			
		}
		
		System.out.println(+count);
	}

}
