package mih.me.SimpleSpringMVCProject;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("home", "userModel", new User());
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Valid @ModelAttribute("userModel") User user, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())return "home";
		model.addAttribute("user", user);
		return "user";
	}
	
	@RequestMapping(value = "/get-json-user/{name}/{pwd}/{admin}", method = RequestMethod.GET, produces = "application/xml")
	@ResponseBody
	public User getJsonUser(@PathVariable("name") String name, @PathVariable("pwd") String pwd, @PathVariable("admin") boolean admin) {
		User user = new User();
		user.setName(name);
		user.setPwd(pwd);
		user.setAdmin(admin);
		return user;		
	}
	
	@RequestMapping(value ="/put-json-user", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<String> putJsonUser(@RequestBody User user){
		logger.info(user.toString());
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	
}














