package bai3;

import java.util.Scanner;

public class Bai3_4 {
	public static void findContrastString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi doi xung: ");
		String s = sc.next();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println("False");
				System.exit(0);
			}
			++i;
			--j;
		}
		System.out.println("True");
	}
	public static void main(String[] args) {
		findContrastString();
	}
}
