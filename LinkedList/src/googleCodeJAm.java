

public class googleCodeJAm {

	public static void main(String[] args) {
		String test="---+-++-";
		int k=3;
		char[] charArray=test.toCharArray();
		int testlength=charArray.length;
		int z=0;
//		test=String.valueOf(charArray);
		System.out.println(test.contains("-"));
		while (test.contains("-") && testlength!=0) {
			for (int i = 0; i < charArray.length; i++) {
				if(charArray[i]!="+".charAt(0)){
					for (int j = i; j < i+k; j++) {
						if(charArray[j]=="-".charAt(0)){
							charArray[j]="+".charAt(0);
						}else{
							charArray[j]="-".charAt(0);
						}
					}
					
					z++;
					testlength--;
					i=i+k;
				}
			}
			test=String.valueOf(charArray);
		}
		System.out.println(test);
		if (!test.contains("-")) {
			System.out.println(z);
		}else{
			System.out.println("IMPOSSIBLE");
		}
 		
	}
}
