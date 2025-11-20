package utils;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseSetup {
    public static void initialize() {
        try (Connection c = Database.getConnection(); Statement st = c.createStatement()) {
            st.execute("""
                CREATE TABLE IF NOT EXISTS users(
                  id INTEGER PRIMARY KEY AUTOINCREMENT,
                  username TEXT UNIQUE NOT NULL,
                  password TEXT NOT NULL,
                  role TEXT NOT NULL
                );
            """);

            // Insert default accounts if not present
            st.executeUpdate("INSERT OR IGNORE INTO users(username,password,role) VALUES('student','pass123','student');");
            st.executeUpdate("INSERT OR IGNORE INTO users(username,password,role) VALUES('admin','admin123','admin');");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
