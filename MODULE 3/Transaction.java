import java.sql.*;
public class Transaction{
    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "password");
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(
                "UPDATE accounts SET balance = balance - 1000 WHERE id = 1");
            stmt.executeUpdate(
                "UPDATE accounts SET balance = balance + 1000 WHERE id = 2");
            con.commit();
            System.out.println("Transfer Successful");
        }
        catch(Exception e) {
            try {
                if(con != null) {
                    con.rollback();
                }
            }
            catch(Exception ex) {}
            System.out.println("Transaction Rolled Back");
        }
    }
}