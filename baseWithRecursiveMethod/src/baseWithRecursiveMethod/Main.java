package baseWithRecursiveMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int base, number;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Tabanı giriniz: ");
		number=scan.nextInt();
		
		System.out.print("Üs giriniz: ");
		base=scan.nextInt();
		
		System.out.println("Sonuç: "+power(number,base));
		
	}
	
	static int power(int number,int base) {
		if(base>0) {
			base--;
			return number*=power(number,base);	
		}else {
			return 1;
		}
		
	}

}
