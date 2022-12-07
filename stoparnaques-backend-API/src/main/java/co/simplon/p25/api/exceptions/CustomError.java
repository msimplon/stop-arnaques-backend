package co.simplon.p25.api.exceptions;

public class CustomError {
	   private String password;

	    private String username;

	    public CustomError(String password, String username) {
		this.password = password;
		this.username = username;
	    }

		public String getPassword() {
			return password;
		}



		public String getUsername() {
			return username;
		}

	
		@Override
		public String toString() {
			return "CustomError [password=" + password + ", username=" + username + "]";
		}

	 
	    
	    
	    
	   


}
