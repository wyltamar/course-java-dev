package auxiliary.classes;

import interfaces.AllowAccess;

public class AutenticateFunction {
	
	private AllowAccess access; 
	
	public boolean autenticate() {
		return access.autenticate();
	}
	
	public AutenticateFunction(AllowAccess access) {
		this.access = access;
	}

}
