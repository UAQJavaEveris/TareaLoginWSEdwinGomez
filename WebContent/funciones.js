/**
 * 
 */

function validarInputLogin(){
	var usuario = document.forms["frmLogin"]["user"].value;
	var pass = document.forms["frmLogin"]["pw"].value;
	
	for(var i = 0; i < usuario.length; i++){
		if(!(isNaN(usuario[i]))){
			alert("Los campos no pueden contener numeros, verifique el usuario");
			return false;
		}	
	}
	
	for(var i = 0; i < pass.length; i++){
		if(!(isNaN(pass[i]))){
			alert("Los campos no pueden contener numeros, verifique el password");
			return false;
		}	
	}
	
	return true;
}