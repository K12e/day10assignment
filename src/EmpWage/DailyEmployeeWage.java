package EmpWage;

public class DailyEmployeeWage {
	private static int empHrs=0;
	private static int empRatePerHr=20;
	private static int isFullTime=1;
	private static int EmpWge=0;
	
	public int getEmpHrs() {
		return empHrs;
	}
	public void setEmpHrs(int empHrs) {
		this.empHrs = empHrs;
	}
	public int getEmpRatePerHr() {
		return empRatePerHr;
	}
	public void setEmpRatePerHr(int empRatePerHr) {
		this.empRatePerHr = empRatePerHr;
	}
	public int getIsFullTime() {
		return isFullTime;
	}
	public void setIsFullTime(int isFullTime) {
		this.isFullTime = isFullTime;
	}
	public int getEmpWge() {
		return EmpWge;
	}
	public void setEmpWge(int empWge) {
		EmpWge = empWge;
	}
	
	
	@Override
	public String toString() {
		return "DailyEmployeeWage [isFullTime=" + isFullTime + "]";
	}
	public DailyEmployeeWage(int empHrs, int empRatePerHr, int isFullTime, int empWge) {
		super();
		this.empHrs = empHrs;
		this.empRatePerHr = empRatePerHr;
		this.isFullTime = isFullTime;
		EmpWge = empWge;
	}
	public static void main(String[] args) {
		double empcheck=Math.floor(Math.random()*10)%2;
		
		if(empcheck==EmpWge) {
			empHrs=8;
			empcheck=empHrs*empRatePerHr;
			System.out.println("empWge "+EmpWge);
			
			
			}
		DailyEmployeeWage  dailyEmployeeWage =new DailyEmployeeWage(8,20,1,0);
		System.out.println("dailyempWage "+dailyEmployeeWage);
}
	
}