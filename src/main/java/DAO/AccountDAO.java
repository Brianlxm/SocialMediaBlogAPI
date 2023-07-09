package DAO;

import Model.Account;
import Util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.azul.crs.client.Result;


public class AccountDAO {

    // new user registrations -- add user
    public Account addAccount(Account account){
        Connection connection = ConnectionUtil.getConnection();
        try{
            String sql = "insert into account (username, password) values ?,?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());

            preparedStatement.executeUpdate();
            ResultSet pkResultSet = preparedStatement.getGeneratedKeys();
            if (pkResultSet.next()){
                int generated_account_id = (int) pkResultSet.getLong(1);
                return new Account(generated_account_id, account.getUsername(), account.getPassword());
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }


    // user logins -- get user
    public Account getAccount(String username){
        Connection connection = ConnectionUtil.getConnection();
        try{
            String sql = "select * from account where username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, username);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                Account account = new Account(rs.getInt("account_id"),
                        rs.getString("username"),
                        rs.getString("password"));
                return account;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }


    
    // retreive all messages by account_id

}
