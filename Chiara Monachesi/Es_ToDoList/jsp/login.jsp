<form style="width:50%;margin:auto;" method=POST>
  <div class="form-group">
    <label for="email">Email address</label>
    <input type="email" name="email" class="form-control">
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" name="password" class="form-control">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
  <% if(request.getParameter("email") != null && request.getParameter("password") != null && 
		request.getSession().getAttribute("autorizzato").equals("no"))
	{
		out.print("<p> Credenziali sbagliate, ritenta </p>");
	}
%>
</form>

