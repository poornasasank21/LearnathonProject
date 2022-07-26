<html>
  <head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
    <title>session implicit object example</title>
  </head>
  <body> 
  <div class="container">
  <h1>Student Register Form:</h1>
  <div class="card">
   <div class="card-body">
    <form action="<%=request.getContextPath()%>/register" method="post">

     <div class="form-group row">
      <label for="firstName" class="col-sm-2 col-form-label">Student Id</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="id" placeholder="enter your id" />
      </div>
     </div>

     <div class="form-group row">
      <label for="Name" class="col-sm-2 col-form-label">Name</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="name"placeholder="Enter  name">
      </div>
     </div>

     <div class=" form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">DOB</label>
      <div class="col-sm-7">
       <input  type="text" class="form-control" name="DOB" placeholder="Enter date of birth">
      </div>
     </div>

     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Gender</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="gender" placeholder="Enter gender">
      </div>
     </div>

 
     
         
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Address</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="adress" placeholder="Enter Address">
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">contact number</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="pnum" placeholder="Enter Address">
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Email</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="email" placeholder="Enter Address">
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Password</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="password" placeholder="Enter Address">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Educational details</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="University" placeholder="Enter Address">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">join date</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="joindate" placeholder="Enter Address">
      </div>
     </div>
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">end date</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="endingdate" placeholder="Enter Address">
      </div>
     </div>
     
      <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">CGPA</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="cgpa" placeholder="Enter Address">
      </div>
     </div>
     
      <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">BRANCH</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="branch"placeholder="Enter Address">
      </div>
     </div>
     
      <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">About myself </label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="aboutme" placeholder="Enter Address">
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Nof intersips ceritified </label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="noofintershipscertidied" placeholder="Enter Address">
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">No of backlogs </label>
      <div class="col-sm-7">
       <input  type="text" class="form-control" name="noofbacklogs" placeholder="Enter Address">
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">Linkedin url</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name=" linkedinurl"placeholder="Enter Address">
      </div>
     </div>
     
     
     <div class="form-group row">
      <label for="lastName" class="col-sm-2 col-form-label">About your tech knowldge</label>
      <div class="col-sm-7">
       <input type="text" class="form-control" name="technicalskill" placeholder="Enter Address">
      </div>
     </div>
     
     

     <button type="submit" class="btn btn-primary">Submit</button>
    </form>
   </div>
  </div>
 </div>
<h3>This is student's register page.</h3>
<h1>
<% 

%>
<%

%></h1>
    <%
      
    %>
    <div>
       
       </div>
  </body>
</html>





   
   