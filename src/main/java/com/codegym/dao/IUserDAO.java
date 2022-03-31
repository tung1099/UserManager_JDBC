package com.codegym.dao;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;


public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUSer(int id) throws SQLException;

    public List<User> selectAllUser();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> findUserByCountry(String country);

    public List<User> sortUserByName();

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    void addUserTransaction(User user, int[] permission);
}
