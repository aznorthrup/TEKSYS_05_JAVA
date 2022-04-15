package main.java;

public class main {
	public static void main(String[] args) {
		int count = 0;
		count++;
				
		int a = 2;
		int b = 4;
		int c = a + b;
		System.out.print("\nQuestion "+count+":\n");
		System.out.print(c);
		++count;

		double d = 6;
		double e = 8;
		double f = d + e;
		System.out.print("\nQuestion "+count+":\n");
		System.out.print(f);
		++count;
		
		int g = 10;
		double h = 12;
		int i = g + (int)h;
		System.out.print("\nQuestion "+count+":\n");
		System.out.print(i);
		++count;
		
		int j = 8;
		int k = 16;
		int l = k/j;
		System.out.print("\nQuestion "+count+":\n");
		System.out.print(l);
		++count;
		
		double m = 10;
		double n = 20;
		double o = n/m;
		System.out.print("\nQuestion "+count+":\n");
		System.out.print(o);
		System.out.print("\n");
		System.out.print((int)o);
		++count;
		
		int x = 5;
		int y = 6;
		double q = ((double)y/(double)x);
		System.out.print("\nQuestion "+count+":\n");
		System.out.print(q);
		System.out.print("\n");
		q = (double) y;
		System.out.print(q);
		++count;
		
		final int myFavNumber = 64;
		int anEighth = myFavNumber / 8;
		System.out.print("\nQuestion "+count+":\n");
		System.out.print(anEighth);
		++count;
		
		double muffin = 2.50;
		double coffee = 3.00;
		double tea = 1.50;
		double subtotal = 0;
		double totalSale = 0;
		final double SALES_TAX = .05;
		subtotal+=muffin;
		subtotal+=(coffee*2);
		subtotal+=(subtotal*SALES_TAX);
		totalSale+=subtotal;
		totalSale = (double) Math.round(totalSale*100)/100;
		System.out.print("\nQuestion "+count+":\n");
		System.out.println("Total for sale one: \n$"+totalSale);
		totalSale = 0;
		subtotal = 0;
		subtotal+=(tea*2);
		subtotal+=coffee;
		subtotal+=muffin;
		subtotal+=(subtotal*SALES_TAX);
		totalSale+=subtotal;
		totalSale = (double) Math.round(totalSale*100)/100;
		System.out.println("Total for sale two: \n$"+totalSale);
		
	}

}
