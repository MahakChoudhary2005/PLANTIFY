<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login - Online Plant Nursery</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #e0f7e9, #d6f5d6);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .login-container {
            background: #fff;
            padding: 40px 35px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
            width: 100%;
            max-width: 400px;
            text-align: center;
        }
        h2 {
            margin-bottom: 25px;
            color: #2e7d32;
            font-weight: 600;
        }
        label {
            display: block;
            text-align: left;
            font-size: 14px;
            font-weight: 600;
            color: #444;
            margin-bottom: 5px;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px 12px;
            border: 1px solid #ccc;
            border-radius: 6px;
            margin-bottom: 18px;
            font-size: 14px;
            box-sizing: border-box;
        }
        input:focus {
            border-color: #4caf50;
            outline: none;
            box-shadow: 0 0 4px rgba(76, 175, 80, 0.3);
        }
        button {
            background: #4caf50;
            color: white;
            border: none;
            padding: 10px 18px;
            font-size: 15px;
            border-radius: 6px;
            cursor: pointer;
            width: 100%;
            transition: background 0.3s;
        }
        button:hover {
            background: #388e3c;
        }
        .message {
            margin-top: 12px;
            font-size: 14px;
        }
        .error {
            color: #d32f2f;
            font-weight: 500;
        }
        .success {
            color: #388e3c;
            font-weight: 500;
        }
        p.signup {
            margin-top: 20px;
            font-size: 14px;
        }
        p.signup a {
            color: #4caf50;
            text-decoration: none;
            font-weight: 600;
        }
        p.signup a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>

        <form action="${pageContext.request.contextPath}/login" method="post">
            <label>User ID:</label>
            <input type="text" name="userId" required>

            <label>Username:</label>
            <input type="text" name="userName" required>

            <label>Password:</label>
            <input type="password" name="password" required>

            <button type="submit">Login</button>
        </form>

        <c:if test="${not empty error}">
            <p class="message error">${error}</p>
        </c:if>

        <c:if test="${not empty message}">
            <p class="message success">${message}</p>
        </c:if>

        <p class="signup">
            Don't have an account? 
            <a href="${pageContext.request.contextPath}/signup">Sign up</a>
        </p>
    </div>
</body>
</html>
