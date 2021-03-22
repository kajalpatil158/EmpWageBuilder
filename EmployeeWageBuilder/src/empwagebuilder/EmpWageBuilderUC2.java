package empwagebuilder;

public class EmpWageBuilderUC2 
{
	public static void main(String[] args)	
	{
		//Constants
		int IS_FULL_TIME = 1;
		int Wage_Per_Hr=20;
		//Veriables
		int emp_hr;
		//Computation
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_TIME)
		{
			emp_hr=8;
			System.out.println("Employee is Present");
		}
		else
		{
			emp_hr=0;
			System.out.println("Employee is Absent");
		}
		int Wage = (emp_hr) * (Wage_Per_Hr);
		System.out.println("Employee wages per hr is = "+Wage);
		//System.out.println(Wage);
	}


}
