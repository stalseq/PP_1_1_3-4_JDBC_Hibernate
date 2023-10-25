package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoJDBCImpl();
    private UserDao useDaoHibernate = new UserDaoHibernateImpl();

    public UserServiceImpl() throws SQLException {
    }

    public void createUsersTable() throws SQLException {
        useDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        useDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        useDaoHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        useDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return useDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        useDaoHibernate.cleanUsersTable();
    }
}