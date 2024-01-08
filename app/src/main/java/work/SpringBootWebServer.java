package work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootWebServer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebServer.class, args);
    }
}

@RestController
class MathController {

    @GetMapping("/square")
    public String square(@RequestParam double number) {
        double result = Math.pow(number, 2);
        return String.format("{\"input\": %.2f, \"result\": %.2f}", number, result);
    }
}