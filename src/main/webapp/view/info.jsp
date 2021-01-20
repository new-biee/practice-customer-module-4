<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Noob
  Date: 1/19/2021
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customers/edit" method="post">
    <fieldset>
        <legend>Customer Information</legend>
        <input type="number" name="id" value="${customer.id}">
        <table>
            <tr>
                <td>
                    <input type="text" value="${customer.name}" name="name">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="text" value="${customer.email}" name="email">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="text" value="${customer.address}" name="address">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="number" value="${customer.quantity}" name="quantity">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Submit">
                </td>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>
