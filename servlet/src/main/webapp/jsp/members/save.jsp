<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>


<%
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("MemberSaveServlet.service");

    String username = request.getParameter("username");
    int age = Integer.ParseInt(request.getParameter("age");

    Member member = new Member(username, age);
    memberRepository.save(member);

%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>