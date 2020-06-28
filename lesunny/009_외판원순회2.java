package programmers;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;

public class Main{
	public static int calculate(int[] arr, int[][] cost) {
		int result = 0;
		for(int i=0;i<arr.length;i++) {
			//System.out.print(arr[i]+" ");
			int a = arr[i];
			int b;
			if(i+1>=arr.length) b = arr[0];
			else b = arr[i+1];
			
			if(cost[a][b]==0) return -1;
			else result+=cost[a][b];
		}
		return result;
	}
	public static int permutation(int[] perm, int[][] cost, int number) {
        int result=calculate(perm, cost);
		int max = -1;
        for(int i=1; i< number; i++) {
        	if(perm[i-1] < perm[i]) max = i;
        }
        	
        if(max==-1) {
        	return 0;
        }
        	
        int max2 = -1;
        for(int j=max ; j<number; j++) {
        	if(perm[max-1] < perm[j]) max2 = j;
        }
        	
        //swap i-1 <-> j
        int temp = perm[max-1];
        perm[max-1] = perm[max2];
        perm[max2] = temp;
        	
        ArrayList<Integer> tempArr = new ArrayList<>();
        for(int i=max ; i<number; i++) {
        	tempArr.add(perm[i]);
        }
        	
        Collections.reverse(tempArr);
        
        for(int i=max; i<number; i++) {
        	perm[i] = tempArr.get(i-max);
        }
        return result;
	}
	public static int factorial(int n) {
		if(n==1) return 1;
		else return n*factorial(n-1);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
    	int number = in.nextInt();
    	
    	int[][] cost = new int[number][number];
    	for(int i=0; i<number; i++) {
    		for(int j=0; j<number; j++) {
    			cost[i][j] = in.nextInt();
    		}
    	}
    	
    	int t = factorial(number);
    	int[] arr = new int[number];
    	for(int i=0;i<number;i++) {
    		arr[i] = i;
    		//System.out.print(arr[i]+" ");
    	}
    	
    	int result = 5000000;
    	for(int i=0; i<t;i++) {
    		int temp = permutation(arr, cost, number);
    		//System.out.println("temp : "+temp);
    		if(result>temp && temp!=-1 && temp!=0) {
    			result=temp;
    		}
    	}
    	System.out.println(result);
    }
}
