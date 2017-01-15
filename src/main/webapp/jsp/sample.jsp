<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="sampleBean" class="servlet.sample.SampleBean" scope="request" />
<!DOCTYPE html>
<html lang="jp">
  <head>
    <meta charset="utf8">
    <title>Insert title here</title>
  </head>
  <body>
    sample<br>
    id=<%=sampleBean.getId()%><br>
    name=<%=sampleBean.getName()%><br>
  </body>
</html>
