package in.ashokit.beans;

public class PwdServiceImpl implements IPwdService{

	@Override
	public String generatePwd() {
		System.out.println("Pwd generated...");
		return "Umesh@123";
	}
	

}
