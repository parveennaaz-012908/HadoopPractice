package domParseDemo;

public class EmployeeBean {

	private String name;
    private String gender;
    private int id;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    
    
    @Override
    public String toString() {
        return "Employee:: Name=" + this.name + " ID=" + this.id + " Gender=" + this.gender;
    }
    
}
