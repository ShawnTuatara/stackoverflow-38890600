package ca.tuatara.stackoverflow;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class GreetingController {
	@GetMapping(value = "/gJson", produces = MediaType.APPLICATION_JSON_VALUE)
	public MyPojo gJson() {
		return new MyPojo("Windows 10", System.currentTimeMillis());
	}
}