<div>
	<form method="post">
	  <div class="form-row">
	    <div class="col-md-4 mb-3">
	      <label for="validationServer01">Nome</label>
	      <input type="text" class="form-control" id="validationServer01" name="nome" required>
	      <div class="valid-feedback">
	        Looks good!
	      </div>
	    </div>
	    <div class="col-md-4 mb-3">
	      <label for="validationServer02">Cognome</label>
	      <input type="text" class="form-control" id="validationServer02" name="cognome" required>
	      <div class="valid-feedback">
	        Looks good!
	      </div>
	    </div>
	    <div class="col-md-4 mb-3">
	      <label for="validationServerUsername">E-mail</label>
	      <div class="input-group">
	        <input type="email" class="form-control" id="validationServerUsername" aria-describedby="inputGroupPrepend3" name="email" required>
	        <div class="invalid-feedback">
	          Inserire un'e-mail.
	        </div>
	      </div>
	    </div>
	  </div>
	  <div class="form-row">
	    <div class="col-md-6 mb-3">
	      <label for="validationServer03">Password</label>
	      <input type="password" class="form-control" id="validationServer03" name="password" required>
	      <div class="invalid-feedback">
	        Inserire una password.
	      </div>
	    </div>
	  </div>
	  <button class="btn btn-primary" type="submit">Registra</button>
	</form>
</div>