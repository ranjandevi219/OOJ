package CIE;
import java.util.Scanner;

public class internals extends student
{
	protected int marks[] = new int[5];
	public void CIEmarks()
	{
		Scanner s= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Subject "+(i+1)+" marks");
			marks[i] = s.nextInt();
		}
	}
}