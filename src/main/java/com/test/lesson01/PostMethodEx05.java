package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("servlet/ex05")
public class PostMethodEx05 extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		response.setCharacterEncoding("utf-8"); //필터로 의미가 없어서 삭제하면됨
		response.setContentType("text/html");
		
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		
		//테이블출력
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>회원정보</title></head><body>");
		out.print("<table border=1>");
		out.print("<tr><th>아이디</th><td>" + userId + "</td></tr>");
		out.print("<tr><th>이름</th><td>" + name + "</td></tr>");
		out.print("<tr><th>생년월일</th><td>" + birth + "</td></tr>");
		out.print("<tr><th>이메일</th><td>" + email + "</td></tr>");
		out.print("</table>");
		out.print("</body></html>");
		
		System.out.println("#######서블릿통과");
		
		//새로운 데이터를 입력하거나,,? 노출되도 괜찮은 것!은 get: 쿼리스트링에 노출되지 않는 방식. 
		//request 문서 body에 내용이 들어감(주소가 무엇인지 포트가 뭔지 무슨내용이 보내지는지 서버로 요청할때
//		리퀘스느 요청서가 넘어가는데 그 요청서의 body에 들어간다)
		// 개인정보를 보낼땐 post로 보내다! 
		// 데이터로 입력한 request 값은 한글이 깨진다. 이건 tomcat서버가 이상한 인코딩으로..
		// ios-8859-1로 하기때문에 안해주는 것.. ㅋㅋㅋㅋㅋㅋㅋ그래서 또다른 방식으로 post에서 해야함.
		
		//브라우저 >(request) 필터 > 서버(서블릿) >(response) 필터 > 브라우저
	}
}
