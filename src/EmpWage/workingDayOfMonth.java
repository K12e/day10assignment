package EmpWage;

import EmployeeWageProblems.PartTime;

public class workingDayOfMonth {

	private static 	int issFullTime=1;
	private static int isPartTime=2;
	private  static int empRatePerHr=20;
	private  static int noofworkingday=2;
	private  static  int maxHrsInMonth=10;
	

	public static int getIssFullTime() {
		return issFullTime;
	}
	public static void setIssFullTime(int issFullTime) {
		workingDayOfMonth.issFullTime = issFullTime;
	}
      public static int getIsPartTime() {
		return isPartTime;
	   }
        public static void setIsPartTime(int isPartTime) {
		workingDayOfMonth.isPartTime = isPartTime;
	}
    public static int getEmpRatePerHr() {
		return empRatePerHr;
	}
   public static void setEmpRatePerHr(int empRatePerHr) {
		workingDayOfMonth.empRatePerHr = empRatePerHr;
	} 
   public static int getNoofworkingday() {
		return noofworkingday;
	}
 public static void setNoofworkingday(int noofworkingday) {
		workingDayOfMonth.noofworkingday = noofworkingday;
	}
		public static int getMaxHrsInMonth() {
		return maxHrsInMonth;
	}
    public static void setMaxHrsInMonth(int maxHrsInMonth) {
		workingDayOfMonth.maxHrsInMonth = maxHrsInMonth;
	}

    public String toString() {
		return "workingDayOfMonth [empcheck=" + empcheck + ", partTime=" + partTime + "]";
	}

   public workingDayOfMonth(double empcheck, PartTime partTime) {
		super();
		this.empcheck = empcheck;
		this.partTime = partTime;
	}

   double empcheck=Math.floor(Math.random()*10)%3;
			
			
			PartTime partTime =new PartTime();
	     
			if(empcheck==issFullTime) {
				empHrs=8;
			}
			else if(empcheck==isPartTime) {
				empHrs=4;
				empWage=empHrs * empRatePerHr;
				System.out.println("empWage "+empWage);
			}
			
			System.out.println("empcheck "+empcheck);
			
		}


}
