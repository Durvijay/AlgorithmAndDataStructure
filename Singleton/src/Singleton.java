
public class Singleton {

	private String firstName;
	private String lName;
	public static Singleton single;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(single==null){
			single=new Singleton();
			return single;
		}else{
			return single;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
}
