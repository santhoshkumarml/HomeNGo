package homeNgo.server.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeNGoServerRestController {
	@RequestMapping("/checkServer")
	public String checkServer(
			@RequestParam(value = "name", defaultValue = "checkServer") String name) {
		return name;
	}
}