package com.sparta.me.jdbc;

import java.sql.Date;

public class Main {
    //('11001', '1960-01-01', 'Bob', 'Smith', 'M', '2023-05-12');
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO(ConnectionManager.createConnetion());
//      employeeDAO.createEmployee(
//              11001,
//              new Date(1960,01,01),
//              "Bob",
//              "Smith",
//              "M",
//              new Date(2023,05,12));
        employeeDAO.getAllUsers();
        ConnectionManager.closeConnection();
    }
}