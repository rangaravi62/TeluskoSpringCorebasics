<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Customer</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }
        .form-container {
            width: 40%;
            margin: auto;
            padding: 20px;
            background: #fff;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        h2 {
            text-align: center;
        }
        .form-field {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .submit-button {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .submit-button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Register Customer</h2>
        <form:form action="/CRA/registercustomer" method="post" modelAttribute="customer">
            <div class="form-field">
                <label for="firstName">First Name:</label>
                <form:input path="firstName" id="firstName" />
            </div>
            <div class="form-field">
                <label for="secondName">Second Name:</label>
                <form:input path="secondName" id="secondName" />
            </div>
            <div class="form-field">
                <label for="city">City:</label>
                <form:input path="city" id="city" />
            </div>
            <div class="form-field">
                <form:hidden path="id" id="id" readonly="true" />
            </div>
            <div class="form-field">
                <button type="submit" class="submit-button">Register</button>
            </div>
        </form:form>
    </div>
</body>
</html>
