<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "org.redi.backend.Student" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style type="text/css" >

 <%@include file="loginStyle.css" %>

</style>

</head>
<body>
<%!

Student studentTemp = new Student();

%>
<%


studentTemp =(Student)session.getAttribute("student");


%>

<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <h2 class="active"> Sign In </h2>
    <a class="inactive underlineHover" href ="Registration.jsp">Sign Up </a>

    <!-- Icon -->
    <div class="fadeIn first">
      <img src="http://danielzawadzki.com/codepen/01/icon.svg" id="icon" alt=<% if (studentTemp !=null && studentTemp.getContactDetails().getEmail()!=null)
      {
    	  String StringTemp = studentTemp.getContactDetails().getEmail();
    	  out.println(StringTemp);
    	 
      }
      else
      {
    	  
    	  out.println("Login");
      }
    	  
    	  
    	  %> />
    </div>

    <!-- Login Form -->
    <form action="login" method = "post">
    
      <input type="text" id="login" class="fadeIn second" name="username" placeholder="student number">
      <input type="text" id="password" class="fadeIn third" name="password" placeholder="password">
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

  </div>
</div>

</body>
</html>