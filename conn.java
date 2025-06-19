
package hotel.management.system;




import java.sql.*;  

public class conn{
    Connection c=null;
    Statement s=null;
    public conn(){  
        try{    
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306,jdbc","root","Anuj@123"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

