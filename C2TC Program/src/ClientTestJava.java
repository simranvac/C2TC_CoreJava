import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ClientTestJava {

	public static void main(String[] args) throws SQLExecption  {
		Connection connection=DBUtil.getConnection();
		if(connection !=null)
			System.out.println("JDBC:connection is taken..");
		Statement st=connection.createStatement();
		String sql="select* from employee_tale";
		ResultSet rs=st.executeQuery(sql);
		
		While(rs.next())/ TODO Auto-generated method stub
	}System.out.println(rs.getstring) (1));
	System.out.println(rs.getString (2));
	system.out.println(rs.getString(3));
	system.out.println(rs.getSting}(4));
	
	}
	try
	{connection.close();
	st.close;
	
	}
    catch(Execption e)
	{System.out.println(e));
	}
  }
}