package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import model.Student;
import view.P2;
import view.学生信息管理系统;
public class connenct {
	Student S;
	private java.sql.Statement stm;
	private Connection con;
	public void set(Student s) {
		 S=s;
	}
	public int  get(Student s)  {
		 S=s;
		int y= con();
		return y; 
	}
	public ArrayList<Student> select()
	{
		ArrayList<Student> AL=new ArrayList<Student>();
		String id=null;
		String name=null;
		float sx;
		float wl;
		float yy;
		ResultSet RS = null;
		java.sql.Statement smt2 = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=db","yangpeng","1234");
			 smt2 =  con.createStatement();
			String selectSql="select * from student";
			 RS= smt2.executeQuery(selectSql);
			while (RS.next()) {
				id=RS.getString(1);
				name=RS.getString(2);
				sx=(float) RS.getDouble(3);
				wl=(float) RS.getDouble(4);
				yy=(float) RS.getDouble(5);
				Student s=new Student(id, name, sx, wl, yy);
			   AL.add(s);	
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			if (con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if (smt2 !=null) {
				try {
					smt2.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		return AL;
	}
//删除
	public int  delect(String id)
	{
		int x = 0;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=db","yangpeng","1234");
			 stm=con.createStatement();
			String DeleteSql="delete from student where 学号="+id;
			x=stm.executeUpdate(DeleteSql);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (stm !=null) {
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return x;
	}
	public int  con() 
	{
	int x=0;
	//注册驱动器
	//com.mysql.jdbc.Driver DR=new Driver();
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=db","yangpeng","1234");
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		//  获取操作数据库对象
		
		try {
			stm = con.createStatement();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		String sql="INSERT INTO student(学号,姓名,数学成绩,物理成绩,英语成绩) VALUES('"+S.getId()+"','"+S.getName()+"','"+S.getMath()+"','"+S.getPhysical()+"','"+S.getEnglish()+    "')";//
		try {
			x=stm.executeUpdate(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	finally {
		try {
			stm.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		return x;
	}
 //实现查询展示在修改页面
	public Student select2(String ID)
	{
		Student s = null;
		String id=null;
		String name=null;
		float sx;
		float wl;
		float yy;
		ResultSet RS = null;
		java.sql.Statement smt2 = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=db","yangpeng","1234");
			 smt2 =  con.createStatement();
			String selectSql2="SELECT * FROM student WHERE 学号="+ID;
			 RS= smt2.executeQuery(selectSql2);
			/*while (RS.next()) {
				id=RS.getString(1);
				name=RS.getString(2);
				sx=(float) RS.getDouble(3);
				wl=(float) RS.getDouble(4);
				yy=(float) RS.getDouble(5);
				 s=new Student(id, name, sx, wl, yy);
			}*/
			 System.out.println(RS.getString(1));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			if (con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if (smt2 !=null) {
				try {
					smt2.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		return s;
	}
	//实现修改功能
	public int  updete(Student s) 
	{
	int x=0;
	//注册驱动器
	//com.mysql.jdbc.Driver DR=new Driver();
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=db","yangpeng","1234");
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		//  获取操作数据库对象
		try {
			stm = con.createStatement();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		String sql="UPDATE Student SET 数学成绩="+s.getMath()+","+"物理成绩="+s.getPhysical()+","+"英语成绩="+s.getEnglish()+"WHERE 学号="+s.getId();//
		try {
			x=stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	finally {
		try {
			stm.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	return x;
	}
	
}
