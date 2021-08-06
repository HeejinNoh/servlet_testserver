package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz04")
public class UrlMappingQuiz04 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		// html이 아니라 다른 걸 넣으면 파일 다운로드 형식으로 돌아감
		
		
		// 반복해야하는 것이 무엇인지 확인하고 배치해야 한다.
//		int count = 1;
//		for(int i = 0; i < 30; i++) {
//			count += i;
//		}
//		
//		PrintWriter out = response.getWriter();
//		out.print("<html><head><title>리스트 출력</title></head><body>");
//		out.print("<ul><li>" + count + "번째 리스트</li></ul></body></html>");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>리스트 출력</title></head><body><ul>");
		for(int i = 1; i <= 30; i++) {
			//반복태그 넣기, 다른건 다 1번씩만 들어가기 때문에
			out.print("<li>" + i + "번째 리스트</li>");	
			// 태그문법에선 ln 줄바꿈이 먹히지 않는다. 의미가 없음!!
		}
		out.print("</ul></body></html>");	
	}
}
