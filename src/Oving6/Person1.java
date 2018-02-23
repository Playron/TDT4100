package Oving6;

public class Person1 implements Named {

	
	String givenName;
	String familyName;
	
	public Person1(String givenName, String familyName) {
		this.givenName = givenName;
		this.familyName = familyName;
	}
	
	
	@Override
	public void setGivenName(String givenName) {
		this.givenName = givenName;
		
	}

	@Override
	public String getGivenName() {
		return this.givenName;
	}

	@Override
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	@Override
	public String getFamilyName() {
		return this.familyName;
	}

	@Override
	public void setFullName(String fullName) {
		int posisjon = getFullName().indexOf(" ");
		this.givenName = getFullName().substring(0, posisjon);
		this.familyName = getFullName().substring(posisjon + 1);
	}

	@Override
	public String getFullName() {
		return this.givenName + " " + this.familyName;
	}

	
	public static void main(String[] args) {
		
	}
}
