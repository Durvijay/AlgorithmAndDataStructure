package PasswordCombination;

import java.util.HashMap;
import java.util.Map;

public class PasswordCombination {

	public static void main(String[] args) {
		Map<Character, Character> map=new HashMap<>();
		map.put('i', '!');
		map.put('a', '@');
		map.put('s', '$');
		map.put('o', '0');
		map.put('e', '3');
		generatePasswordCombinations("password", "", map);
	}
	
	static void generatePasswordCombinations(String s, String perm, Map<Character, Character> map) {
		if (s.equals("")) {
			System.out.println(perm);
			return;
		}		
		if (map.containsKey(s.charAt(0))) {
			generatePasswordCombinations(s.substring(1), perm + map.get(s.charAt(0)), map);
		} 
		generatePasswordCombinations(s.substring(1), perm + s.charAt(0), map);
	}


}
