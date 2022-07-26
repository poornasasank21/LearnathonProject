<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
 border: 1px solid #888;
 width: 90%; 
  border: 1px solid #888;
  margin: 5% auto 5% auto;
  border-radius: 4px;
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #58D8DC;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #58D8DC;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #58D8DC;
  text-align: center;
}
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #58D8DC;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
</head>
<body>

<div class="header">
  <a href="#default" class="logo">Placment Portal</a>
  <div class="header-right">
    <a  href="home.jsp">Home</a>
    <a href="contact.jsp">Contact</a>
    <a href="about.jsp">About Us</a>
    <a href="POSearchform.jsp"> Search Student </a><%%> 
    <a href="placmentofficer.jsp">Placment officer </a>
    <a href="adminLogin.jsp">Admin </a>
  </div>
</div>
<br><br>

<form action="searchStudentServlet" method="post">
  <div class="container" >
    <h1>Search Student</h1>
    
    <hr>

    <label for="offerid"><b>Student  ID:</b></label>
    <input type="text" placeholder="Enter Student ID" name="studentid" id="offerid" required>



    
    
    
    
    
    
    
    <button type="submit" class="registerbtn">Register</button>
  </div>
  
  
</form>


</body>
</html>