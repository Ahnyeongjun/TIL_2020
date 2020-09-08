package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HeloController {

	@RequestMapping("/{num}")
	public String index(@PathVariable int num, Model model) {
		int res = 0;
		for(int i=1;i<=num;i++) res+=1;
		model.addAttribute("msg","total: " + res);
		return "index";
	}
	
// @RequestMapping("/")
// public String index(Model model) {
// model.addAttribute("msg", "<h1>END</h1><br /><h2>END</h2>");
// return "index";
// }

}

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
