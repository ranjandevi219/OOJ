import java.util.Scanner;
class Subject
{
	int marks;
	int credits;
	int grade;
}
class Student
{
	Subject sub[];
	String name;
	String usn;
	double SGPA;
	Scanner s;
	
	Student()
	{
		int i;
		sub=new Subject[8];
		for(i=0;i<8;i++)
			sub[i]=new Subject();
		s=new Scanner(System.in);
	}
	
	void getDetails()
	{
		System.out.println("Enter student name:");
		name=s.nextLine();
		System.out.println("Enter student usn:");
		usn=s.nextLine();
	}

	void getMarks()
	{
		int i;
		
		for(i=0;i<8;i++)
		{	
			System.out.println("Enter marks:");
			sub[i].marks = s.nextInt();
			System.out.println("Enter credits:");
			sub[i].credits = s.nextInt();
			if(sub[i].marks<40)
				sub[i].grade=0;
			else if(sub[i].marks>=40 && sub[i].marks<60)
				sub[i].grade=6;
			else if(sub[i].marks>=60 && sub[i].marks<70)
				sub[i].grade=7;
			else if(sub[i].marks>=70 && sub[i].marks<80)
				sub[i].grade=8;
			else if(sub[i].marks>=80 && sub[i].marks<90)
				sub[i].grade=9;
			else if(sub[i].marks>=90 && sub[i].marks<=100)
				sub[i].grade=10;
			else			
				sub[i].grade=0;
		}
	}
	
	double computeSGPA()
	{	
		int i=0;
		int n_sum=0,d_sum=0;
		int numerator,denominator;
		for(i=0;i<8;i++)
		{
			numerator= sub[i].credits * sub[i].grade;
			n_sum = n_sum + numerator;
			denominator= sub[i].credits;
			d_sum = d_sum + denominator;
		}
		SGPA= n_sum / d_sum;
		return (SGPA);
	}
}

class mainClass
{
public static void main(String args[])
{
	Student s1 = new Student();
	s1.getDetails();
	s1.getMarks();
	System.out.println("SGPA= "+s1.computeSGPA());
}}
	


		


			
	