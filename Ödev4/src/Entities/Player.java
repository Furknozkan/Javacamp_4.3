package Entities;

public class Player {
	private int id;
	private String FirstName;
	private String LastName;
	private String Age;
	private String İdenityİd;
	
	public Player(int id, String firstName, String lastName, String age, String İdenityyİd) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		İdenityİd = İdenityİd;
		
		}
	
	
	public Player() {
		
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getİdenityİd() {
		return İdenityİd;
	}

	public void setİdenityİd(String İdenityİd) {
		İdenityİd = İdenityİd;
	}

}
