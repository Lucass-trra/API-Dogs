package learning.DesignPatterns_SpringBoot.service;

import learning.DesignPatterns_SpringBoot.model.Dog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "api-ninjas", url = "https://api.api-ninjas.com/v1/dogs")
public interface DogApiConnect {

    @GetMapping("?name={name}")
    Dog[] queryDog(@PathVariable("name") String name, @RequestHeader("X-Api-Key") String apiKey);
}
