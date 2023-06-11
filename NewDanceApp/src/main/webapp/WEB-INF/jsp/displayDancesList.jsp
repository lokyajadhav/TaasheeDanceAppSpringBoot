<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
 
 
 
 <!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>All Dances in India</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); %>
  </head>
  <body>
  	<div><%@ include file="Navbar.jsp" %></div>
  
    <div class="mx-auto  p-5 mt-5">
    	<h1>Indian States and their Dance Forms Folk Dance of Different States in India</h1>
    	<p>Art and culture are extremely essential for a country growth, as well as to establish diplomatic relationships with other countries as well.
    	 People have evolved into humans after years of evolution and art has played an important role and has had an impact on their lives.
		<br></br>In this article, we will see the List of Indian States and their Dance Forms.</p>
    </div>
<table class="table table-striped p-5 mx-auto  shadow-sm p-3  bg-body-tertiary rounded" style="width: 700px">
	<thead>
		<tr>
		<th>Dance Id</th>
		<th>Dance Name</th>
		<th>Dance State</th>
		<sec:authorize access="hasRole('ADMIN')">
		<th>Quick Actions</th>
		</sec:authorize>
		
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dances" items="${DancesList}">
			<tr>
			<td><c:out value="${dances.getId() }"></c:out></td>
			
			<td><c:out value="${dances.getName() }"></c:out></td>
			
			
			<td><c:out value="${dances.getState_of_origin() }"></c:out></td>
			<sec:authorize access="hasRole('ADMIN')">
			<td><a href="getDancesById?danceId=<c:out value='${dances.getId() }'/>"> <button type="submit" class="btn btn-success">update</button></a></td>
			
			<td><a href="deleteDanceById?danceId=<c:out value='${dances.getId() }'/>"> <button type="submit" class="btn btn-danger">Delete</button></a></td>
			</sec:authorize>
			</tr>
			
		</c:forEach>
	</tbody>
</table>
</body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  </body>
</html>
 
