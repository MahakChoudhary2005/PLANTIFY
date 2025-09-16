<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Plants - Online Plant Nursery</title>
</head>
<body>
    <h2>Plants List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Plant Name</th>
            <th>Type</th>
            <th>Price</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="plant" items="${plants}">
            <tr>
                <td>${plant.plantId}</td>
                <td>${plant.commonName}</td>
                <td>${plant.typeOfPlant}</td>
                <td>${plant.price}</td>
                <td>
                    <a href="editPlant?id=${plant.plantId}">Edit</a> |
                    <a href="deletePlant?id=${plant.plantId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="addPlant">Add New Plant</a>
</body>
</html>
