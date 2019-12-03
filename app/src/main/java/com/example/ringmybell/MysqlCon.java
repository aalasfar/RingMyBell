package com.example.ringmybell;

import android.os.AsyncTask;
import android.widget.Toast;

import java.sql.*;

import static android.widget.Toast.makeText;

public class MysqlCon {
//    String res = "";
//
//    @Override
//    protected  void onPreExecute(){
//        super.onPreExecute();
//        Toast,makeText(MainActivity.this, "Please wait...",Toast.LENGTH_SHORT).show();
//    }

    public static void main(String args[]) {
    }
        public void printMySQL () {
            System.out.println("In Mysql Class");

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("MySQL JDBC driver not found !!");
                return;
            }
            System.out.println("MySQL JDBC Driver Registered!");
            Connection con = null;
            try {
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost/sakila", "root", "ABD1mysql.");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from sakila.actor");
                while (rs.next())
                System.out.println(rs.getInt(1));
                //con.close();
                System.out.println("SQL Connection to database established");

            } catch (SQLException e) {
                System.out.println("Connection Failed!");
                return;
                //System.out.println(e);
            } finally {
                try {
                    if (con != null)
                        con.close();
                    System.out.println("Connection closed!");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }

//    @Override
//    protected String doInBackground(String... strings) {
//        return null;
//    }
}
