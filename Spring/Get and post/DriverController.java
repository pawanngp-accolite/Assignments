package com.springdemo.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springdemo.tutorial.Driver;



@Controller
public class DriverController {
	
	@RequestMapping(value = "/getDriver",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public Driver getDriver(){
		 Driver driver = new Driver();
		 driver.setDriverId(1);
		 driver.setDriverName("pawan");
		 return driver;
	}
	
	@RequestMapping(value="/getDrivers",method=RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public Driver getDrivers(@RequestParam("id")int id){
		Driver driver = new Driver();
	    driver.setDriverId(id);
	    driver.setDriverName("unknown");
	    return driver;
	}
	
	@RequestMapping(value="/getDriver/{id}",method=RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public Driver getDriver(@PathVariable("id")int id){
		Driver driver = new Driver();
	    driver.setDriverId(id);
	    driver.setDriverName("unknown");
	    return driver;
	}
	@RequestMapping(value = "/driver", method = RequestMethod.GET)
	   public ModelAndView driver() {
	      return new ModelAndView("driver", "command", new Driver());
	   }
		@RequestMapping(value = "/addDriver", method = RequestMethod.POST)
    public String addDriver(@ModelAttribute("driver") Driver driver, ModelMap model) {

    System.out.println(driver.getDriverName()+":" +driver.getDriverId());

    
    return "result";
 }
	
	
	
	

}
