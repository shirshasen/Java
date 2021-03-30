package first_project;
import java.util.Scanner;
public class first {
	public static void main(String[] args) {
		int english,java,db,springTools;
		System.out.println("Enter English Marks ");
		Scanner sc =new Scanner(System.in);
		english=sc.nextInt();
		System.out.println("Enter Java Marks ");
		Scanner sc1 =new Scanner(System.in);
		java=sc1.nextInt();
		System.out.println("Enter DBMS Marks ");
		Scanner sc2 =new Scanner(System.in);
		db=sc2.nextInt();
		System.out.println("Enter Spring Tools Marks ");
		Scanner sc3 =new Scanner(System.in);
		springTools=sc3.nextInt();
		int totalMarks = (english+java+db+springTools);
		System.out.println("Total Marks="+totalMarks);
		int avg=totalMarks/4;
		System.out.println("Average Marks="+avg);

}
}
