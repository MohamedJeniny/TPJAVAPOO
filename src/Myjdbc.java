import classes.Etudiant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyJdbc {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/prjjava";
        String user = "root";
        String pwd = "";
        try {
            Connection cx = DriverManager.getConnection(url, user, pwd);
            System.out.println("Good Connection");


        } catch (SQLException e) {
            System.out.println("Bad Connection");
            e.printStackTrace();
        }


    }
}



