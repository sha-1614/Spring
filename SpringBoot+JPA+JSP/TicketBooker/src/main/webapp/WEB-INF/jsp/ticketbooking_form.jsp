<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<form name="ticket" action="/book" method="post">
		<table>
			<tr>
				<td>Enter your name</td>
				<td><input name="name"></td>
			</tr>
			<tr>
				<td>Enter your address</td>
				<td><input name="address"></td>
			</tr>
			<tr>
				<td>You want travel from</td>
				<td><input name="source"></td>
			</tr>
			<tr>
				<td>Your destination</td>
				<td><input name="destination"></td>
			</tr>
			<tr>
				<td>Travel date</td>
				<td><input type="date" name="bookingDate"></td>
			</tr>
		</table>
		<input type="submit" value="submit">
	</form>
</body>
</html>