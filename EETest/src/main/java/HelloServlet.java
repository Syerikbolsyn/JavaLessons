import logic.Cart;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import logic.Cart;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String user =(String) session.getAttribute("current_user");
        Integer count = (Integer) session.getAttribute("count");
//        if (user == null) {
//            request.getRequestDispatcher("/testJsp.jsp").forward(request, response);
//            user = "wemow";
//        } else {
            if (count == null) {
                session.setAttribute("count", 1);
                request.getRequestDispatcher("/testJsp.jsp").forward(request, response);
                count =  1;
            } else {
                session.setAttribute("count",  count + 1);
            }
//        }



        /**Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
            count =  1;
        } else {
            session.setAttribute("count",  count + 1);
        }*/
        /**
        Cart cart = (Cart) session.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }
        session.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
        */
//        response.setContentType("text/html");
//        String name = request.getParameter("name");
//        PrintWriter ouptur = response.getWriter();
//        String surename = request.getParameter("surename");
//        ouptur.println("<Html");
//        ouptur.println("<h1> Hello, " + name + "<h1>");
//        ouptur.println("<h1> Hello, " + surename + "<h1>");
//        ouptur.println("</html>");
        //rediract
//        response.sendRedirect("https://www.google.com");
//        response.sendRedirect("/testJsp.jsp");

        //Forward
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/testJsp.jsp");
//        dispatcher.forward(request, response);
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1> Your count is " + count +"</h1>" );
        pw.println("<body>");
        pw.println("</html>");
    }

    public void destroy() {
    }
}