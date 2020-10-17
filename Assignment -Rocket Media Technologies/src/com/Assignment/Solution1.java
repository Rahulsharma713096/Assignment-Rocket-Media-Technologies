package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Same solution with different input taking format
public class Solution1 {

public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
	ArrayList<Integer> al = new ArrayList<>();
	ArrayList<Integer> res = new ArrayList<>();
	int count=0;
	try {
		System.out.println("Enter number seprated with enter,when done Enter `q` to quit");
		while(sc.hasNextInt()) {
			al.add(sc.nextInt());
		}
	
} finally {
	Collections.sort(al);
	int i ,j,l=0;
	for (i=0;i<al.size();i=l) {
		count=0;
		for(j=i+1;j<al.size();j++) {
			if(al.get(i)==al.get(j)) {
				count++;
				l=j;
			}
		}
		if(count!=0)
		res.add(++count);
		else l++;
	}
	//Print Output
	 System.out.println(getOutput(res));
}
    sc.close();
}
static int getOutput(ArrayList<Integer> res) {
	int c=0;
	for (Integer i : res) {
			c+=i/2;	
	}
	return c;
	
}
}
