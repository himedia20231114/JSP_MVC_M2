package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//http://localhost:8181/JSP_MVC_M2/*.action  
@WebServlet("*.action")
public class Test_Controller03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Test_Controller03() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("요청 정보 출력!!!!");
		
		// URL : http://localhost:8181/JSP_MVC_M2/*.action 
		// URI : /JSP_MVC_M2/*.action
		String uri = request.getRequestURI(); 
		System.out.println(uri);
		
		String path = uri.substring(uri.lastIndexOf("/")); 
		System.out.println(path);
		
		
		if (path.equals("/insertBoard.action")) {
			System.out.println("/insertBoard.action 호출됨");
			// 요청을 받고
			// DTO , DAO 일을 시키고
			// 뷰 페이지로 이동 
			
			
		}else if ( path.equals("/getBoard.action")) {
			System.out.println("/getBoard.action 호출됨");
			
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
