package amazing.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
                
        @GetMapping(
            value = "/api/message",
            produces = MediaType.APPLICATION_JSON_VALUE)
        public String message() {

            return "{\"Message\":\"kikikiki!\"}";
        }
}
