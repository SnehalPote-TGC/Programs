package com;

public class fibonocciSeriesUpTo100 {

	public static void main(String[] args) {
int n=100;
int n1=0;
int n2=1;
while(n1 <=n) {
	System.out.print(" " +n1);
	int n3=n1+n2;
	n1=n2;
	n2=n3;
	
}

	}

}
