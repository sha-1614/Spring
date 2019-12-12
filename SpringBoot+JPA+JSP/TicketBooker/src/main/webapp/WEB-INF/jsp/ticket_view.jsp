<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<table border="2px">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Address</th>
		<th>Source</th>
		<th>Destination</th>
		<th>Date</th>
	</tr>
	<c:forEach var="ticket" items="${ticketList}">
		<tr>
			<td>${ticket.id}</td>
			<td>${ticket.name}</td>
			<td>${ticket.address}</td>
			<td>${ticket.source}</td>
			<td>${ticket.destination}</td>
			<td>${ticket.bookingDate}</td>
		</tr>
	</c:forEach>
</table>
<a href="/">Home</a>

</html>