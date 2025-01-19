package edu.icet.librarymanagementsystem.controller.signup;

import edu.icet.librarymanagementsystem.model.User;

import java.sql.SQLException;

public interface SignupService {
    boolean checkemailrepeat(String email);
    boolean registerUser(User newUser);
    String generateId() throws SQLException;

}
