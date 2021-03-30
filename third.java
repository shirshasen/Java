package first_project;
import java.util.Scanner;
public class third {
public static void main(String[] args) {
	int x;
	System.out.println("Enter date");
	Scanner sc =new Scanner(System.in);
	x=sc.nextInt();
	if(x==1) {
		System.out.println("1st");
	}
	else if(x==2)
		System.out.println("2nd");
	else if(x==3)
		System.out.println("3rd");
	else if(x==21)
		System.out.println("21st");
	else if(x==22)
		System.out.println("22nd");
	else if(x==23)
		System.out.println("23rd");
	else if(x<31)
	{
		System.out.println(x+"th");
	}
	else {
		System.out.println("Wrong input");
	}
}
}
