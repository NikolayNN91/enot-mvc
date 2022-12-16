<html xmlns:th="http://www.w3.org/1999/xhtml" lang="en">
<head>
    <title>First JSP</title>
    <style>
        body {
            background-image: url('../../image/enot_dzhojstik_gejmpad_143589_3840x2400.jpg');
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>
<body>

<h2>You'll have a luck day!</h2>

<h2>Well, life goes on ... </h2>

<form action = "/enot" method = "POST">
    First Name: <input type = "text" name = "first_name">
    <br />
    Last Name: <input type = "text" name = "last_name" />
    <input type = "submit" value = "Submit" />
</form>

</body>
</html>