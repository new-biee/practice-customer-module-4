<%@ page import="com.manager.practice.DAO.CustomerDAO" %>
<%@ page import="com.manager.practice.DAO.ICustomerDAO" %><%--
  Created by IntelliJ IDEA.
  User: Noob
  Date: 1/19/2021
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>There are ${count} customer(s) in list.</p>

<table border="1px">
    <caption>Customer List</caption>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Quantity</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${listCustomers}">
        <tr>
            <td>
                <a href="customers/${customer.id}"><c:out value="${customer.id}"/></a>
            </td>
            <td>
                <c:out value="${customer.name}"/>
            </td>
            <td>
                <c:out value="${customer.email}"/>
            </td>
            <td>
                <c:out value="${customer.address}"/>
            </td>
            <td>
                <c:out value="${customer.quantity}"/>
            </td>
            <td>
                    <%--                <form action="/customers/remove/${customer.id}" method="post">--%>
                    <%--                    <input type="submit" value="Remove">--%>
                    <%--                </form>--%>

                <form action="/customers/remove" method="post">
                    <input type="hidden" value="${customer.id}" name="id">
                    <input type="submit" value="Remove">
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
