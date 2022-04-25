
import java.util.*;
import java.sql.*;

public class Database {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reg_no;
        String name;
        String address;
        String email;
        String ph_no;
        System.out.print("Enter your registration number: ");
        reg_no = sc.next();
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your address: ");
        address = sc.next();
        System.out.print("Enter your email: ");
        email = sc.next();
        System.out.print("Enter your Phone number: ");
        ph_no = sc.next();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","");
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?);");
            ps.setString(1,reg_no);
            ps.setString(2,name);
            ps.setString(3,address);
            ps.setString(4,email);
            ps.setString(5,ph_no);
            int i = ps.executeUpdate();
            PreparedStatement ps1 = con.prepareStatement("select * from student where `Registration Number` = ?;");
            ps1.setString(1,"20BCT0018");
            ResultSet rs = ps1.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
