<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>register</title>


<style type="text/css" >

<%@include file="style.css" %>

</style>

</head>
<body>

 <form action="register" method = "post">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

	<label for = "name" ><b>Name</b></label>
	<input type="text" placeholder="Enter Name" name ="name" required>
	
	<label for="surname"><b>Surname</b></label>
    <input type="text" placeholder="Enter Surname" name="surname" required>
    
    <label for="south African"><b>South African ID/Passport</b></label>
    <input type="text" placeholder="Enter SA ID/Passport" name="ID" required>
    
    <label for="age"><b>Date Of Birth</b></label>
    <input type="date" placeholder="Enter Age name=" name="age" required><br><br>
    
    <label for="gender"><b>Gender</b></label>
    <input type="text" placeholder="Enter Gender" name="gender" required>
    
    <label for="race"><b>Race</b></label>
    <input type="text" placeholder="Enter Race" name="race" required>
    
    <label for="nationality"><b>Nationality</b></label>
    <input type="text" placeholder="Enter Nationality" name="nationality" required>
    
    <label for="houseNumber"><b>HouseNumber</b></label>
    <input type="text" placeholder="Enter HouseNumber/unit" name="houseNumber" required>
    
    <label for="street"><b>Street</b></label>
    <input type="text" placeholder="Enter Street" name="street" required>
    
    <label for="town"><b>Town</b></label>
    <input type="text" placeholder="Enter Town" name="town" required>
    
    <label for="provence"><b>Provence</b></label>
    <input type="text" placeholder="Enter Provence" name="provence" required>
  
    
    <label for="postalCode"><b>Postal Code</b></label>
    <input type="text" placeholder="Enter Postal Code" name="postalCode" required>
    

    <label for="email"><b>Email</b></label>
    <input type="email" placeholder="Enter Email" name="email" required>
    
    <label for="cellNumber"><b>CellNumber</b></label>
    <input type="number" placeholder="Enter CellNumber" name="cellNumber" required>
    
    <label for="landLine"><b>LandLine</b></label>
    <input type="number" placeholder="Enter LandLine" name="landLine" >

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required   >
    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  </div>
  
 

  <div class="container signin">
    <p>Already have an account? <a href="login.jsp">Sign in</a>.</p>
  </div>
</form> 

</body>
</html>