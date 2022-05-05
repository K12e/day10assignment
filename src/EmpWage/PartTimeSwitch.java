package EmpWage;

import EmployeeWageProblems.PartTime;

public class PartTimeSwitch {
	private static final double case1 = 0;
	private static 	int issFullTime=1;
	private static int isPartTime=2;
	private  static int empRatePerHr=20;
	private static int empHrs=0;
	private static int empWage=0;
	
	
	public int getIssFullTime() {
			return issFullTime;
		}

		public void setIssFullTime(int issFullTime) {
			this.issFullTime = issFullTime;
		}

		public int getIsPartTime() {
			return isPartTime;
		}

		public void setIsPartTime(int isPartTime) {
			this.isPartTime = isPartTime;
		}

		public int getEmpHrs() {
			return empHrs;
		}

		public void setEmpHrs(int empHrs) {
			this.empHrs = empHrs;
		}

		public int getEmpWage() {
			return empWage;
		}

		public void setEmpWage(int empWage) {
			this.empWage = empWage;
		}

		public int getEmpRatePerHr() {
			return empRatePerHr;
		}

		public void setEmpRatePerHr(int empRatePerHr) {
			this.empRatePerHr = empRatePerHr;
		}
		
		

		
		
		
		@Override
		public String toString() {
			return "PartTime [issFullTime=" + issFullTime + ", isPartTime=" + isPartTime + ", empHrs=" + empHrs
					+ ", empWage=" + empWage + ", empRatePerHr=" + empRatePerHr + "]";
		}

	    public PartTimeSwitch(int issFullTime, int isPartTime, int empHrs, int empWage, int empRatePerHr) {
			this.issFullTime = issFullTime;
			this.isPartTime = isPartTime;
			this.empHrs = empHrs;
			this.empWage = empWage;
			this.empRatePerHr = empRatePerHr;
		}
		
	     public PartTimeSwitch() {
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
			int empcheck=(int) (Math.floor(Math.random()*10)%3);
			
			
			PartTime partTime =new PartTime();
	      partTime.getEmpHrs();
			partTime.getEmpRatePerHr();
			partTime.getEmpWage();
			
			partTime.getIssFullTime();
			partTime.getIsPartTime();
			
			switch (empcheck) 
			   {
		   (int) case 1: issFullTime=empHrs=8;
				 break;
				
			case 2:  isPartTime=empHrs=4;
				
			break;
			
			default:
				empHrs=0;
			}
				System.out.println("empcheck "+empcheck);
			}
		}
		


		




