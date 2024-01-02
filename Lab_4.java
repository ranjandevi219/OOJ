import java.util.Scanner;

abstract class Shape
{
	int dim1;
	int dim2;
	Scanner s= new Scanner(System.in);
	abstract void printArea();
	abstract void input();
}

class Rectangle extends Shape
{
	void input()
	{
		System.out.println("Enter length and breadth:");
		dim1=s.nextInt();
		dim2=s.nextInt();
	}
	void printArea()
	{
		System.out.println("Area of rectangle= "+(dim1*dim2)+ " sq units");
	}
}

class Triangle extends Shape
{
	void input()
	{
		System.out.println("Enter base and height:");
		dim1=s.nextInt();
		dim2=s.nextInt();
	}
	void printArea()
	{
		System.out.println("Area of triangle= "+(dim1*dim2/2)+ " sq units");
	}
}

class Circle extends Shape
{
	void input()
	{
		System.out.println("Enter radius:");
		dim1=s.nextInt();
	}
	void printArea()
	{
		System.out.println("Area of circle= "+(3.14*dim1*dim1)+ " sq units");
	}
}

class Area
{
	public static void main (String args[])
	{
		Rectangle r= new Rectangle();
		Triangle t= new Triangle();
		Circle c= new Circle();
		Shape ref;
		ref=r;
		ref.input();
		ref.printArea();
		ref=t;
		ref.input();
		ref.printArea();
		ref=c;
		ref.input();
		ref.printArea();
	}
}
		



