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
				<td><s:textfield key="label.type" name="leave.type" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.fromDate" name="leave.fromDate" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.toDate" name="leave.toDate" /></td>
			</tr>
			<tr>
				<td><s:textfield key="label.status" name="leave.status" /></td>

			</tr>
			<tr>
				<td><s:submit key="label.add"></s:submit></td>
			</tr>
		</table>
	</s:form>


	<h3>Leave Requests</h3>
	<c:if test="${!empty leaves}">
		<table class="list">
			<tr>
				<th align="left">Type of Leave</th>
				<th align="left">From</th>
				<th align="left">To</th>
				<th align="left">Status</th>
				<th align="left">Actions</th>
				<th align="left">Approve</th>
			</tr>
			<c:forEach items="${leaves}" var="leaves">
				<tr>
					<td>${leaves.type}</td>
					<td>${leaves.fromDate}</td>
					<td>${leaves.toDate}</td>
					<td>${leaves.status}</td>
					<td><a href="delete/${leaves.id}">delete</a></td>
					<td><a href="approve/${leaves.id}">approve</a>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>