import java.util.ArrayList;
import java.util.List;

public class friuts {

	public static void main(String[] args) {
		List<String> pattern=new ArrayList<>();
		pattern.add("O");
		pattern.add("#");
		pattern.add("A");
		pattern.add("ANY");
		pattern.add("#");
		pattern.add("B");		
		pattern.add("O");
		pattern.add("A");
		pattern.add("#");
		pattern.add("B");
		List<String> shopping =new ArrayList<>();
		shopping.add("O");
		
		shopping.add("A");
		shopping.add("W");
		shopping.add("C");
		shopping.add("A");
		shopping.add("A");
		shopping.add("B");		
		shopping.add("O");
		shopping.add("A");
		shopping.add("B");
		
		int fdx=0,i=0,temp=0;
		while (i<shopping.size()) {
			if(shopping.get(i)==pattern.get(fdx) || pattern.get(fdx)=="ANY"){
				temp=fdx;
				while (fdx<pattern.size() && pattern.get(fdx)!="#" && i<shopping.size()) {
					
					if(shopping.get(i)!=pattern.get(fdx) && pattern.get(fdx)!="ANY"){
						fdx=temp;
						break;
					}
					i++;
					fdx++;
				}
				i--;
				fdx++;
			}
			i++;
		}
		if(fdx==pattern.size()+1)
			System.out.println(1);
		else
			System.out.println(0);



	}

}
