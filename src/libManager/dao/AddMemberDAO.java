package libManager.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import libManager.MailService;
import libManager.bean.AddMemberBean;

public class AddMemberDAO {
	Connection con;
	Statement stmt;
	ResultSet rs;
	public AddMemberDAO(){
		try{  
			/*Class.forName("com.mysql.jdbc.Driver");    
			con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/test","test",""); */
			con=DAO.getConnection(); 
			System.out.println(con); 
			stmt=con.createStatement();  
			}catch(Exception e)
				{ 
					System.out.println(e);
				}  
			  
			}
	
	public void addMember(AddMemberBean amb){
		String query="INSERT INTO `test`.`members` (`s_id`, `s_name`, `books_limit`, `no_of_books`, `total_fine`, `issue_date`, `mobile_no`, `email_id`) VALUES ('"+amb.sId+"', '"+amb.sName+"', '"+amb.bookLimit+"', '"+amb.noBooks+"', '"+amb.fine+"', '"+amb.issueDate+"', '"+amb.mobileNo+"', '"+amb.emaiId+"')";
		int res=0;
		try {
			res=stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(res==1){
			MailService ms=new MailService();
			try {
				ms.sendMail(amb);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
