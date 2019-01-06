package javaAssignm;

public class PersonData {
	
	private String firstName ;
	private String lastName ;
	private int per_ID;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPer_ID() {
		return per_ID;
	}
	public void setPer_ID(int per_ID) {
		this.per_ID = per_ID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
  public String toString(){
	  return ( "Person :: " +
			  "Person_ID:"+this.getPer_ID()+"\t"+
			  "FirstName:"+this.getFirstName()+
			  "\t"+"LastName:"+ this.getLastName()+
			   "\t"+"Age:" + this.getAge()+"\n");
  }
}
