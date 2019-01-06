package domParseDemo;

public class TransactionBean {
	
	private String cust_id;
    private String prod_name;
    private String sales;
    private String order_id;
    
        
    public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}




	@Override
    public String toString() {
        return "Transaction:: Customer_ID=" + this.cust_id + " Product_Name=" + this.prod_name + "Sales=" + this.sales + 
        		"Order_id=" +this.order_id;
    }
}
