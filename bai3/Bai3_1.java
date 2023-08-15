package bai3;

import java.util.Scanner;

public class Bai3_1 {
	public static void amountNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int[] a = new int [n];
        int max = 0;
        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            a[tmp]++;
            max = tmp > max ? tmp : max;
        } 
        for(int i = 0; i <= max; i++){
            if(a[i] > 0){
                System.out.println("So " + i + " xuat hien " + a[i] + " lan" );
            }
        }
	}
	public static void main(String[] args)
	{
		amountNumber();
	}
}
