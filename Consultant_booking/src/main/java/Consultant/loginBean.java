package Consultant;

public class loginBean {
	private String email;
	private String consultant_password;
	
	public loginBean(String email, String password) {
        this.email = email;
        this.consultant_password = password;
    }
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConsultant_password() {
		return this.consultant_password;
	}
	public void setConsultant_password(String consultant_password) {
		this.consultant_password = consultant_password;
	}

	
	
}
