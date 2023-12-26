import java.util.Scanner;
class Books
{
	String title;
	String author;
	int price;
	int num_pages;
	
	Books(String title,String author, int price, int num_pages)
	{	
		this.title=title;
		this.author=author;
		this.price=price;
		this.num_pages=num_pages;
	}	

	public String toString()
	{
		String title,author,price,num_pages;
		title="\nBook name: "+ this.title + "\n"; 
		author="Author name: "+ this.author +"\n";
		price= "Price: "+ this.price +"\n";
		num_pages= "Number of pages: "+this.num_pages ;
		return title + author + price + num_pages;
	}
}

class Main
{
	public static void main(String args[])	
	{
		Scanner s= new Scanner(System.in);
		int n,i;
		String title, author;
		int price, num_pages;
		
		System.out.println("Enter the no. of books: ");
		n= s.nextInt();

		Books b[];
		b = new Books[n];
		
		for( i=0 ; i<n ; i++)
		{
			System.out.println("Enter the title, author name, price and number of pages of book:");
			title= s.nextLine();
			author= s.nextLine();
			price= s.nextInt();
			num_pages= s.nextInt();
			b[i] = new Books(title,author,price,num_pages);
		}

		for( i=0 ; i<n ;i++)
		{		
			System.out.println(b[i]);
		}
	}
}
		
		
