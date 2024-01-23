package SEE;
import CIE.internals;
import java.util.Scanner;
public class externals extends internals
{
	protected int marks[];
	protected int finalMarks[];
	public externals()
	{
		marks = new int[5];
		finalMarks = new int[5];
	}
	public void SEEMarks()
	{
		Scanner s= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Subject "+(i+1)+" marks:");
			marks[i] = s.nextInt();
		}
	}
	
	public void calMarks()
	{
		for(int i=0;i<5;i++)
			finalMarks[i] = marks[i]/2 + super.marks[i];
	}
	
	public void displayFinalMarks()
	{
		for(int i=0;i<5;i++)
			System.out.println("Subject "+(i+1)+": "+finalMarks[i]);
	}
}