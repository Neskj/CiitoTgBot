package neskj.CiitoTgBot.Proxy;

import neskj.CiitoTgBot.Model.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Feign",url = "http://185.198.152.105:8086")
public interface Proxy {

    @PostMapping("/whatweather")
    String getFromApi(@RequestBody City city);
}
