package in.ashokit.beans;

public class UserService {

	private PwdService pwdService;

	public UserService() {
		System.out.println("UserService::Constructor");
	}

	public void setPwdService(PwdService pwdService) {
		this.pwdService = pwdService;
	}

	public void saveUser(String name, String pwd, Long phno) {

		String encodedPwd = pwdService.encodedPwd(pwd);
		System.out.println("Encoded Pwd::" + encodedPwd);

	}

}
