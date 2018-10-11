package slawek.radzikowski.springbootstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloWorld {


    @RequestMapping("/hello")
    public String hello(){
        return "Hello World !!!!!!!! :-)";
    }

}
