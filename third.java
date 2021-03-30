package first_project;
import java.util.Scanner;
public class third {
public static void main(String[] args) {
	int x;
	System.out.println("Enter date");
	Scanner sc =new Scanner(System.in);
	x=sc.nextInt();
	if(x==1 || x==21) {
		System.out.println(x+"st");
	}
	else if(x==2 || x==22)
		System.out.println(x+"nd");
	else if(x==3 || x==23)
		System.out.println(x+"rd");
	else if(x<31)
	{
		System.out.println(x+"th");
	}
	else {
		System.out.println("Wrong input");
	}
}
}
