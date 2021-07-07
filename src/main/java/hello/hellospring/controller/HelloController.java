package hello.hellospring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")   // 호출이 http://localhost:8080/hello 매핑해준다
    public String hello(Model model){   // model은 스프링컨테이너가 생성해서 넘겨준다.
        model.addAttribute("data","hello222!!");  // model에 data=hello222!! 저장해라
        return("hello"); // hello 라는 템플릿을 찾아라
    }
}
