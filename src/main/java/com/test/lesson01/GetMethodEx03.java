package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class GetMethodEx03 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		PrintWriter out = response.getWriter();
		String userId = request.getParameter("user_id"); //키값 - string
		String name = request.getParameter("name");
		Integer age = Integer.valueOf(request.getParameter("age"));
		//원래 스트링으로 값이 나오기 때문에 변형이 필요함.(연산할게 있다면)
		
//		text/plain일 때
//		out.println("GET METHOD"); //plain이기 때문에 ln
//		out.println("userId: " + userId);
//		out.println("name: " + name);
//		out.println("age: " + age);
		
		//text/json일 때
		//JSON {"user_id":"marobiana", "name":"boram", "age":33}
		out.print("{\"user_id\":\"" + userId + "\", \"name\":\"boram\", \"age\":33}");
		
		// chrome json 잘 볼수 있는 확장프로그램 있음 
	}
}
