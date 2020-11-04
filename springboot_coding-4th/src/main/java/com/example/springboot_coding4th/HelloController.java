package com.example.springboot_coding4th;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");
        return mav;
    }
//    @RequestMapping("/{tax}")
//    public ModelAndView index(@PathVariable int tax,
//                              ModelAndView mav) {
//        mav.setViewName("index");
//        mav.addObject("tax",tax);
//        return mav;
//    }
//    @RequestMapping("/")
//    public ModelAndView index(ModelAndView mav) {
//        mav.setViewName("index");
//        mav.addObject("msg","current data.");
//        DataObject obj = new DataObject(123, "lee","lee@flower");
//        mav.addObject("object",obj);
//        return mav;
//    }
    @RequestMapping("/other")
    public String other() {
        return "redirect:/";
    }

    @RequestMapping("/home")
    public String home() {
        return "forward:/";
    }
//    //restcontroller란 rest는 representatve state transfer의 약자로 분산 시스템을 위한아키텍쳐이다.
//

}
