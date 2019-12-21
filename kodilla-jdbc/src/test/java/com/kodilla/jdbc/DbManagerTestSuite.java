package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

//    @Test
//    public void testSelectUsers() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//
//        //When
//        String sqlQuery = "SELECT * FROM USERS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getInt("ID") + ", " +
//                    rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        Assert.assertEquals(5, counter);
//    }
//
//    @Test
//    public void testSelectUsersAndPosts() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//
//        //When
//        String sqlQuery = "select U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
//                "from USERS U join POSTS P ON U.ID = P.USER_ID\n" +
//                "group by P.USER_ID\n" +
//                "having COUNT(*) >=2\n" +
//                "order by U.LASTNAME, U.FIRSTNAME;";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME") + ", "+
//                    rs.getInt("POSTS_NUMBER"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        Assert.assertEquals(1, counter);
//    }

}
