package javaAssignm;

public class EmpData {
private String firstName ;
private String lastName;
private int emp_ID;
private double salary;
private String dept;
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
public int getEmp_ID() {
	return emp_ID;
}
public void setEmp_ID(int emp_ID) {
	this.emp_ID = emp_ID;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String toString(){
	  return ( "Employee ::" +"\n"+
			  "Emp_ID:"+this.getEmp_ID()+"\t"+
			  "FirstName:"+this.getFirstName()+
			  "\t"+"LastName:"+ this.getLastName()+
			   "\t"+"Dept:" + this.getDept()+
			   "\t"+"Salary:"+this.getSalary()+"\n");
}
}
