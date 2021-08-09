<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<!-- html 주석 -->
	<%-- JSP의 주석: 소스보기에서 보이지 않는다. --%>
	
<%
	// 자바 주석, 자바코드 시작
	// scriptlet > main 메서드
	
	int sum = 0;
	for(int i = 1; i <= 10; i++) {
		sum += i;
	} // 1~10까지의 합
%>

	<strong>합계: </strong>
	<input type="text" value="<%= sum %>">
	<br>
	
<%! //선언문: 클래스 정의하는 것에 가까운 느끰스~
	// field
	private int num = 100;
	
	//method
	public String getHelloWorld(){
		return "HelloWorld!!";
	}
	
%>

	<%= getHelloWorld() %> <br>
	<%= num + 2000 %>
</body>
</html>