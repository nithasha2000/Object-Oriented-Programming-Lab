import java.util.*;
public class Product
{
	int pcode;
	String pname;
	int price;
	public void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pcode : ");
		pcode = sc.nextInt();
		System.out.println("Enter the pname : ");
		pname = sc.next();
		System.out.println("Enter the price : ");
		price = sc.nextInt();
	}
	public void print()
	{
		System.out.println("Product details are : ");
		System.out.println("pcode : "+pcode);
		System.out.println("pname : "+pname);
		System.out.println("price : "+price);
	}
	public static void main(String args[])
	{
		Product p1 = new Product();
		p1.get();
		p1.print();
		Product p2 = new Product();
		p2.get();
		p2.print();
		Product p3 = new Product();
		p3.get();
		p3.print();
		if((p1.price < p2.price) && (p1.price < p3.price))
		{
			System.out.println("Least price product : "+p1.pname);
			System.out.println("price : "+p1.price);
		}
		else if((p2.price < p1.price)&&(p2.price < p3.price))
		{
			System.out.println("Least price product : "+p2.pname);
			System.out.println("price : "+p2.price);
		}
		else
		{
			System.out.println("Least price product : "+p3.pname);
			System.out.println("price : "+p3.price);
		}
	}
}
