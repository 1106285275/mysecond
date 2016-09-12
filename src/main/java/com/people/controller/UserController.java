package com.people.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.people.entity.User;
import com.people.service.UserService;

@RestController
//@RequestMapping("/user")
@EnableAutoConfiguration
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test(int id){
		System.out.println(id);
        System.out.println("test");
    }
	
	@RequestMapping(value = "/test0",method = RequestMethod.GET)
    public void test0(String id){
		System.out.println(id);
        System.out.println("test0");
    }
	
	@RequestMapping(value = "/test1",method = RequestMethod.POST)
    public void test1(@RequestParam int id){
		System.out.println(id);
        System.out.println("test1");
    }
	
	@RequestMapping(value = "/test2",method = RequestMethod.POST)
    public void test2(@RequestParam String id){
		System.out.println(id);
        System.out.println("test2");
    }
	
	@RequestMapping(value = "/user",method = RequestMethod.POST)
    public User test2(@RequestBody User user){
		user.setUsername("lpp");
        return user;
    }
	
	@RequestMapping("downloadfile")  
	public ModelAndView downloadTest(HttpServletRequest request,  
	        HttpServletResponse response) throws Exception {  
	    String storeName = "test.txt";  
	    String realName = "测试.txt";  
	    String contentType = "application/octet-stream";  
	    download(request, response, storeName, contentType, realName);  
	    return null;  
	}  
	  
	/**指定下载一个图片,如有需要可以对此方法进行扩展 
	 * @param request 
	 * @param response 
	 * @param storeName 
	 * @param contentType 
	 * @param realName 
	 * @throws Exception 
	 */  
	public void download(HttpServletRequest request,  
	        HttpServletResponse response, String storeName, String contentType,  
	        String realName) throws Exception {  
		try{
			response.setContentType("text/html;charset=UTF-8");  
		    request.setCharacterEncoding("UTF-8");  
		    String rootDir="/data/";  
		    String downLoadPath = this.getClass().getResource(rootDir + storeName).getFile();
		    long fileLength = new File(downLoadPath).length();  
		    response.setContentType(contentType);  
		    response.setHeader("Content-disposition", "attachment; filename="  
		            + new String(realName.getBytes("utf-8"), "ISO8859-1"));  
		    response.setHeader("Content-Length", String.valueOf(fileLength));  
		      
		    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(downLoadPath));  
		    BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());  
		    byte[] buff = new byte[2048];  
		    int bytesRead;  
		    while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
		        bos.write(buff, 0, bytesRead);  
		    }  
		    bis.close();  
		    bos.close();  
		}catch(Exception ex){
			
		}
	    
	}  
}
