<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.utenti"%>
<%@page import="javax.servlet.http.HttpSession"%>
<div class="container">

	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Nome</th>
				<th scope="col">Cognome</th>
				<th scope="col">Email</th>

				<th></th>
			</tr>
		</thead>
		<tbody>
			<%
			List<utenti> listautenti = (List<utenti>) request.getAttribute("lista");
			//request.setAttribute("l", listautenti);
				for(utenti u : listautenti){
			%>
				<tr>
	  		<th><%=u.getUtenteId() %></th>
	  		<th><%=u.getNome()  %></th>
	  		<th><%=u.getCognome()  %></th>
	  		<th><%=u.getEmail()  %></th>
	  		<td><a href="d?delete=<%=u.getUtenteId()%>"type="button"class="btn btn-danger">Elimina</a></td>
	  <% 
	  }
				%>


		</tbody>
	</table>
</div>