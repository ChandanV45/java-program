<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
</head>
<body>
<nav class="navbar bg-primary" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<h1> welcome to customer details</h1>

<form action="rohit" method="">

<label><b>SIno :</b></label>
 	<input type="text"  name="sino" id="sino"><br><br>
 	
<label><b>Fname :</b></label>
	<input type="text"  name="fname" id="fname"><br><br>
	
<label><b>Mname :</b></label>
	<input type="text"  name="mname" id="mname"><br><br>

<label><b>Lname :</b></label>
	<input type="text"  name="lname" id="lname"><br><br>
	
<label><b>Email :</b></label>
	<input type="text"  name="email" id="email"><br><br>
	
<label><b>Gender :</b></label>
	<input type="text"  name="gender" id="gender"><br><br>
	
<label><b>Contactno :</b></label>
	<input type="text"  name="contactno" id="contactno"><br><br>
	
<label><b>Area :</b></label>
	<input type="text"  name="area" id="area"><br><br>
	
<label><b>Distic :</b></label>
	<select name="Distic" id="distic">
	<option value ="Distic">Distict</option>
	<option value ="bengalore">Bengalore</option>
	<option value ="mysore">Mysore</option>
	<option value ="davangere">davangere</option>
	</select><br><br>
	
<label><b>State :</b></label>
    <select name="State" id="state">
    <option value ="State">State</option>
	<option value ="goa">Goa</option>
	<option value ="mum">mumbai</option>
	<option value ="hyd">hyderbad</option>
    </select>	<br><br>
 
<input type="button" value="submit" class="btn btn-primary">

</form>
</body>
</html>