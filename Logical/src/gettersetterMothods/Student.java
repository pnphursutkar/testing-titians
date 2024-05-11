package gettersetterMothods;

public class Student {

	int Roll_no;
	String name;
	String address;
	int mobileno;
	
	protected int password; // not created getter settter for this variable
	
	protected int getPassword() {
		return password;
	}

	protected void setPassword(int password) {
		this.password = password;
	}
	
	public int getRoll_no() {
		return Roll_no;
	}
	
	public void setRoll_no(int roll_no) {
		this.Roll_no = roll_no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getMobileno() {
		return mobileno;
	}
	
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	
	
	

	public static void main(String[] args) {
		
		// set value
		
		Student s1 = new Student();
		s1.setRoll_no(101);
		s1.setName("Ram");
		s1.setAddress("Pune");
		s1.setMobileno(12345);
		
		
		// get values
		
		System.out.println(s1.getRoll_no());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getMobileno());
		// set values
		
		Student s2 = new Student();
		s2.setRoll_no(102);
		s2.setName("sham");
		s2.setAddress("mumbai");
		s2.setMobileno(98765);
		
		// get vaules
		
		
		
	}

	
}
