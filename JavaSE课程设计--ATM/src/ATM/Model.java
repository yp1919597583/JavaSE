package ATM;

public class Model {
	String  AccountNumber="123456";
	String  password="123456";
	String  surplus="0";
	public Model(String  AccountNumber,String  password) {

		this.AccountNumber=AccountNumber;
		this.password=password;
		
	}
	
	
	public String getSurplus() {
		return surplus;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setSurplus(String surplus) {
		this.surplus = surplus;
	}
	
	
	
	
	
	
}
