package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        /*
        * http://localhost:8080/hello?username=wndnjsdnd 쿼리 파라미터
        * */
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        //응답 메세지

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        //body에 정보 삽입
        response.getWriter().write("hello " + username);

    }

}
