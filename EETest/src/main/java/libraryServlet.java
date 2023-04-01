import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.sql.*;

@WebServlet(name = "libraryServlet", value = "/libraryServlet")
public class libraryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://5432/Java", "postgre",
                    "Bolsin002123");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT title from books");

            while (rs.next()) {
                pw.println(rs.getString("title"));
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
