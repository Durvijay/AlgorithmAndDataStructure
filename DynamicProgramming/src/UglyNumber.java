
public class UglyNumber {

	public static void main(String[] args) {
		System.out.println(findUglyNo(356));

	}

	private static int findUglyNo(int n) {
		int uglyNo2=1,uglyNo3=1,uglyNo5=1,uglyNo=0,i=1;
		
		while(n>0){
			uglyNo=Math.min(Math.min(2*uglyNo2,3*uglyNo3),uglyNo5*5);
			if(uglyNo==uglyNo2*2){
				uglyNo2++;
			}else if(uglyNo==uglyNo3*3){
				uglyNo3++;
			}else if(uglyNo==uglyNo5*5){
				uglyNo5++;
			}
			n--;
		}
		return uglyNo;
	}

}
