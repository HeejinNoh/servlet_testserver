package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz07")
public class GetMethodQuiz07 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		String address = request.getParameter("address");
		String creditCard = request.getParameter("creditCard");
		String price = request.getParameter("price");
		Integer intPrice = Integer.valueOf(price);

		PrintWriter out = response.getWriter();
		out.print("<html><head><title>주문결과</title></head><body>");

		if (!address.contains("서울시")) { // .startWith()로 가능, == false가능
			out.print("배달 불가 지역입니다.<br>");
		} else if (creditCard.equals("신한카드")) {
			out.print("결제 불가 카드입니다.");
		} else {
			out.print(address + "<b> 배달준비중</b><br>");
			out.print("결제금액: " + intPrice + "원");
		}

	}

}
