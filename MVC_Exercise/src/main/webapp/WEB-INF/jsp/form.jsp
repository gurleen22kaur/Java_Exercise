<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>
${heading}
<br>

<form action="/submitForm.html" method="post">
    <label>FirstName</label>

    <input type="text" name=firstName>


    <label>LastName</label>

    <input type="text" name=lastName>
    <input type="submit">
</form>
</body>
</html>