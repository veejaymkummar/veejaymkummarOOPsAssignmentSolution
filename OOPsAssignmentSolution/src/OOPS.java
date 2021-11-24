class SuperDepartment 
{
	public String departmentName()
	{
		return "Super Department";
	}
	public String getTodaysWork()
	{
		return " No Work as of now";
	}
	public String getWorkDeadline()
	{
		return "Nil";
	}
	public String isTodayAHoliday()
	{
		return "Today is not a holiday";
	}
	
}
class AdminDepartment extends SuperDepartment
{
	public String departmentName()
	{
		return "Admin Department";
	}
	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD ";
	}
}
class HrDepartment extends SuperDepartment
{
	public String departmentName()
	{
		return "HR Department ";
	}
	public String getTodaysWork()
	{
		return "Fill today’s timesheet and mark your attendance";
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD ";
	}
	public String doActivity()
	{
		return "team Lunch";
	}
}
class TechDepartment extends SuperDepartment
{
	public String departmentName()
	{
		return "Tech Department ";
	}
	public String getTodaysWork()
	{
		return "Complete coding of module 1";
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD ";
	}
	public String getTechStackInformation()
	{
		return "core Java";
	}
}
public class OOPS {

	public static void main(String[] args) {
		//Creating objects 		
		AdminDepartment AD = new AdminDepartment();
		HrDepartment HR = new HrDepartment();
		TechDepartment TD = new TechDepartment();
		
		//Printing Admin Department Block of information
		System.out.println(" Welcome to " + AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday());
		
		//printing 4 blank lines for gap between messages
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
				
		//Printing HR Department Block of information
		System.out.println(" Welcome to " + HR.departmentName());
		System.out.println(HR.doActivity());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());
		System.out.println(HR.isTodayAHoliday());
		
		//printing 4 blank lines for gap between messages
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
						
		//Printing HR Department Block of information
		System.out.println(" Welcome to " + TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		String Stack = TD.getTechStackInformation();
		
		//Code to convert the first character of the stack to upper case as the return string has first character in lower case
		String OutputStackString = "";
		char ch = Character.toUpperCase(Stack.charAt(0));
		
		for (int i = 0; i < Stack.length(); i++) 
		{
			if (i == 0)
					{
				OutputStackString = OutputStackString +  ch;
					}
			else
			{
				OutputStackString = OutputStackString + Stack.charAt(i);
			}
		}
		System.out.println( " " + OutputStackString );
		System.out.println(TD.isTodayAHoliday());
	}

}
