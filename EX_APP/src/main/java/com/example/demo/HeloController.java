package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HeloController {
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}
	
@RequestMapping("/other")
	public String other() {
	return "redirect:/";
}
@RequestMapping("/home")
	public String home() {
	return "forward:/";
}
}
	
//	@RequestMapping(value = "/", method= RequestMethod.GET)
//	public ModelAndView index(ModelAndView mav) {
//		mav.setViewName("index");
//		mav.addObject("msg","폼을 전송시켜주세요");
////		mav.addObject("msg","이름 적어 전송");
//		return mav;
//	}
//	@RequestMapping(value = "/", method= RequestMethod.POST)
//	public ModelAndView send(
//			@RequestParam(value="check1",required = false) boolean check1,
//			@RequestParam(value="radio1",required = false) String  radio1,
//			@RequestParam(value="select1",required = false) String select1,
//			@RequestParam(value="select2",required = false) String[] select2,
//			ModelAndView mav) {
//			
//		String res = "";
//		try {
//			res = "check: " + check1 +
//				"\n radio: " + radio1 +
//				"\n select: " + select1 +
//				"\n select2:";
//		}catch(NullPointerException e) {}
//		try {
//			res += select2[0];
//			for(int i = 1;i<select2.length;i++)
//				res += "," + select2[i];
//		}
//		catch (NullPointerException e) {
//			res +="null";
//		}
//		mav.addObject("msg", res);
//		mav.setViewName("index");
//		return mav;
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public ModelAndView send(@RequestParam("text1")String str, ModelAndView mav) {
//		mav.addObject("msg","안녕하세요!"+str+"님!");
//		mav.addObject("value", str);
//		mav.setViewName("index");
//		return mav;
//	}

	
	
	
//	@RequestMapping("/{num}")
//	public ModelAndView index(@PathVariable int num, ModelAndView mav) {
//		int res = 0;
//		for(int i=1;i<=num;i++) 
//			res += i;
//		mav.addObject("msg","total:" +res);
//		mav.setViewName("index");
//		return mav;
//	}

//	@RequestMapping("/{num}")
//	public String index(@PathVariable int num, Model model) {
//		int res = 0;
//		for(int i=1;i<=num;i++) 
//			res += i;
//		model.addAttribute("msg","total: " + res);
//		return "index";
//	}
	
// @RequestMapping("/")
// public String index(Model model) {
// model.addAttribute("msg", "<h1>END</h1><br /><h2>END</h2>");
// return "index";
// }



//import org.springframework.web.bind.annotation.RequestMapping;
////import 안되면 Sprng web 추가 (프로젝트 생성할떄)
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HeloController {
//	
//
//	@RequestMapping	("/")
//	public String index() {
//		return "index";
//	}
//}
////String[] names = {"a1","a2","a3","a4","a5"};
////String[] mails = {"a@1","a@2","a@3","a@4","a@5"};
////	@RequestMapping("/{num}")
////	public String index(@PathVariable int num) {
////		int res = 0;
////		for(int i=1;i<=num;i++) res +=1;
////		return "total:"+ res;
////	}
////}
////	@RequestMapping("/{id}")
////	public DataObject index2(@PathVariable int id) {
////		return new DataObject(id,names[id],mails[id]);
////	}
////	}
////class DataObject{
////	private int id;
////	private String name;
////	private String value;
////	
////	public DataObject(int id,String name, String value) {
////		super();
////		this.id=id;
////		this.name= name;
////		this.value = value;
////	}
////	
////	
////	public int getId() {
////		return id;
////	}
////
////	public void setId(int id) {
////		this.id = id;
////	}
////
////	public String getName() {
////		return name;
////	}
////
////	public void setName(String name) {
////		this.name = name;
////	}
////
////	public String getValue() {
////		return value;
////	}
////
////	public void setValue(String value) {
////		this.value = value;
////	}
//
//	
////}
////	
//
