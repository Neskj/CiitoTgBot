package neskj.CiitoTgBot;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "neskj.CiitoTgBot.Proxy")
public class FeignConfig {
}
