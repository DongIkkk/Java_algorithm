package baekjoon.basic;

import java.util.Scanner;

public class Sol10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num<min) min=num;
			if(num>max) max=num;
		}
		System.out.println(min + " " + max);
	}
}
