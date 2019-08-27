<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "org.redi.backend.Student" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>update</title>


<style type="text/css" >

<%@include file="style.css" %>

</style>

</head>
<body>

<%!

Student studentTemp = new Student();

%>
<%


studentTemp =(Student)session.getAttribute("student");



%>




 <form action="update" method = "post">
  <div class="container">
    <h1>Update personal info</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

	<label for = "name" ><b>Name</b></label>
	<input type="text" placeholder="Enter Name" name ="name" required value=<%out.println(studentTemp.getName()) ;%>>
	
	<label for="surname"><b>Surname</b></label>
    <input type="text" placeholder="Enter Surname" name="surname" required  value=<%out.println(studentTemp.getSurname()) ;%>>
    
    <label for="south African"><b>South African ID/Passport</b></label>
    <input type="text" placeholder="Enter SA ID/Passport" name="ID" required value=<%out.println(studentTemp.getIDdoc()) ;%>>
    
    <label for="age"><b>Date Of Birth</b></label>
    <input type="date" placeholder="Enter Age name=" name="age" required value=<%out.println(studentTemp.getAge()) ;%>><br><br>
    
    <label for="gender"><b>Gender</b></label>
    <input type="text" placeholder="Enter Gender" name="gender" required value=<%out.println(studentTemp.getGender()) ;%>>
    
    <label for="race"><b>Race</b></label>
    <input type="text" placeholder="Enter Race" name="race" required value=<%out.println(studentTemp.getRace()) ;%>>
    
    <label for="nationality"><b>Nationality</b></label>
    <input type="text" placeholder="Enter Nationality" name="nationality" required value=<%out.println(studentTemp.getNationality()) ;%>>
    
    <label for="houseNumber"><b>HouseNumber</b></label>
    <input type="text" placeholder="Enter HouseNumber/unit" name="houseNumber" required value=<%out.println(studentTemp.getAddress().getHouseNumber()) ;%>>
    
    <label for="street"><b>Street</b></label>
    <input type="text" placeholder="Enter Street" name="street" required value=<%out.println(studentTemp.getAddress().getStreet()) ;%>>
    
    <label for="town"><b>Town</b></label>
    <input type="text" placeholder="Enter Town" name="town" required value=<%out.println(studentTemp.getAddress().getCity()) ;%>>
    
    <label for="provence"><b>Provence</b></label>
    <input type="text" placeholder="Enter Provence" name="provence" required value=<%out.println(studentTemp.getAddress().getProvence()) ;%>>
  
    
    <label for="postalCode"><b>Postal Code</b></label>
    <input type="text" placeholder="Enter Postal Code" name="postalCode" required value=<%out.println(studentTemp.getAddress().getPostalCode()) ;%>>
    

    <label for="email"><b>Email</b></label>
    <input type="email" placeholder="Enter Email" name="email" required value=<%out.println(studentTemp.getContactDetails().getEmail()) ;%>>
    
    <label for="cellNumber"><b>CellNumber</b></label>
    <input type="number" placeholder="Enter CellNumber" name="cellNumber" required value=<%out.println(studentTemp.getContactDetails().getCellNumber()) ;%>>
    
    <label for="landLine"><b>LandLine</b></label>
    <input type="number" placeholder="Enter LandLine" name="landLine"value=<%out.println(studentTemp.getContactDetails().getLandLine()) ;%> >

 	<label for="psw-repeat"><b>Old_Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required   >
    
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="New Password" name="password">

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat New Password" name="psw-repeat"  >
    
    
    <hr>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Submit update</button>
  </div>
  
 

  <div class="container signin">
    <p>Already have an account? <a href="login.jsp">Log out</a>.</p>
  </div>
</form> 

</body>
</html>