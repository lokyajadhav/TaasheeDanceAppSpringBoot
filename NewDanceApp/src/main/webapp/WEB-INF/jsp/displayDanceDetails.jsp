<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
 
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
 <div style="margin-bottom: 100px"><%@ include file="Navbar.jsp" %></div>

   <div class="mx-auto p-5">
    	<h1>Indian States and their Dance Forms Folk Dance of Different States in India</h1>
    	<p>Art and culture are extremely essential for a country growth, as well as to establish diplomatic relationships with other countries as well.
    	 People have evolved into humans after years of evolution and art has played an important role and has had an impact on their lives.
		<br></br>In this article, we will see the List of Indian States and their Dance Forms.</p>
    </div>
    <h1 class="text-center text-success">The Details of <c:out value="${DancesList.danceName }"></c:out></h1>
    <table class="table table-striped p-5 mx-auto mt-5 shadow-sm p-3 mb-5 bg-body-tertiary rounded" style="width: 600px">
	<thead>
		<tr>
		<th>Dance Id</th>
		<th>Dance Name</th>
		<th>Dance State</th>
		
		</tr>
	</thead>
	<tbody>
		
			<tr>
			<td><c:out value="${DancesList.danceId }"></c:out></td>
			
			<td><c:out value="${DancesList.danceName}"></c:out></td>
			
			
			<td><c:out value="${DancesList.danceState }"></c:out></td>
			
			</tr>
		
	</tbody>
</table>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  </body>
</html>