package springBoot.mavenTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

@RequestMapping("/")

public String home() {
	return "hello world eclipse";
}
}
