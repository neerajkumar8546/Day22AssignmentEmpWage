public class EmpWageBuilder{
	public static final int is_Part_Time=1;
	public static final int is_Full_Time=2;
	
	public static void calculateEmpWage(String companyname,int emp_Rate_Per_Hrs,int num_Of_Working_Days,int max_Hrs_In_Month)
	{
		
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0,totalEmpWage=0;
		
		while (totalEmpHrs<=max_Hrs_In_Month && totalWorkingDays<num_Of_Working_Days)
		{
			
			totalWorkingDays++;
			int check=(int)Math.floor(Math.random()*10)%3;
			switch(check)
			{
				
				case is_Full_Time:
					empHrs=8;
					break;
				case is_Part_Time:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs=totalEmpHrs+empHrs;
			System.out.println("Day "+ totalWorkingDays + "Emp. Hrs. "+empHrs);
			
		}
		totalEmpWage=totalEmpHrs*emp_Rate_Per_Hrs;
		System.out.println("Total EmpWage for "+ companyname + " =" +totalEmpWage);
		
	}
	
	public static void main(String[] args)
	{
		calculateEmpWage("Bridgelabz",10,2,10);
		 calculateEmpWage("BigBazar",15,4,15);

	}
}
