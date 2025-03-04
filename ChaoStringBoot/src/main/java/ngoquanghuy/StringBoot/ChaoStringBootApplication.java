package ngoquanghuy.StringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "Chao.Controller")
public class ChaoStringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChaoStringBootApplication.class, args);
    }

}
