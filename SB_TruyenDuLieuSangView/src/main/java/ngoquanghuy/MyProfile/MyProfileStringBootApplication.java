package ngoquanghuy.MyProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "huyquangngo.Controller")
public class MyProfileStringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProfileStringBootApplication.class, args);
    }

}
