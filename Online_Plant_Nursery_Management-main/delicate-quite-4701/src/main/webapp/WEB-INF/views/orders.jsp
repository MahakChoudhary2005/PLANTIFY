<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Orders - Online Plant Nursery</title>
</head>
<body>
    <h2>Orders</h2>
    <table border="1">
        <tr>
            <th>Order ID</th>
            <th>Customer</th>
            <th>Plant</th>
            <th>Planter</th>
            <th>Seed</th>
            <th>Order Date</th>
        </tr>
        <c:forEach var="order" items="${orders}">
            <tr>
                <td>${order.bookingOrderId}</td>
                <td>${order.customer.customerName}</td>
                <td>${order.plant.commonName}</td>
                <td>${order.planter.planterShape}</td>
                <td>${order.seed.commonName}</td>
                <td>${order.orderDate}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
