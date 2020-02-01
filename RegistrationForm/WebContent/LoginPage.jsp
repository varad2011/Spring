<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>LoginPage</title>
		<script >
		function myFunction(){
		document.getElementById("click").innerHTML="wrong details";
		}
		</script>	
	</head>
	
		<body >
		
		<h4 style = "color:red; margin-left:550px">Welcome to login page</h4>
		
			<form  action = "Login" method = "post">
				<table  border ="0" style = "background-color:buttonface; margin-left:450px">
					<tr>
						<td>Enter UserName :</td>
						<th><input style = "color:tomato" type = "text" name = "userName" ><br></th>
					</tr>
					<tr>
						<td>Enter UserPassword :</td>
						<th><input type = "password" name = "password"><br></th>
					</tr>
					<tr>
						<td ><a href = "RegistrationPage.jsp">new Registration </a></td>
						<th><input type = "submit" value = "submit" name = "submit"><br></th>
					</tr>
				<!-- 
					<tr>
						<td><p id = "click">welcome</p></td>						
						<td><button type = "button" onClick = "myFunction()">click</button></td>
					</tr> -->
				</table>
		
			</form>

		</body>
</html>