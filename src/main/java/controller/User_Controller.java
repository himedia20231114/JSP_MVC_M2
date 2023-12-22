package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class User_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public User_Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		//http://localhost:8181/JSP_MVC_M2/*.act
		
		
		//if else if 문으로 각 조건에 맞는 요청을 처리 하는 블락 생성 
		
		//"/insertUsers.act"
		//"/updateUsers.act"
		//"/deleteUsers.act"
		//"/getUsers.act"
		//"/getUsersList.act"
		//"/login.act"
		
		
	
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
