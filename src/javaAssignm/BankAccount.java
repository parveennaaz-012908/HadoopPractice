package javaAssignm;


class BankAccDetails{
	private  String depositor_name;
	private  long acc_num;
	private String acct_type;
	private double bal_amount;
	
	public String getDepositor_name() {
		return depositor_name;
	}
	public void setDepositor_name(String depositor_name) {
		this.depositor_name = depositor_name;
	}
	public long getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}
	public String getAcct_type() {
		return acct_type;
	}
	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}
	public double getBal_amount() {
		return bal_amount;
	}
	public void setBal_amount(double bal_amount) {
		this.bal_amount = bal_amount;
	}
	
	public void deposit(Long deposit_amt)
	{
		this.setBal_amount( this.getBal_amount()+deposit_amt);
	}
	public void withDraw(Double withD_amnt)
	{
		if(this.getBal_amount()!=0){
			this.setBal_amount(getBal_amount( )- withD_amnt);
		}
	}
	
	public void toDisplay()
	{
		System.out.println("Depositor Name:"+this.depositor_name + "\n"+ "Account No:"+this.acc_num+ "\n"
				+ "Account Type:"+this.acct_type + "\n"+ "Balance Amount :" +this.bal_amount);
	}
	
}
public class BankAccount {
	
public static void main(String[] args) {
	BankAccDetails bad= new BankAccDetails();
	 
}
}
