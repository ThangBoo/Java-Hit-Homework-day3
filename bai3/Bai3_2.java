package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3_2 {

	 public static void delete(ArrayList<Integer> a, int index) {
	        if (index >= 0 && index < a.size()) {
	            a.remove(index);
	        }
	    }

	    public static void add(ArrayList<Integer> a, int index, int value) {
	        if (index >= 0 && index <= a.size()) {
	            a.add(index, value);
	        }
	    }

	    public static void dele_add() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();
	        ArrayList<Integer> a = new ArrayList<>();
	        System.out.print("Nhap mang: ");
	        for (int i = 0; i < n; i++) {
	            a.add(sc.nextInt());
	        }
	        System.out.print("Nhap vi tri can them: ");
	        int index = sc.nextInt();
	        System.out.print("Nhap gia tri can them: ");
	        int value = sc.nextInt();
	        add(a, index, value);
	        System.out.println(a);
	    }

	    public static void main(String[] args) {
	        dele_add();
	    }
}
