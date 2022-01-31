package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int count=0;
	int N = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> list1 = new ArrayList<>(N);
        String[] a = scanner.nextLine().split(" ");
        for (int i=0; i<a.length; i++){
            list1.add(Integer.valueOf(a[i]));
        }
        for (int k=1; k< list1.size();k++){
            if (list1.get(k)>list1.get(k-1)){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
