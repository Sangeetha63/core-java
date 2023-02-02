<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
        rel="stylesheet" 
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
        crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
           crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" 
           alt="" width="90" height="48" class="d-inline-block align-text-top">
      
    </a>
    <a href="index.jsp">Home page</a>
  </div>
</nav>
<h1>Page to send Food Items.</h1>
<form action="send" method="post">
     <div class="mb-3">
     <lable for="exampleFormControlInput1" class="form-lable">Name
     </lable>
     <input type="text" class="form-control" name="name" 
     id="exampleFormControlInput1" placeholder="enter food item name">
     </div>
     <div>
         <select class="form-select" aria-lable="default select example"
         name="type">
         <option selected>Select Food Type</option> 
         <option value="veg">Veg</option>
         <option value="NonVeg">Non-Veg</option>
         <option value="Both">Both</option>
         </select>
      </div>
      <div>
          <lable for ="customRange2" class="form-lable">Quantity</lable>
          <input type="range" class="form-range" min="0" max="5" name="quantity"
          id="customRange2">
       </div>
        <div class="mb-3">
             <lable for="exampleFormControlInput2" class ="form-lable">Price</lable>
             <input type="text" class="form-control" name="price"
             id="exampleFormControlInput2" placeholder="Enter Food Item Price">
        </div>
        <div>
        <input type="submit" value="Send" class="btn btn-dark">
        </div>


</body>
</html>