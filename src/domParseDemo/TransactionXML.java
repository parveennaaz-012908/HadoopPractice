package domParseDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TransactionXML {
	
	public static FileWriter writer = null;
	private static final String COMMA_DELIMITER = ",";
	
    private static final String NEW_LINE_SEPARATOR = "\n";

    
    private static final String FILE_HEADER = "Customer_ID,Product_Name,Sales,Order_ID";

   public  static List<TransactionBean> transList = new ArrayList<TransactionBean>();
	public static void main(String[] args) throws ParserConfigurationException {
		String path = "F:\\Hadoop Training\\data set\\Datasets\\Transactions.xml";
		File xmlFile = new File(path);
		
		
	
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		
		try{
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(path);
			doc.getDocumentElement().normalize();
			System.out.println(doc);
			System.out.println("RootElement :"+doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Transaction");
			System.out.println(nodeList);
			
			
			for(int i=0; i<nodeList.getLength();i++)
			{
				transList.add(getTransaction(nodeList.item(i)));
			}
			for(TransactionBean trans :transList )
			{
				//System.out.println(trans.toString());
				//System.out.println(trans);
			}
			
			csvWriter();
			
			
			
		}
catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static TransactionBean getTransaction(Node node) {
		
		TransactionBean trb = new TransactionBean();
		if(node.getNodeType()== Node.ELEMENT_NODE){
			Element element = (Element) node;
			trb.setCust_id(element.getAttribute("Customer_ID"));
			trb.setProd_name(element.getAttribute("Product_Name"));
			//System.out.println("hello" +trb.getProd_name());
			trb.setSales(element.getAttribute("Sales"));
			trb.setOrder_id(element.getAttribute("Order_ID"));
		
			
		}
		return trb;
	}
	
	public static void csvWriter()
	{
		try {
			writer = new FileWriter("F:\\Hadoop Training\\data set\\Datasets\\transaction.csv");
			
			writer.append(FILE_HEADER.toString());
		    writer.append(NEW_LINE_SEPARATOR);
			
		    for (TransactionBean trans :transList)
		    {
		    	//writer.append("hello");
		    	writer.append(trans.getCust_id());
		    	writer.append(COMMA_DELIMITER);
		    	System.out.println(trans.getProd_name());
		    	writer.append(trans.getProd_name());
		    	writer.append(COMMA_DELIMITER);
		    	writer.append(trans.getSales());
		    	writer.append(COMMA_DELIMITER);
		    	writer.append(trans.getOrder_id());
		    	writer.append(COMMA_DELIMITER);
		        writer.append(NEW_LINE_SEPARATOR);

		    }
			             

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
