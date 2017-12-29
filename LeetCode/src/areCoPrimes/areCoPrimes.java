package areCoPrimes;

import java.util.HashSet;

public class areCoPrimes {

	public static void main(String[] args) {
		System.out.println(areCoPrime(12, 46));

	}

	public static boolean areCoPrime(int firstNumber, int secondNumber) { 
		HashSet<Integer> set=new HashSet<>();
		for (int i = 2; i < firstNumber; i++) {
			if(firstNumber%2==0)
				set.add(i);
		}
		for (Integer integer : set) {
			if(secondNumber%integer==0)
				return false;
		}
		return true;
	}
}
