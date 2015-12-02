<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring-4 + Struts-3 + Hibernate Integration Demo</title>
<style>
table.list {
	border-collapse: collapse;
	width: 40%;
}

table.list, table.list td, table.list th {
	border: 1px solid gray;
	padding: 5px;
}
</style>
</head>
<body>

	<h2>Leave Management System</h2>
	

	<s:form method="post" action="add">
		<table>

			<tr>
				<td><s:textfield key="label.type" name="employee.type" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.fromDate" name="employee.fromDate" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.toDate" name="employee.toDate" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.status" name="employee.status" /></td>

			</tr>
			<tr>
				<td><s:submit key="label.add"></s:submit></td>
			</tr>
		</table>
	</s:form>


	<h3>Leave Requests</h3>
	<c:if test="${!empty employees}">
		<table class="list">
			<tr>
				<th align="left">Type of Leave</th>
				<th align="left">From</th>
				<th align="left">To</th>
				<th align="left">Status</th>
				<th align="left">Actions</th>
				<th align="left">Approve</th>
			</tr>
			<c:forEach items="${employees}" var="emp">
				<tr>
					<td>${emp.type}</td>
					<td>${emp.fromDate}</td>
					<td>${emp.toDate}</td>
					<td>${emp.status}</td>
					<td><a href="delete/${emp.id}">delete</a></td>
					<td><a href="approve/${emp.id}">approve</a>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>