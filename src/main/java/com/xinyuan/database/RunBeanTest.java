package com.xinyuan.database;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RunBeanTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring/application-jdbc.xml");
        DruidDataSource druidDataSource = (DruidDataSource) app.getBean("getDruidDataSource");
        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println(connection);
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

    }
}
