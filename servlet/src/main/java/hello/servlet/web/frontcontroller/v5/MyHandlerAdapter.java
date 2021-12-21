package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {

    //해당 컨트롤러를 처리할 수 있는지 확인
    boolean supports(Object Handler);
    //handler 호출 및 Model view 반환환
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object Handler) throws ServletException, IOException;
}
