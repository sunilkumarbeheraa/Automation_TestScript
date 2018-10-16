package test.muvi6.com;

import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlTest {

    public static void main(String [] args) throws Exception
    {
        Class.forName( "com.mysql.jdbc.Driver" ); 
        
        // // edit the jdbc url 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
    	
    	//Connection conn = DriverManager.getConnection("jdbc:mysql://52.73.180.212:9010/muvi_user","root","just4now");
        
        //http://allthingsott.com:9010
        
        Statement st = conn.createStatement();
       ResultSet rs = st.executeQuery( "select * from muvitest" );
        

        System.out.println("Connected?");
        
        
        while (rs.next())
        	{
    		String myName = rs.getString(1);								        
            /*String myid = rs.getString(2);
            String malid = rs.getString(3);*/
            System. out.println(myName/*+" "+myid+" "+malid*/);	
            }		
	 // closing DB Connection		
	conn.close();
	
        
    }
}
