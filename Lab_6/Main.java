import SEE.externals;
class Main
{
	public static void main(String args[])
	{
		int num = 2;
		externals finalMarks[] = new externals[num];
		for(int i=0;i<num;i++)
		{
			finalMarks[i] = new externals();
			finalMarks[i].inputDetails();
			System.out.println("Enter CIE marks:");
			finalMarks[i].CIEmarks();
			System.out.println("Enter SEE marks:");
			finalMarks[i].SEEMarks();
		}
		System.out.println("Displaying data:\n");
		for (int i=0;i<num;i++)
		{
			finalMarks[i].calMarks();
			finalMarks[i].displayDetails();
			finalMarks[i].displayFinalMarks();
		}
	}
}

			