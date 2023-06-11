<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Get Id</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
  	<div style="margin-bottom: 100px"><%@ include file="Navbar.jsp" %></div>
  	
    <form action="getDanceById" method="post" class="mx-auto mt-5 shadow-sm p-3 mb-5 bg-body-tertiary rounded" style="width: 600px">
  <div class="mb-3">
    <label class="form-label">Enter The Dance Id to get More Details</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="danceId">
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  </body>
</html>