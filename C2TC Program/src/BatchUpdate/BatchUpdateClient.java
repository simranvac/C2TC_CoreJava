package BatchUpdate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import usingStatement.DBUtil1;

public class BatchUpdateClient {

	public static void main(String[] args) throws SQLExecption {
		// TODO Auto-generated method stub
		Connection connection=DBUtil.getConnection();
		if(connection !=null)
			 System.out.println("JDBC:connection is taken.");
		    
		   Statement st=connection.createStatement();
		   
		   String sql1="INSERT INTO employee_table(employee_id,employee_ame,email,esalary,bonus,doj)"+
		             "VALUES (9,'Simran','simi2104@gmail.com',6000,3000,'2022-02-08')";
		    st.addBatch(sql1);
		    
		    String sql2="update employee_Table set employee_name='Abhisekh' where employee_id=8";
		    st.addBatch(sql2);
		    
		    String sql3="delete from employee_table where employee_id=5";
		         st.addBatch(sql3);
		         
		         int i[]=st.executeBatch();
		         for (int j=0;j<i.length;j++)
		         {
		        	 System.out.println(j);
		        	   }
		         
		         try {
		        	 connection.close();
		        	 st.close();
		         }catch(Execption e) {
		        	 System.out.println
	 }
  }