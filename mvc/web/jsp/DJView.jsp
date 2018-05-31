<%--
  Created by IntelliJ IDEA.
  User: shalk
  Date: 2018/5/31
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="beatModel" scope="request" class="com.xshalk.servlet.BeanModel" />
<html>
  <head>
    <meta charset="UTF-8">
    <title>My Web</title>
  </head>
  <body>
    <h1>This is my firt web app</h1>
    <h2> 测试中文</h2>
  <h1>DJ View</h1>
    Beats per minutes = <jsp:getProperty name="beatModel" property="bmp" />
  <br />
  <hr>
  <br />
    <form method="get" action="/mvc/">
      BPM: <input type="text" name="bpm" value="<jsp:getProperty name="beatModel" property="bmp" />" >
      <input type="submit" name="set" value="set"> <br >


    </form>
  </body>
</html>
