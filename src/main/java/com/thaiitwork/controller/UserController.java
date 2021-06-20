package com.thaiitwork.controller;

import com.thaiitwork.model.Account;
import com.thaiitwork.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("")
	public String retrive(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "user/retrive";
	}

	@GetMapping("create")
	public String showCreateForm(Model model) {
		model.addAttribute("user", new Account());
		return "user/create";
	}

	@PostMapping("create")
	public String create(@Valid Account user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			System.out.println(result.getFieldErrors());
			model.addAttribute("user", user);
			return "user/create";
		}

		userRepository.save(user);
		model.addAttribute("users", userRepository.findAll());
		return "redirect:user/retrive";
	}

	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		Account user = userRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

		model.addAttribute("user", user);
		return "user/update";
	}

	@PostMapping("update/{id}")
	public String update(@PathVariable("id") long id, @Valid Account user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			user.setId(id);
			return "user/update";
		}

		userRepository.save(user);
		model.addAttribute("users", userRepository.findAll());
		return "redirect:user/";
	}

	@GetMapping("delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Account user = userRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
		userRepository.delete(user);
		model.addAttribute("users", userRepository.findAll());
		return "user/retrive";
	}
}