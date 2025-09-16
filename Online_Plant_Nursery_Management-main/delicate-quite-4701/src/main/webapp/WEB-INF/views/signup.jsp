<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Signup - Online Plant Nursery</title>
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
        .signup-container {
            background: #fff;
            padding: 40px 35px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
            width: 100%;
            max-width: 450px;
        }
        h2 {
            text-align: center;
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
            margin-bottom: 6px;
        }
        input[type="text"], 
        input[type="password"], 
        input[type="email"] {
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
            padding: 12px 18px;
            font-size: 15px;
            border-radius: 6px;
            cursor: pointer;
            width: 100%;
            transition: background 0.3s;
        }
        button:hover {
            background: #388e3c;
        }
        p.login {
            text-align: center;
            margin-top: 20px;
            font-size: 14px;
        }
        p.login a {
            color: #4caf50;
            text-decoration: none;
            font-weight: 600;
        }
        p.login a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="signup-container">
        <h2>Create Account</h2>
        <form action="signup" method="post">
            
            <label>Username:</label>
            <input type="text" name="userName" required>

            <label>Password:</label>
            <input type="password" name="password" required>

            <label>Email:</label>
            <input type="email" name="email" required>

            <label>Mobile:</label>
            <input type="text" name="mobileNo" required>

            <!-- Address fields -->
            <label>Street:</label>
            <input type="text" name="address.street" required>

            <label>City:</label>
            <input type="text" name="address.city" required>

            <label>State:</label>
            <input type="text" name="address.state" required>

            <label>Pincode:</label>
            <input type="text" name="address.pincode" required>

            <button type="submit">Sign Up</button>
        </form>
        <p class="login">
            Already have an account? 
            <a href="login">Login</a>
        </p>
    </div>
</body>
</html>
