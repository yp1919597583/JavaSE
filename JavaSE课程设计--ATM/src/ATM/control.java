package ATM;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class control {
	static String AccountNumber;
	java.sql.Statement sta;
	Connection con;
	ResultSet st;
	boolean flage=false;
	ArrayList<Model> AL=new ArrayList<>();
	public boolean LoginAuthentication(String  user,String  password) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/acount","root","yp18783819559");
			sta=con.createStatement();
			String selectsql="Select * from card";
			st= sta.executeQuery(selectsql);
			while (st.next()) {
				String  user1=st.getString(1);
				String  password1=st.getString(2);
				Model M=new Model(user1, password1);
				AL.add(M);
			}
			
		for (Model model : AL) {
          if (model.AccountNumber.equals(user)  & model.password.equals(password)) {
				flage=true;
				AccountNumber=model.AccountNumber;
				
			}
		}
					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flage;
		
	}
	
	public String  Quey() {
		String accountNumber = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/acount","root","yp18783819559");
			sta=con.createStatement();
			String selectsql="Select surplus from card where user="+AccountNumber;
			st= sta.executeQuery(selectsql);
			while (st.next()) {
				accountNumber=st.getString("surplus");			
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return accountNumber;
	
	}
	
	public void teller(int num) {
		int num2=Integer.parseInt( Quey()) ;
		
		String  num3=Integer.toString( num2-num);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		try {
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/acount","root","yp18783819559");
			sta=con.createStatement();
			String selectsql="UPDATE card SET surplus="+num3+" WHERE USER="+AccountNumber;
			 sta.executeUpdate(selectsql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public int   deposite(int num)
	{
		int x = 0;
        int num2=Integer.parseInt( Quey()) ;
		
		String  num3=Integer.toString( num2+num);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		try {
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/acount","root","yp18783819559");
			sta=con.createStatement();
			String selectsql="UPDATE card SET surplus="+num3+" WHERE USER="+AccountNumber;
			 x=sta.executeUpdate(selectsql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return x;
		
	}
	
	
	public int  ChangeCode(String newpassword)
	{
		int x=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	

		try {
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/acount","root","yp18783819559");
			sta=con.createStatement();
			String selectsql="UPDATE card SET password="+newpassword+" WHERE USER="+AccountNumber;
			x= sta.executeUpdate(selectsql);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return x;
		
	}
	
	
	
	
	
	
	
	
	
	
}
