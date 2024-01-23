package CIE;
import java.util.Scanner;
public class student
{
	protected String usn = new String();
	protected String name = new String();
	protected int sem;
	public void inputDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student usn:");
		usn = s.next();
		System.out.println("Enter student name:");
		name = s.next();
		System.out.println("Enter student sem:");
		sem = s.nextInt();
	}
	
	public void displayDetails()
	{
		System.out.println("Student Details:\n");
		System.out.println("USN: "+usn);
		System.out.println("Name: "+name);
		System.out.println("Sem: "+sem);
	}
}

	
	