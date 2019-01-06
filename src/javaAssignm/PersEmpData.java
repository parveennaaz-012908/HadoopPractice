package javaAssignm;

import java.util.ArrayList;
import java.util.List;

class AddedDataInArrayList{
	public static ArrayList addPersonData(){
		ArrayList person = new ArrayList();
		PersonData perD = new PersonData();
		perD.setFirstName("Asish");
		perD.setLastName("Rajput");
		perD.setPer_ID(1);
		perD.setAge(28);
		person.add(perD);
		//System.out.println(perD.toString());
		PersonData perD1 = new PersonData();
		perD1.setFirstName("Ashu");
		perD1.setLastName("Kumar");
		perD1.setPer_ID(2);
		perD1.setAge(30);
		person.add(perD1);
		//System.out.println(perD.toString());

		PersonData perD2 = new PersonData();
		perD2.setFirstName("Vikas");
		perD2.setLastName("Gupta");
		perD2.setPer_ID(3);
		perD2.setAge(29);
		person.add(perD2);

		PersonData perD3 = new PersonData();
		perD3.setFirstName("Vasant");
		perD3.setLastName("Rao");
		perD3.setPer_ID(4);
		perD3.setAge(36);
		person.add(perD3);

		PersonData perD4 = new PersonData();
		perD4.setFirstName("Prashant");
		perD4.setLastName("Shrivastava");
		perD4.setPer_ID(5);
		perD4.setAge(31);
		person.add(perD4);

		PersonData perD5 = new PersonData();
		perD5.setFirstName("Prabin");
		perD5.setLastName("Modi");
		perD5.setPer_ID(6);
		perD5.setAge(31);
		person.add(perD5);

		PersonData perD6 = new PersonData();
		perD6.setFirstName("Akash");
		perD6.setLastName("Rastogi");
		perD6.setPer_ID(7);
		perD6.setAge(34);
		person.add(perD6);

		PersonData perD7 = new PersonData();
		perD7.setFirstName("Gargi");
		perD7.setLastName("Mishra");
		perD7.setPer_ID(8);
		perD7.setAge(27);
		person.add(perD7);

		PersonData perD8 = new PersonData();
		perD8.setFirstName("Sweta");
		perD8.setLastName("Tiwari");
		perD8.setPer_ID(9);
		perD8.setAge(26);
		person.add(perD8);

		PersonData perD9 = new PersonData();
		perD9.setFirstName("Arti");
		perD9.setLastName("Choudhary");
		perD9.setPer_ID(10);
		perD9.setAge(25);
		person.add(perD9);

		//System.out.println(person.toString());
		return person;
	}

	public static ArrayList<EmpData> addEmpData(){
		ArrayList<EmpData> emp = new ArrayList<EmpData>();

		EmpData data = new EmpData();
		data.setEmp_ID(1);
		data.setFirstName("Asish");
		data.setLastName("Rajput");
		data.setSalary(90000.00);
		data.setDept("Development");

		EmpData data1 = new EmpData();
		data1.setEmp_ID(2);
		data1.setFirstName("Ashu");
		data1.setLastName("Kumar");
		data1.setSalary(35000.00);
		data1.setDept("Development");

		EmpData data2 = new EmpData();
		data2.setEmp_ID(3);
		data2.setFirstName("Vikas");
		data2.setLastName("Gupta");
		data2.setSalary(70000.00);
		data2.setDept("Development");

		emp.add(data);
		emp.add(data1);
		emp.add(data2);
		//System.out.println(emp.toString());
		return emp;
	}

}

public class PersEmpData {

	public static void main(String[] args) {

		AddedDataInArrayList obj = new AddedDataInArrayList();

		ArrayList <EmpData> empData = new ArrayList<EmpData>();
		empData=obj.addEmpData();

		ArrayList <PersonData>perData= new ArrayList<PersonData>();
		perData=obj.addPersonData();

		ArrayList <PersonData> list = new ArrayList<PersonData>();	
		
		list = removeDup(perData,empData);
		
		
		System.out.println("Last Data:" +list.toString());
	}
	
	static ArrayList<PersonData> removeDup(ArrayList<PersonData> perData, ArrayList<EmpData> empData)
	{
		for(int i=0;i<empData.size();i++)
		{
			String empFirstName = empData.get(i).getFirstName(),empLastName = empData.get(i).getLastName();
			for(int j=0;j<perData.size();j++){
				String perFirstName = perData.get(j).getFirstName(), perLastName = perData.get(j).getLastName();
				if(perFirstName.equalsIgnoreCase(empFirstName)&& perLastName.equalsIgnoreCase(empLastName))
					perData.remove(j);
			}
		}
		return perData;
	}
	
}
