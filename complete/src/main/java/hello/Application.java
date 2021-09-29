package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
<<<<<<< HEAD
		return "Welcome to Aetna Docker World Update 15 ";
=======
		return "Welcome to Aetna Docker World Update 14 ";
>>>>>>> 4988eea4addf770ecce411077b5d8e8575e5bba5
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
