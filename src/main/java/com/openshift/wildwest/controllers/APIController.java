package com.openshift.wildwest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.openshift.wildwest.helpers.PlatformObjectHelper;
import com.openshift.wildwest.models.Game;
import com.openshift.wildwest.models.Score;
import com.openshift.wildwest.models.PlatformObject;


	// oc policy add-role-to-user view system:serviceaccount:wildwest:default where wildwest
	// is the project name

	// To enable destructrive mode, a different permission needs to be added 
	// oc policy add-role-to-user edit system:serviceaccount:wildwest:default

	
@CrossOrigin(origins = "*")
@RestController
public class APIController {

	@RequestMapping("/")
	public String helloDefault() {
		return "Hello from Spring!";
	}

        @RequestMapping("/rbc")
        public String helloRBC() {
                return "Hello from RBC!";
        }  
	
}
