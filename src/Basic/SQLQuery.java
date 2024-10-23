package Basic;

import java.sql.*;

import static java.lang.Class.forName;


public class SQLQuery {

    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost:3036/selenium_users","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from superheroes_table");

            while(resultSet.next()){
                System.out.println(resultSet.getString(1));
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
