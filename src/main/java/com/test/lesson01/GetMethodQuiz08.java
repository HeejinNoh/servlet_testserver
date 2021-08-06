package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/servlet/quiz08")
public class GetMethodQuiz08 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		String search = request.getParameter("search"); //검색어기 대문에 keyword로 해줬어도 됨.
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		
		PrintWriter out = response.getWriter();
		
		for(String text : list) {
			//검색 : 
//			if(text.contains(search)) {
//				out.print(text + "<br>"); //여러문장이 나올 수 있으니 br태그 작성
//			}
			
			//풀이1: string메서드 활용. 단점은 한문장에 키워드 2개있으면 nono
/*			int index = text.indexOf(search); // index가 없을 때 -1값이 나옴
			if(index > -1) {
				StringBuffer sb = new StringBuffer();
				sb.append(text);
				sb.insert(index, "<b>");
				sb.insert(index + 3 + search.length(), "</b>");
				out.print(sb + "<br>");*/
			
			//풀이2: 키워드 자체를 스플릿 구분자로 잘라내기
/*			String[] words = text.split(search);
			if(text.contains(search)) {
				//강남역 최고 // 맛집 // 소개합니다.
				out.print(words[0] + "<b>" + search + "</b>" + words[1] + "<br>" );
			}*/
			
			//풀이3:
			if(text.contains(search)) {
				text = text.replace(search, "<b>" + search + "</b>");//주의 치환된 문자는 text로 저장해야함.
				out.print(text + "<br>");
			}
		}
		
		
	}
	

}
