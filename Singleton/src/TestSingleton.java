
public class TestSingleton {

	public static void main(String[] args) {
		/*Singleton objA=Singleton.getInstance();
		objA.setFirstName("vijay");
		
		Singleton ObjB=Singleton.getInstance();
		
		System.out.println(objA.getFirstName()+" "+ObjB.getFirstName());
*/
		char [] arr={'a','b','c'};
		System.out.println(reverseString(arr));
	}
	
	public static char[] reverseString(char [] str){
		
		for(int i=0;i<str.length/2;i++){
			char temp=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=temp;
		}
		return str;
		
	}

}
