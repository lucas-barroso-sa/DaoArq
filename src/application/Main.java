package application;

import db.DB;


import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller "
                        + "SET BaseSalary = BaseSalary + ? "
                        +"WHERE "
                        +"(DepartmentId = ? )",
                    Statement.RETURN_GENERATED_KEYS
            );
            st.setDouble(1, 1.00);
            st.setInt(2, 1);
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done!"+ " ID: " + id);
                }
            }else {
                System.out.println("no rows affected");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}