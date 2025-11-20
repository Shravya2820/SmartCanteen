package services;

import dao.UserDAO;
import models.User;

public class AuthService {
    private final UserDAO userDAO = new UserDAO();

    public User login(String username, String password) {
        User u = userDAO.findByUsername(username);
        if (u == null) return null;
        if (u.getPassword().equals(password)) return u;
        return null;
    }
}
