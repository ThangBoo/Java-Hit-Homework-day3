package bai3;

import java.util.Scanner;
import java.util.Arrays;

public class Bai3_3 {

	public static void sortNumber() {
		System.out.print("n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Nhap mang: ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		sortNumber();

	}
}
