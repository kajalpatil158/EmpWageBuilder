package empwagebuilder;
import java.util.Random;
public class EmpWageBuilderUC
{
	public static void main(String[] args)	
	{
		//Constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int Wage_Per_Hr=20;
		int WORKING_DAYS_FOR_MONTH=20;
		//Veriables
		int emp_hr;
		//Computation
		Random rand=new Random();
		int empCheck =rand.nextInt(3);
		switch (empCheck)
		{
		case  1:
				emp_hr=8;
				System.out.println("Employee is Present");
				break;
		case 2:
				emp_hr=4;
				System.out.println("Employee is Part Time");
				break;
		default:
				emp_hr=0;
				System.out.println("Employee is Absent");
				break;
		}
		int Wage = (emp_hr) * (Wage_Per_Hr);
		int Total_Wages=(emp_hr) * (Wage_Per_Hr)*(WORKING_DAYS_FOR_MONTH);
		System.out.println("Employee wages per hr is = "+Wage);
		System.out.println("Employee wages for month is = "+Total_Wages);
		
	}


}
