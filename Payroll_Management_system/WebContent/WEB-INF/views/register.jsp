<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Here</title>
</head>
<script> 
validate(){
	if(form.getElementbyId(pwd)==form.getElementbyId(cpwd)){
		return true;
	}
	else{
		alert("password and confirm password must be same");
	}
}
</script>
<body>
<form action="register" method="post">
Name:<input type="text" name="name"><br>
Username:<input type="text" name="uname"><br>
Password:<input type="password" name="pwd"><br>
Confirm Password:<input type="password" name="cpwd"><br>
<input type="submit" value="register" onclick="validate()">

</form>
</body>
</html>