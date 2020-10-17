package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

public static void main(String args[]) {
	ArrayList<Integer> al = new ArrayList<>();
	ArrayList<Integer> res = new ArrayList<>();
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Input with space");
    String s=sc.nextLine();
    String s1[]=s.split(" ");
    for (String string : s1) {
		al.add(Integer.valueOf(string));
    }
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
