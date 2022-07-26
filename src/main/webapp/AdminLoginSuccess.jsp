<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
<style>
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

<%
String name="";
String pwd="";
 name=(String)session.getAttribute(name);
 pwd=(String)session.getAttribute(pwd);


%>

<div class="header">
  <a href="#default" class="logo">Placment Portal</a>
  <div class="header-right">
    <a class="active" href="home.jsp">Home</a>
    <a href="contact.jsp">Contact</a>
    <a href="about.jsp">About Us</a>
    <a href="studentlogin.jsp">Student </a><%%> 
    <a href="placmentofficer.jsp">Recruiter </a>
    <a href="adminLogin.jsp">Admin </a>
   
  </div>
</div>
<br><br><br>
  <div class="container">
    <form method="post" action="addStudent.jsf">
      
        
      <button type="submit" >Click to add Student</button>
       <script>
      
     </script>
      
      </form>
    </div>
    <br><br><br>
   <div class="container">
    <form method="post" action="addPlacmentOfficer.jsf">
      
        
      <button type="submit" >Click to add Recruiter</button>
       <script>
      
     </script>
      
      </form>
    </div>
 



</body>
</html>