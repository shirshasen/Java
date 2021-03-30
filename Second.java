package first_project;
import java.util.Scanner;
public class Second {
	public static void main(String[] args) {
		double basicSal,hra,da,totalSal,tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		basicSal= sc.nextDouble();
	
		hra= basicSal*0.4;
		da= 0.6*(basicSal+hra);
		
		totalSal= (basicSal+hra+da)*12;
		
		if(totalSal<200000)
			tax=0;
		else if(totalSal>=200000 && totalSal<=600000)
			tax= totalSal*0.1;
		
		else
			tax=(totalSal*0.2);
		
		double takeHomeSalary= totalSal-tax;
		System.out.println("Total SALARY= "+totalSal);
		System.out.println("HRA= "+hra);
		System.out.println("DA= "+da);
		System.out.println("TAX= "+tax);
		System.out.println("TAKE HOME SALARY= "+takeHomeSalary);
		
	}

}
