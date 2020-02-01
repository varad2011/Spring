<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>Registration Page</title>
	</head>
	<body>
	<h4  style = "color:red; margin-left:550px">Welcome to registration page</h4>
	
		<form action = "registration" method = "post" > 

			<table border ="0" style = "background-color:windowframe; margin-left:450px">
				<tr>
					<td>Enter username :</td>
					<td><input type = "text" name = "name"></td>
				</tr>
				<tr>
					<td>Enter lastname :</td>
					<td><input type = "text" name = "lastName"></td>
				</tr>
				<tr>
					<td>Select gender :</td>
					<td>
						<input type = "radio" name = "gender" value = "male">male
						<input type = "radio" name = "gender" value = "female">female
						<input type = "radio" name = "gender" value = "other">other
					</td>
				</tr>
				<tr>
					<td>Enter password :</td>
					<td><input type = "password" name = "password"></td>
				</tr>
				<tr>
					<td>Enter emailId :</td>
					<td><input type = "text" name = "emailId"></td>
				</tr>	
				<tr>
					<td>Enter MobileNumber :</td>
					<td><input type = "text" name = "mobileNumber"></td>
				</tr>
				<tr>
					<td>Enter Address :</td>
					<td><input type = "text" name = "address"></td>
				</tr>
				<tr>
					<td></td>
					<th><input type = "submit" value = "submit" name = "submit"></th>
				</tr>			
			</table>
		</form>
	</body>
</html>