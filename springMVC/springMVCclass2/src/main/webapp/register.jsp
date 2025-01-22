<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vehicle Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            padding: 20px;
        }
        h1 {
            text-align: center;
            color: #007bff;
        }
        .form-container {
            width: 50%;
            margin: 0 auto;
            background-color: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        label {
            font-size: 1.1em;
            margin-bottom: 10px;
            display: block;
        }
        input[type="text"],
        input[type="number"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: white;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <h1>Submit Vehicle Details</h1>

    <div class="form-container">
        <form action="<c:url value='/register' />" method="POST">
            <label for="id">Vehicle ID</label>
            <input type="number" id="id" name="id" required>

            <label for="company">Company</label>
            <input type="text" id="company" name="company" required>

            <label for="cost">Cost</label>
            <input type="number" id="cost" name="cost" step="0.01" required>

            <label for="country">Country</label>
            <input type="text" id="country" name="country" required>

            <input type="submit" value="Submit Vehicle">
        </form>
    </div>

</body>
</html>
