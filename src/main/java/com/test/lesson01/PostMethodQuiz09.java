package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet/quiz09")
public class PostMethodQuiz09 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException {
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		
		PrintWriter out = response.getWriter();
		out.print(""); // 이슈를 위한 불필요한 코드

}
