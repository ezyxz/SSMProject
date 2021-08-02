package com.xinyuan.database;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrgConnectTest {
    public static void main(String[] args) {
        completeConnectTest();
    }
    public static void completeConnectTest(){
        System.out.println("Original Test start...");
        System.out.println("connect to aliyun database...");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://rm-bp117wnxo8snqcbks9o.mysql.rds.aliyuncs.com:3306/da_test");
        dataSource.setUsername("ezyxz");
        dataSource.setPassword("Ezyxz123");
        DruidPooledConnection connection = null;
        try {
            connection = dataSource.getConnection();
            System.out.println("database connected : "+connection);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM runoob_tbl";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                int id  = resultSet.getInt("runoob_id");
                String sname = resultSet.getString("runoob_title");
                String spwd = resultSet.getString("runoob_author");
                System.out.println(id + "|" + sname + "|" + spwd);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("Original Test finish...");
    }
}
