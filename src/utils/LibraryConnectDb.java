package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LibraryConnectDb {

    private Connection conn;
    private String db;
    private String url;
    private String user;
    private String password;

    public LibraryConnectDb() {
        this.db = "news";
        this.url = "jdbc:mysql://localhost:3306/" + db + "?useUnicode=true&characterEncoding=UTF-8";
        this.user = "root";
        this.password = "";
    }
    public Connection getConnectMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
