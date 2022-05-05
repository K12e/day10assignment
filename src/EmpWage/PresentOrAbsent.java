package EmpWage;

public class PresentOrAbsent {
	
	private static int isFullTime=1;
	
	public PresentOrAbsent(int isFullTime) {
		super();
		this.isFullTime = isFullTime;
	}

	public int getIsFullTime() {
		return isFullTime;
	}

	public void setIsFullTime(int isFullTime) {
		this.isFullTime = isFullTime;
	}

	public static void main(String[] args) {
		double empcheck=Math.floor(Math.random()*10)%2;
		
		if(empcheck==isFullTime)
		{
			System.out.println("employee is present");
		}
		else {
			System.out.println("employee is Absent");
		}
		
		PresentOrAbsent presentOrAbsent=new PresentOrAbsent(20);
		
	}
}
