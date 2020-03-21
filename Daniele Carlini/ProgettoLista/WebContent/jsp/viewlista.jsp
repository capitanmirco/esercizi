<%@page import="java.util.ArrayList"%>
<div class ="container">
<br><br><br>
<h1>Inserisci Qualcosa alla Lista</h1>


<form class="form-row" method="get">
  <div class="col-md-9 mb-7">
    <label for="inputPassword2" class="sr-only">Lista</label>
    <input type="text" class="form-control" id="inputPassword2" name="lista">
    <input type="hidden" name="id" value="list">
  </div>
  <button type="submit" class="btn btn-primary mb-2">AGGIUNGI</button>
</form>
</div>



<div class ="container">

<%
//creazione arralist nella jsp
	ArrayList<String> l = (ArrayList<String>)request.getAttribute("lista");
%>    

<table class="table">
  <thead>
    <tr>
      <th scope="col"># Cosa Hai Aggiunto Alla Lista</th>
    </tr>
  </thead>
  <tbody>
		
	
<% 	
//creazione tabella dinamica con chiamata alla cancellazione dei row inseriti
if(l!=null){
	for(int i=0;i<l.size();i++){

    out.print("<tr>");
    out.print("<th scope=" + "row" + ">" + i +"</th>");
    out.print("<td>" + l.get(i) + "</td>");
    out.print("<td><a href=\"?cancella=" + l.get(i) + "\"><input type=\"button\" class=\"btn btn-danger\" value=\"cancella\"></a></td>");
    out.print("</tr>");
    
	}
	
	request.getSession().setAttribute("lista", l);
}

%>

  </tbody>
</table>

</div>