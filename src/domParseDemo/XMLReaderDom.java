package domParseDemo;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReaderDom {
	
	public static void main(String[] args) throws ParserConfigurationException {
		String path = "F:\\Hadoop Training\\data set\\Datasets\\employee.xml";
		File xmlFile = new File(path);
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder ;
		
		try {
			builder= factory.newDocumentBuilder();
			Document doc = builder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			//System.out.println("1");
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("employee");
			
			List <EmployeeBean> empList = new ArrayList<EmployeeBean>();
			for(int i =0; i<nodeList.getLength();i++)
			{
				//System.out.println("2");
				//System.out.println(empList+"3");
				empList.add(getEmployee(nodeList.item(i)));
				//System.out.println("10" +empList);
				}
			for (EmployeeBean emp : empList) {
                System.out.println(" value: "+emp.toString());
		}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
		public static EmployeeBean getEmployee(Node node){
			//System.out.println("4");
			EmployeeBean emp = new EmployeeBean();
			//System.out.println("5");
			if(node.getNodeType() == Node.ELEMENT_NODE){
				//System.out.println("7");
				Element element = (Element)node;
				//System.out.println("8");
				emp.setName(getTagValue("name", element));
				//System.out.println("9");
	            emp.setID(Integer.parseInt(getTagValue("id", element)));
	            emp.setGender(getTagValue("gender", element));
			}return emp;
		}
		
		public static String getTagValue(String tag, Element element)
		{
			//System.out.println("11");
			NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
			//System.out.println("12");
			//System.out.println(nodeList);
			Node node = (Node)nodeList.item(0);
					return node.getNodeValue();
		}

}
