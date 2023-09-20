package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a value to find all prime numbers up to the value!");
		int n = in.nextInt();

		boolean [] primeNumbers = new boolean [n]; 
		for (int i = 0; i < primeNumbers.length; i++) //can use n or length 
		{
			primeNumbers [i] = true;
			//System.out.println(primeNumbers[i]);
		}
		for (int j=2;j*j<n; j++ ) {
			if (primeNumbers[j]==true) {
				for (int x= j*j; x<n; x+=j) {
                primeNumbers[x]=false;
				}

			}
for (int check=0; check<n; check++) {
	if (primeNumbers[check] == true) {
		System.out.println(check+1);
	}
	
}
		}
		}
	}
