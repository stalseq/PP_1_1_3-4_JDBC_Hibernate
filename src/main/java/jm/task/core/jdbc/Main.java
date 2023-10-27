package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Dwayne", "Johnson", (byte) 51);
        userService.saveUser("Vin", "Diesel", (byte) 55);
        userService.saveUser("Jason", "Statham", (byte) 56);
        userService.saveUser("Bruce", "Willis", (byte) 69);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
