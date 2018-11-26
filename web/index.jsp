<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
  <head>
    <title>springmvc项目搭建</title>

  </head>
  <body>
     <h1>springmvc项目搭建启动成功</h1>
      <form action="<%=request.getContextPath()%>/save.action"  method="post"
            accept-charset="UTF-8" onsubmit="document.charset='UTF-8'">
          <input type="text" name="name">
          <input type="text" name="sex">
          <input type="submit" value="提交">
      </form>
  </body>
</html>
