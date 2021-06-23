package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
   // User user = new User();
    List<User> userList = new ArrayList<>();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        InMemoryStorage inMemoryStorage = new InMemoryStorage();
        resp.getWriter().println(inMemoryStorage.addUser(new User(name, username, password)));


    }
}
