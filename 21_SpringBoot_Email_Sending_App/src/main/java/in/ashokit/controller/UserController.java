package in.ashokit.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.mail.internet.MimeMessage;

@Controller
@ResponseBody
public class UserController {

	@Autowired
	private JavaMailSender mailSender;

	@GetMapping("/email")
	public String sendEmail() throws Exception {

		/*
		 * SimpleMailMessage msg = new SimpleMailMessage();
		 * 
		 * msg.setTo("gunduumesh66@gmail.com"); msg.setSubject("Welcome Umesh..!");
		 * msg.setText("This is the body of the email(test)");
		 * 
		 * mailSender.send(msg);
		 */

		MimeMessage msg = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg, true);
		helper.setTo("saisrinuaddanki8@gmail.com");
		helper.setSubject("Welcome srinu!");
		helper.setText("<h1> This is Heading </h1>", true); /*
															 * this h1 tag should not display in the body,it should
															 * proccess the tag for proccessing we kept true
															 */
		helper.addAttachment("Image", new File("D:\\oneDrive\\Pictures\\Umesh pic.jpg"));
		mailSender.send(msg);

		return "Email sent successfully";
	}

}
