package empwagebuilder;

import java.util.Random;

public class EmpWageBuilderUC {
	// Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int Emp_Rate_Per_Hr = 20;
	public static final int WORKING_DAYS_FOR_MONTH = 20;
	public static final int TOTAL_WORKING_HR = 10;

	public static void main(String[] args) {
		// Veriables
		int empHr = 0;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		// Computation
		while (totalEmpHr <= TOTAL_WORKING_HR && totalWorkingDays < WORKING_DAYS_FOR_MONTH) {
			totalWorkingDays++;
			Random rand = new Random();
			int empCheck = rand.nextInt(3);
			switch (empCheck) {
			case IS_FULL_TIME:
				empHr = 8;
				break;
			case IS_PART_TIME:
				empHr = 4;
				break;
			default:
				empHr = 0;
				break;
			}
			totalEmpHr += empHr;
			System.out.println("Days" + totalWorkingDays + " Emplyee Hours is =" + empHr);
		}
		int Total_Emp_Wages = totalEmpHr * Emp_Rate_Per_Hr;
		System.out.println("Employee wages for month is = " + Total_Emp_Wages);
	}
}
