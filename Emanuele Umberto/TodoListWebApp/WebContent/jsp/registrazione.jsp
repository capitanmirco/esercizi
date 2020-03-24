<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class="container">
	<h1>Register Page</h1>
	<form method="post">
	  <div class="form-group">
	    <label for="exampleInputEmail1">Email address</label>
	    <input type="text" name="nome" class="form-control" id="exampleInputEmail1">
	  </div>
	  <div class="form-group">
	    <label for="exampleInputEmail1">Email address</label>
	    <input type="text" name="cognome" class="form-control" id="exampleInputEmail1">
	  </div>
	  <div class="form-group">
	    <label for="exampleInputEmail1">Email address</label>
	    <input type="email" name="email" class="form-control" id="exampleInputEmail1" required="required">
	  </div>
	  <% if(request.getAttribute("presente") != null && (boolean) request.getAttribute("presente")) { %>	
	  		<div class="alert alert-danger" role="alert">
		  	  E-mail già presente!!! (<%= request.getParameter("email") %>)
		  	</div>
	  <% } %>
	  <div class="form-group">
	    <label for="exampleInputPassword1">Password</label>
	    <input type="password" name="password" class="form-control" id="exampleInputPassword1">
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>