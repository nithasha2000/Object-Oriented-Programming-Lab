import java.util.*;
public class Complex
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real part of 1st complex number : ");
		int r1 = sc.nextInt();
		System.out.println("Enter the imaginary part of 1st complex number : ");
		int i1 = sc.nextInt();
		System.out.println("Enter the real part of 2nd complex number : ");
		int r2 = sc.nextInt();
		System.out.println("Enter the imaginary part of 2nd complex number : ");
		int i2 = sc.nextInt();
		System.out.println("1st Complex Number : "+r1+"+"+i1+"i");
		System.out.println("2nd Complex Number : "+r2+"+"+i2+"i");
		System.out.println("Adding 2 complex numbers : "+(r1+r2)+"+"+(i1+i2)+"i");
	}
}