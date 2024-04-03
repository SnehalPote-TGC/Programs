package com;

import java.util.List;

public class OddEven {

	public static void main(String[] args) {
		int li[] = {2,3,4,5,6,7,8,9};
		
		for(int i =0; i<=li.length-1;i++) {
			if(li[i]%2==0) {
				System.out.println("Even " +li[i]);
			}else {
				System.out.println("odd " +li[i]);
			}
		}
		
	}

}
