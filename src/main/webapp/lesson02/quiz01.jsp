<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_Test01</title>
</head>
<body>
<%!
public String sum(int n) {
	int sum = 0;
	for(int i = 1; i <= n; i++) {
		sum += i;
	}
	return "1부터 " + n + "까지의 합은 " + sum + "입니다.";
}
%>
<p><%= sum(10) %></p>
<br>
<%
int[] scores = {80, 90, 100, 95, 80};

int sum = 0;
double average;
//for(int score : scores) {
//	sum += score;
//}
for(int i = 0; i < scores.length; i++) {
	sum += scores[i];
}
average = (double)sum / scores.length;
%>
<p>평균 점수는 <%= average %>점 입니다.</p> 
<br>

<%
List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
int count = 0;
int total;
for(String score : scoreList) {
	if(score.equals("O")) {
		count++;
	}
//	} else {
//		continue;
//	}
}
//total = count * 10;
total = count * 100 / scoreList.size();
// 강사
int score = 0;
for(int i = 0; i < scoreList.size(); i++) {
	if(scoreList.get(i).equals("O")) { 
		score += 100 / scoreList.size();
	}
}
%>
<p>채점 결과는 <%= total %>점 입니다.</p>

<%
String birthDay = "20010820";

int year = Integer.valueOf(birthDay.substring(0, 4));
int age = 2021 - year + 1;
// 이안에서 답을 찍어내고 싶을 때
//out.print(year); //내장객체여서 바로사용가능
%>
<p><%= birthDay %>의 나이는 <%= age %>세 입니다.</p>
</body>
</html>