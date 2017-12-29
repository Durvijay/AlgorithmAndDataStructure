package com.journaldev.collections;

import java.util.Map;
import java.util.TreeMap;

public class dggd {

	public static void main(String[] args) {
		// System.out.println(rotate(11101011121213,7));
		// System.out.println(rotate(51505051525253,7));
		/*
		 * String a="addc"; String [][] strs= { { "bcd","1" }, { "abc","4" } };
		 * StringBuilder str=new StringBuilder(a);
		 * //System.out.println(a.substring(1)+" "+str.deleteCharAt(0)+" "+str.
		 * charAt(0)+" "+String.valueOf(a).to); Arrays.sort(strs[0]);
		 * System.out.println(strs[0][1]+ " "+strs[0][1]);
		 */
	/*	System.out.println(rank("anadama"));
		System.out.println(rank("nadamaa"));
		System.out.println(rank("nadamaan"));
		System.out.println(rank("aanadam"));*/
		TreeMap<Integer,String> map=new TreeMap();
		map.put( 1, "1" );   
        map.put( 2, "2" );   
        map.put( 4, "5" );   
        map.put( 7, "7" );   
        map.put( 9, "9" );   
            
     //   System.out.println(map.keySet());
        int temp=map.firstKey();
   //     System.out.println(temp);
       // map.headMap(1,true);
        map.tailMap(temp,false).clear(); // 5 is exclusive
       System.out.println(map.keySet());
		System.out.println(map.size());
	}

	public static  int rank(String str){
		int n = str.length(); 
		int rank = 0; 
		for (int i = 0; i < n-1; i++) { 
			int x=0; 
			for (int j = i+1; j<n ; j++) { 
				if (str.charAt(i) > str.charAt(j)) 
				x++; 
			} 
			rank = rank+ x*((n-i-1));
		} 

		return rank;
	}

	public static int getLargest(String str) {
		int max = 1;
		int start = 0;
		int aux = 0;
		int count = 1;
		boolean temp = false;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) >= str.charAt(i - 1)) {
				count++;
			} else {
				aux = i;
				count = 1;
			}
			if (count > max) {
				max = count;
				start = aux;
				if (temp)
					break;
			} else if (count == max && str.charAt(start + max - 1) < str.charAt(i)) {
				start = i - count - 1;

				if (temp)
					break;
			}
			if (i == str.length() - 1) {
				if (str.charAt(str.length() - 1) <= str.charAt(0) && count != str.length() - 1) {
					temp = true;
					count++;
					i = 0;
					if (count > max) {
						max = count;
						start = aux;
						if (temp)
							break;
					} else if (count == max) {
						if (str.charAt(start + max - 1) < str.charAt(i)) {
							start = i - count - 1;
						} else {
							start = aux;
						}
						if (temp)
							break;
					}
				}
			}
		}
		return start;
	}

	static int minRotate(String inscription) {
		int count = 0, temp = 0;
		int value, tempValue = inscription.charAt(0);
		int index = 0;
		int len = inscription.length();
		for (int i = 1; i < len; i++) {
			value = inscription.charAt(i);
			if (inscription.charAt(i) >= inscription.charAt(i - 1)) {
				temp++;
				int j = i;
				while (temp < len && inscription.charAt(j) >= inscription.charAt(j - 1)) {
					j++;
					temp++;

					if (j == len - 1) {
						if (inscription.charAt(len - 1) >= inscription.charAt(0)) {
							j = 1;
						}

					}

				}
				if (j < len && j >= i) {
					i = j;
				}

			}
			if (temp > count) {
				index = i;
				count = temp;

			} else if (temp == count && value <= tempValue) {
				index = i;
				tempValue = value;
			}
			if ((i - 1 + temp + 1) >= len) {
				i = len - 1;
			}
			temp = 0;

		}

		return index - 1;
	}

	static int rotate(long inscriptionVal, int len) {
		long min = inscriptionVal;
		int count = 0;
		for (int i = 0; i < len - 1; i++) {
			int rem = (int) (inscriptionVal % Math.pow(10, 2 * (len - 1)));
			int quo = (int) (inscriptionVal / Math.pow(10, 2 * (len - 1)));

			if ((inscriptionVal = rem * 100 + quo) < min) {
				count = i + 1;
				min = inscriptionVal;
			}
			System.out.println(rem + " " + quo + " " + min);
		}
		return count;
	}

}