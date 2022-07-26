<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.klef.ep.models.*" %>
    <%@ page import="com.klef.ep.services.*" %>
        <%@ page import="java.util.List" %>
  <<script type="text/javascript">
function checkE()
{}
</script>
<!DOCTYPE html>
<html>
<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
  background-color: #fefefe;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
}

/* The Close Button */
.close {
  color: #aaaaaa;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}
* {box-sizing: border-box;}
.offerdata{
 margin: 200px;
  border: 5px solid #58D8DC;
  padding: 20px;
}
.modal-container{
background-color: #fff;
font-size: 14px;
text-align:center;
display:flex;
border-radius:5px;
position :fixed;
opacity:0;
pointer-events:none;
top:0;
left:0;
width: 100vw;
}
  <%
     Functions fun=new Functions();
     %>
.popup{
width :400px;
background: #fff;
border-radius: 6px;
position: absolute;
top:50%;
left40%;
transform:translate(-50%.50% );
text-align: center;
padding :0 30px 30px;
color :#333;
}
body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
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
* {
  box-sizing: border-box;
}

/* Create two unequal columns that floats next to each other */
.column {
  float: left;
  padding: 10px;
  height: 700px; /* Should be removed. Only for demonstration */
}

.left {
  width: 20%;
}

.right {
  width: 75%;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
</style>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


    <script async src="https://cdn.jsdelivr.net/npm/es-module-shims@1/dist/es-module-shims.min.js" crossorigin="anonymous"></script>
    <script type="importmap">
    {
      "imports": {
        "@popperjs/core": "https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js",
        "bootstrap": "https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.esm.min.js"
      }
    }
    </script>
   
    
    
    <%Student stu=(Student)session.getAttribute("u"); %>
<div class="header">
  <a href="#default" class="logo">Placment Portal</a>
  <div class="header-right">
    <a class="active" href="home.jsp">Home</a>
    <a href="contact.jsp">Contact</a>
    <a href="about.jsp">About Us</a>
    <a href="studentlogin.jsp">Logout</a><%%> 
    
   </div>
</div>


	<br>

<%
Functions jobs=new Functions();
List <JobOffer> list= jobs.getJobs();
for(int i=0 ; i < list.size() ; i++)
{
JobOffer j=list.get(i);
%>
<div class="container" style="background-color: grey;">
    <div class="offer data" stylr="align : center;">
<div class="card" style="border: 5px; color=green ;">
   <div class="card-body" style="background-color: cream; border-width:3px; border-style: solid; border-color: grey">
    <form action="checkElgibility" method="post">
    <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label"> Offer ID: </label>
      <div class="col-sm-7">
       <% out.println(j.getOfferid()); %>
      </div>
     </div>
      <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label"> Company : </label>
      <div class="col-sm-7">
       <% out.println(j.getOffername()); %>
      </div>
     </div>
     
     <input type="hidden" id="offerid" value="<%=j.getOfferid() %>" name="offerid">
     
     <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label"> role: </label>
      <div class="col-sm-7">
       <% out.println(j.getRole()); %>
      </div>
     </div>
     
     <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label">    Req CGPA: </label>
      <div class="col-sm-7">
       <% out.println(j.getReqCGPA()); %>
      </div>
     </div>
     
     <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label"> Salary : </label>
      <div class="col-sm-7">
       <% out.println(j.getSalary()); %>
      </div>
     </div>
       <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label">   Atmost no of Backlogs  : </label>
      <div class="col-sm-7">
       <% out.println(j.getReqminnoofbacklogs()); %>
      </div>
     </div>
     
       <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label"> No of Interships to be completed   : </label>
      <div class="col-sm-7">
       <% out.println(j.getReqnoofinternships()); %>
      </div>
     </div>
     
    
     
     <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label"> Req Btech CGPA: </label>
      <div class="col-sm-7">
       <% out.println(j.getReqCGPA()); %>
      </div>
     </div>
     
       <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label">  Required 10th Percent  : </label>
      <div class="col-sm-7">
       <% out.println(j.getReqtenthpercentage()); %>
      </div>
     </div>
     
     
     <button type="submit" class="btn btn-primary">Apply</button>
     </form>
     </div>
     </div>
     
     <% } %>
     </div>
     </div>
    
     </body>
</html>