package com.example.ringmybell;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlCon {
    public static void main(String args[]) {

    }
    public void mysqlPrint() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/test1", "root", "ABD1mysql.");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from sakila.actor");
            while (rs.next())
                System.out.println(rs.getInt(1) + "" + rs.getString(2) + "" + rs.getString(3));
            con.close();
            System.out.println("Attempt to Connect");
        } catch (Exception e) {
            System.out.println("Failed to Connect");
            System.out.println(e);
        }

        System.out.println("In Mysql Class");
    }
}
