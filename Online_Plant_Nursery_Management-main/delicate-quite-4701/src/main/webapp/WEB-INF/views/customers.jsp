<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customers - Online Plant Nursery</title>
</head>
<body>
    <h2>Customer List</h2>
    <table border="1">
        <tr>
            <th>Customer ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="cust" items="${customers}">
            <tr>
                <td>${cust.customerId}</td>
                <td>${cust.customerName}</td>
                <td>${cust.email}</td>
                <td>${cust.mobile}</td>
                <td>
                    <a href="editCustomer?id=${cust.customerId}">Edit</a> |
                    <a href="deleteCustomer?id=${cust.customerId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
