//LAB 2-- 1BM22CS219 --Ranjan Devi

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
	double n_sum=0;
	double d_sum=0;
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
		int numerator;
		for(i=0;i<8;i++)
		{	
			System.out.println("Enter marks:");
			sub[i].marks = s.nextInt();
			System.out.println("Enter credits:");
			sub[i].credits = s.nextInt();
			sub[i].grade=sub[i].marks//10+1;
			if(sub[i].grade<4 || sub[i].grade>10)
				sub[i].grade=0;
			numerator= sub[i].credits * sub[i].grade;
			n_sum = n_sum + numerator;
			d_sum = d_sum + sub[i].credits;
		}
	}
	
	void computeSGPA()
	{	
		SGPA= n_sum / d_sum;
		System.out.println("SGPA= "+SGPA);
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
	
/*OUTPUT:
Enter student name:
Ranjan
Enter student usn:
1BM22CS219
Enter marks:
94
Enter credits:
4
Enter marks:
92
Enter credits:
4
Enter marks:
93
Enter credits:
3
Enter marks:
88
Enter credits:
3
Enter marks:
92
Enter credits:
3
Enter marks:
91
Enter credits:
1
Enter marks:
92
Enter credits:
1
Enter marks:
93
Enter credits:
1
SGPA= 9.85   */

		


			
	