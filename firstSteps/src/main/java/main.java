package main.java;

public class main {
	public static void main(String[] args) {
		/*
		 * int count = 0; count++;
		 * 
		 * int a = 2; int b = 4; int c = a + b;
		 * System.out.print("\nQuestion "+count+":\n"); System.out.print(c); ++count;
		 * 
		 * double d = 6; double e = 8; double f = d + e;
		 * System.out.print("\nQuestion "+count+":\n"); System.out.print(f); ++count;
		 * 
		 * int g = 10; double h = 12; int i = g + (int)h;
		 * System.out.print("\nQuestion "+count+":\n"); System.out.print(i); ++count;
		 * 
		 * int j = 8; int k = 16; int l = k/j;
		 * System.out.print("\nQuestion "+count+":\n"); System.out.print(l); ++count;
		 * 
		 * double m = 10; double n = 20; double o = n/m;
		 * System.out.print("\nQuestion "+count+":\n"); System.out.print(o);
		 * System.out.print("\n"); System.out.print((int)o); ++count;
		 * 
		 * int x = 5; int y = 6; double q = ((double)y/(double)x);
		 * System.out.print("\nQuestion "+count+":\n"); System.out.print(q);
		 * System.out.print("\n"); q = (double) y; System.out.print(q); ++count;
		 * 
		 * final int myFavNumber = 64; int anEighth = myFavNumber / 8;
		 * System.out.print("\nQuestion "+count+":\n"); System.out.print(anEighth);
		 * ++count;
		 * 
		 * double muffin = 2.50; double coffee = 3.00; double tea = 1.50; double
		 * subtotal = 0; double totalSale = 0; final double SALES_TAX = .05;
		 * subtotal+=muffin; subtotal+=(coffee*2); subtotal+=(subtotal*SALES_TAX);
		 * totalSale+=subtotal; totalSale = (double) Math.round(totalSale*100)/100;
		 * System.out.print("\nQuestion "+count+":\n");
		 * System.out.println("Total for sale one: \n$"+totalSale); totalSale = 0;
		 * subtotal = 0; subtotal+=(tea*2); subtotal+=coffee; subtotal+=muffin;
		 * subtotal+=(subtotal*SALES_TAX); totalSale+=subtotal; totalSale = (double)
		 * Math.round(totalSale*100)/100;
		 * System.out.println("Total for sale two: \n$"+totalSale);
		 */
		int count = 0;
		++count;
		System.out.print("\nQuestion " + count + ":\n");
		System.out.println("0001\n1000\n0010 0001\n0100 1110\n0011 0001 0011\n1000 0100 1100 0011\n");
		++count;

		System.out.print("\nQuestion " + count + ":\n");
		System.out.println("2\n9\n52\n114\n543\n11367\n");
		++count;

		System.out.print("\nQuestion " + count + ":\n");
		System.out.print("\nx is 2:\n");
		int x = 2; // 0010
		System.out.print(Integer.toBinaryString(x));
		int y = x << 1;
// I believe it will print 4 aka 0100
		System.out.println("\n" + y + "\n");
		String z = Integer.toBinaryString(y);
		System.out.println("\n" + z + "\n");
		System.out.println("\n");

		System.out.print("\nx is 9:\n");
		System.out.print(Integer.toBinaryString(x = 9));
		y = x << 1;
// I believe it will print 18 aka 0001 0010
		System.out.println("\n" + y);
		z = Integer.toBinaryString(y);
		System.out.println(z + "\n");

		System.out.print("\nx is 17:\n");
		System.out.print(Integer.toBinaryString(x = 17));
		y = x << 1;
// I believe it will print 34 aka 0010 0010
		System.out.println("\n" + y);
		z = Integer.toBinaryString(y);
		System.out.println(z + "\n");

		System.out.print("\nx is 88:\n");
		System.out.print(Integer.toBinaryString(x = 88));
		y = x << 1;
// I believe it will print 176 aka 1011 0000
		System.out.println("\n" + y);
		z = Integer.toBinaryString(y);
		System.out.println(z + "\n");

		count++;

		System.out.print("\nQuestion " + count + ":\n");
		System.out.print("\nx is 150:\n");
		System.out.print(Integer.toBinaryString(x = 150));
		y = x >> 1;
// I believe it will print 75 aka 0100 1011
		System.out.println("\n" + y);
		z = Integer.toBinaryString(y);
		System.out.println(z + "\n");

		System.out.print("\nx is 225:\n");
		System.out.print(Integer.toBinaryString(x = 225));
		y = x >> 1;
// I believe it will print 112 aka 0111 0000
		System.out.println("\n" + y);
		z = Integer.toBinaryString(y);
		System.out.println(z + "\n");

		System.out.print("\nx is 1555:\n");
		System.out.print(Integer.toBinaryString(x = 1555));
		y = x >> 1;
// I believe it will print 777 aka 0011 0000 1001
		System.out.println("\n" + y);
		z = Integer.toBinaryString(y);
		System.out.println(z + "\n");

		System.out.print("\nx is 32456:\n");
		System.out.print(Integer.toBinaryString(x = 32456));
		y = x >> 1;
// I believe it will print 16228 aka 0011 1111 0110 0100
		System.out.println("\n" + y);
		z = Integer.toBinaryString(y);
		System.out.println(z + "\n");
		count++;

		System.out.print("\nQuestion " + count + ":\n");
		x = 7;
		y = 17;
// I believe that a bitwise & operation on x and y will present 1, i.e. 0111 & 0001 0001 = 0001 aka 1
		System.out.println((x & y));
// I believe that a bitwise | operation on x and y will present 23, i.e. 0111 | 0001 0001 = 0001 0111 aka 23
		System.out.println((x | y) + "\n");
		count++;

		System.out.print("\nQuestion " + count + ":\n");
		int d = 1;
		System.out.println(d + "\n");
		d++;
		System.out.println(d + "\n");
		count++;

		System.out.print("\nQuestion " + count + ":\n");
		int q = 1;
		System.out.println(q + "\n");
		q++;
		System.out.println(q + "\n");
		q += 1;
		System.out.println(q + "\n");
		q = q + 1;
		System.out.println(q + "\n");
		count++;

		System.out.print("\nQuestion " + count + ":\n");
		x = 5;
		y = 8;
		int sum = ++x + y;
		System.out.println(sum+"\n");
		sum = x++ + y;
		System.out.print(sum);

	}

}
