/**
 * 
 */
package com.qpsoft.elp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author PMG
 *
 */
@Controller
public class MainController {

	@RequestMapping(method = RequestMethod.GET, value = "/index")
	public String handle() {
		return "hello";
	}
}
