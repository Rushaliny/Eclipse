<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Shalu's Project </title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>

<div style=" margin-top:50px; padding:60px; margin-left:30%;">
<form action="../studentServelet">
  <div class="form-group col-6">
    <label for="username">User Name:</label>
    <input type="text" class="form-control" name="username" id="username" placeholder="Username" >
   
  </div>
  <div class="form-group col-6">
    <label for="exampleInputPassword1">Numbers</label>
    <input type="text" class="form-control" id="number" name="number" placeholder="number">
  </div>
  <div class="form-group col-6">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
  </div>

  <button type="submit" name="submit" class="btn btn-primary" style="margin-top:20px; margin-left:45%;">submit</button>
  
</form>
</div>

</body> 
</html>