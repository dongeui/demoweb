package org.dejeong.demoweb.controller;

import org.dejeong.demoweb.DTO.TestRequestBodyDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	
	@GetMapping
	public String testController() {
		return "Hello World";
	}
	
	@GetMapping("/testGetMapping")
	public String testControllerWithPath() {
		return "Hello World! testGetMapping";
	}
	
	@GetMapping("/{id}")
	public String testControllerWithPathVariables(@PathVariable(required = false) int id) {
		return "Hello World, " + id;
	}
	
	@GetMapping("/testRequestParam")
	public String testControllerRequestParam(@RequestParam(required = false) int idd) {
		return "Hello World, " + idd + idd;
	}
	
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO dto) {
		return "Hello World, " + dto.getId() + " MSG : " + dto.getMessage();
	}
	
}
