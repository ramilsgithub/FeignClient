package az.iktlab.opendata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenDataApplication.class, args);
    }

}
