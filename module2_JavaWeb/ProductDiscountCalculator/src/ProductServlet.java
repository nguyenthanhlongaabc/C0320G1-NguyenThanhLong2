import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double vnd =  price - price*rate/100;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Tên sản phẩm :" + name + "</h1>");
        writer.println("<h1> Giá : " + price + "</h1>");
        writer.println("<h1> Discount : " + rate + "</h1>");
        writer.println("<h1> Giá sau khi chiếu khấu : " + vnd + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
