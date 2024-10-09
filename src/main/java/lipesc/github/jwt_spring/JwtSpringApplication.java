package lipesc.github.jwt_spring;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JwtSpringApplication {

  public static void main(String[] args) {
    SpringApplication.run(JwtSpringApplication.class, args);
  }

  @Bean
  ApplicationRunner Runner(PasswordEncoder passwordEncoder) {
    return args -> System.out.println(passwordEncoder.encode("password"));
  }
}
