
<%@ page import="com.klef.ep.services.JobOfferServiceImpl" %>
<%@ page import="com.klef.ep.models.JobOffer" %>
<%@ page import="com.klef.ep.models.Student" %>
<%@ page import="java.util.List" %>

<html>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
	<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
<style>

* {box-sizing: border-box;}
.offerdata{
 margin: 200px;
  border: 5px solid #58D8DC;
  padding: 20px;
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
	
		<title>Student home</title>
	</head>


<body> 

<div class="header">
  <a href="#default" class="logo">Placment Portal</a>
  <div class="header-right">
    <a class="active" href="home.jsp">Home</a>
    <a href="contact.jsp">Contact</a>
    <a href="about.jsp">About Us</a>
    <a href="student_offer.jsp">Apply Job</a><%%>
    <a href="studentlogin.jsp">Logout </a><%%> 
    <a >
    <%  String uname=(String)session.getAttribute("uname");
    
    
    Student u=(Student)session.getAttribute("u");
    
    %><h3><% 
    out.print(uname);
    
    
    %>
    
	<%
	session.setAttribute("u", u);
	%>
    </h3>
    </a>
    
  </div>
</div>

	


<div class="row">
  <div class="column left" style="background-color:grey;">
  <h1 align="center" >Menu</h1>
    <h2 align="center">   Profile</h2><br>
    <h2 align="center">   Job offer's</h2>
   
  </div>
  

  <div class="column right" style="background-color:white;">
   <div class="container">
    <div class="offer data">
    <!-- 
       <div class="offerdata">
          <h3>Job Offers</h3>
       </div>-->
    </div>
    
   
  <h1>Profile</h1>
  <div class="card">
   <div class="card-body">
    <form action="" method="post">

     <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label">Student Id : </label>
      <div class="col-sm-7">
       <%out.print(u.getId()); %>
      </div>
     </div>

     <div class="form-group row">
      <label for="Name" class="col-sm-2 col-form-label">Name</label>
      <div class="col-sm-7">
        <%out.print(u.getName()); %>
      </div>
     </div>

     <div class=" form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">DOB</label>
      <div class="col-sm-7">
       <%out.print(u.getDOB()); %>
      </div>
     </div>

     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Gender</label>
      <div class="col-sm-7"> 
      <%out.print(u.getGender()); %>
      </div>
     </div>

 
     
         
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Address</label>
      <div class="col-sm-7">
      <%out.print(u.getAdress()); %>
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">contact number</label>
      <div class="col-sm-7">
       <%out.print(u.getPnum()); %>
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Email</label>
      <div class="col-sm-7">
       <%out.print(u.getEmail()); %>
      </div>
     </div>
     
     
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Educational details</label>
      <div class="col-sm-7">
       
      </div>
     </div>
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">join date</label>
      <div class="col-sm-7">
       <%out.print(u.getJoindate()); %>
      </div>
     </div>
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">end date</label>
      <div class="col-sm-7">
        <%out.print(u.getEndingdate()); %>
      </div>
     </div>
     
      <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">CGPA</label>
      <div class="col-sm-7">
        <%out.print(u.getCgpa()); %>
      </div>
     </div>
     
      <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">BRANCH</label>
      <div class="col-sm-7">
        <%out.print(u.getBranch()); %>
      </div>
     </div>
     
      <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">About myself </label>
      <div class="col-sm-7">
      <%out.print(u.getAboutme()); %>
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Nof intersips ceritified </label>
      <div class="col-sm-7">
       <%out.print(u.getNoofintershipscertidied()); %>
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">No of backlogs </label>
      <div class="col-sm-7">
        <%out.print(u.getNoofbacklogs()); %>
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Linkedin url</label>
      <div class="col-sm-7">
        <%out.print(u.getLinkedinurl()); %>
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">About your tech knowldge</label>
      <div class="col-sm-7">
        <%out.print(u.getTechnicalskill()); %>
      </div>
     </div>
     
     

     <button type="submit" class="btn btn-primary">Edit</button>
    </form>
   </div>
  </div>
 </div>

  </div>
</div>
	
	</body>
</html>