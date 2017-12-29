import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class AmazonCode2Cuisine {
	static class Pair implements Comparable<Pair>{
		String pairKey;
		String pairValue;
		
		Pair(String pairKey, String pairValue) {
			this.pairKey = pairKey;
			this.pairValue = pairValue;
		}

		public String getPairKey() {
			return pairKey;
		}

		public String getPairValue() {
			return pairValue;
		}
		
		public String toString() {
			return getPairKey() + " " + getPairValue();
		}

		@Override
		public int compareTo(Pair pair) {
			int compare = pairKey.compareTo(pair.getPairKey());
			if(compare == 0) {
				compare = pairValue.compareTo(pair.getPairValue());
			}
			return compare;
		}
	}
	
	
	static Map<String, List<String>> createMap(List<Pair> lunchMenuPairs) {
	    Map<String, List<String>> lunchMenuPair = new HashMap<String, List<String>>();
		lunchMenuPair.put("*", new ArrayList<String>());
		
		for (Pair lunchMenu : lunchMenuPairs) {
	        String menuItem = lunchMenu.getPairKey();
	        String itemCuisine = lunchMenu.getPairValue();
	        
	        if (!lunchMenuPair.containsKey(itemCuisine)) {
	            List<String> items = new ArrayList<String>();
	            items.add(menuItem);
	            lunchMenuPair.put(itemCuisine, items);
	        } else {
	            lunchMenuPair.get(itemCuisine).add(menuItem);
	        }
	        lunchMenuPair.get("*").add(menuItem);
		}
		return lunchMenuPair;
	}
	
	static List<Pair> solve(List<Pair> lunchMenuPairs, List<Pair> teamCuisinePreferencePairs){
		List<Pair> result = new LinkedList<Pair>();
		
		Map<String, List<String>> lunchMenuPair = createMap(lunchMenuPairs);
		
		for (Pair cuisinePrefPair : teamCuisinePreferencePairs) {
		    String person = cuisinePrefPair.getPairKey();
		    String preferredCuisine = cuisinePrefPair.getPairValue();
		        
	        if (lunchMenuPair.containsKey(preferredCuisine)) {
	            for (String menuItem : lunchMenuPair.get(preferredCuisine)) {
	                result.add(new Pair(person, menuItem));
	            }
		    }
		}
		return result;
	}

	private static void readAndSetParameters(List<Pair> lunchMenuPairs, List<Pair> teamCuisinePreferencePairs) {
		int lunchMenuPairCount = -1;
		int teamCuisinePreferencePairCount = -1;
		
		String tempOption = null, tempOptionValue = null;;
		try(Scanner in = new Scanner(System.in)) {
			lunchMenuPairCount = in.nextInt();
			while(lunchMenuPairCount > 0) {
				lunchMenuPairCount--;
				
				tempOption = in.next();
				tempOptionValue = in.next();
				Pair pair = new Pair(tempOption, tempOptionValue);
				lunchMenuPairs.add(pair);
			}
			
			teamCuisinePreferencePairCount = in.nextInt();
			while(teamCuisinePreferencePairCount > 0) {
				teamCuisinePreferencePairCount--;
				
				tempOption = in.next();
				tempOptionValue = in.next();
				Pair pair = new Pair(tempOption, tempOptionValue);
				teamCuisinePreferencePairs.add(pair);
			}
		}
	}
	
	private static void print(List<?> resultPairs) {
		for (Object pair : resultPairs) {
			System.out.println(pair);
		}
	}

	public static void main(String[] args){
		List<Pair> lunchMenuPairs = new LinkedList<>();
		List<Pair> teamCuisinePreferencePairs = new LinkedList<>();
		readAndSetParameters(lunchMenuPairs, teamCuisinePreferencePairs);
		List<Pair> result = solve( lunchMenuPairs, teamCuisinePreferencePairs );
		Collections.sort(result);
		print(result);
	}
}