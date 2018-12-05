package mg.odg.gen.auth;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message;

	@GetMapping("/")
	public String login(Map<String, Object> model) {
		model.put("message", this.message);
		return "auth/login";
	}
}