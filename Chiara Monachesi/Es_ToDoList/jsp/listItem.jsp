<%@page import="java.util.List"%>
<% 
List<String> lista =  (List<String>)request.getSession().getAttribute("lista");

for(int i = 0; i < lista.size(); i++)
	{ %>
	<form class="form-inline mt-3" method=post>
		<div class='form-group mx-sm-3 mb-2'>
			<input readonly type='text' class='form-control' value=' <% out.print(lista.get(i)); %>'>
			<input type='hidden' name='n' value='<% out.print(i); %>'>
		</div>
		<button type='submit' class='btn btn-primary mb-2'>-</button>
	</form>
<% } %>


</div>