<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
  <body>
  



  <nav class="navbar navbar-expand-lg  bg-primary navbar navbar-expand-lg fixed-top" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand fs-2" >Indian Dances</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup" >
      <div class="navbar-nav">
        <a class="nav-link active link-opacity-75-hover" aria-current="page" href="homePage.jsp">Home</a>
         <a class="nav-link active link-opacity-75-hover" aria-current="page" href="/allDances">Get All Dances</a>
          <a class="nav-link active link-opacity-75-hover" aria-current="page" href="/add">Add Dance</a>
           <a class="nav-link active link-opacity-75-hover" aria-current="page" href="/update">Update Dance</a>

             <a class="nav-link active link-opacity-75-hover" aria-current="page" href="getId.jsp">Get Dance details</a>
        
        
      </div>
      <div >
      <a   href="/logout"> <button  class="btn btn-danger float-end" >Logout</button></a>
      </div>
    </div>
  </div>
</nav>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  </body>
</html>