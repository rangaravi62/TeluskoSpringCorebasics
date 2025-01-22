<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vehicle Submission Response</title>
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
        .response-container {
            width: 50%;
            margin: 0 auto;
            background-color: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid #ccc;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .btn-back {
            display: block;
            width: 100px;
            margin: 20px auto;
            padding: 10px;
            text-align: center;
            background-color: #007bff;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        .btn-back:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <h1>Vehicle Details Submission</h1>

    <div class="response-container">
        <h3>Submitted Vehicle Details:</h3>

        <table>
            <tr>
                <th>Vehicle ID</th>
                <td>${vehicle.id}</td>
            </tr>
            <tr>
                <th>Company</th>
                <td>${vehicle.company}</td>
            </tr>
            <tr>
                <th>Cost</th>
                <td>${vehicle.cost}</td>
            </tr>
            <tr>
                <th>Country</th>
                <td>${vehicle.country}</td>
            </tr>
        </table>

        <a href="<c:url value='/register' />" class="btn-back">Go Back</a>
    </div>

</body>
</html>
