<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
  </head>
  <body>
   
        <table  align="center">
            <th>序号</th>
        	<th>姓名</th>
        	<th>年龄</th>
        	<th>地址</th>
        	<th>所属班级</th>
        	<th></th>
          <c:forEach var="st" items="${students }">
         	<tr>
         		<td>${st.id }</td>
         		<td>${st.name }</td>
         		<td>${st.age }</td>
         		<td>${st.address.address}</td>
         		<td>${st.grade.grade}</td>
         	<td><button><a href="${pageContext.request.contextPath} /delete?id=${st.id}" >修改</a></button>
         	<button><a href="${pageContext.request.contextPath} /update?id=${st.id}" >删除</a></button> </td>
         	</tr>
         	
         </c:forEach>
         </table>
  </body>
</html>
