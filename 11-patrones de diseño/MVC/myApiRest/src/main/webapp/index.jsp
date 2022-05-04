<%@page import="com.javaen.business.*"%>

<html>
<body>
<h2>Mi api REST</h2>

<ul>
<li><a href="http://localhost:8080/myApiRest/helloController/">http://localhost:8080/myApiRest/helloController/</a></li>
<li><a href="http://localhost:8080/myApiRest/helloController2/">http://localhost:8080/myApiRest/helloController2/</a></li>

</ul>
</body>
</html>

<%

BookManagerService bm = new BookManagerServiceImpl();

System.out.print("All Books: " + bm.getAll() );

%>