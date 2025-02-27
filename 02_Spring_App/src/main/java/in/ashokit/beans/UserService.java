package in.ashokit.beans;

public class UserService {

	private PwdService pwdService;

	public UserService() {
		System.out.println("User Service::constructor");
	}

	// Setter injection performed.
	public void setPwdService(PwdService pwdService) {
		this.pwdService = pwdService;
	}

	public void saveUser(String username, String pwd, Long phno) {
		String encodedPwd = pwdService.encodePwd(pwd);
		System.out.println("Encoded Pwd :: " + encodedPwd);

		// insert into DB.
		System.out.println("Record inserted in DB");
	}

}
