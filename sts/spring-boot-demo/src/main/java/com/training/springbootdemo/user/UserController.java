package com.training.springbootdemo.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public Iterable<User> findAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/{id}")
	public Object findUserById(@PathVariable int id) throws UserNotFoundException {

		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new UserNotFoundException("User Not Found");
		}
	}

	@PostMapping
	public String addUser(@RequestBody User user) {
		userRepository.save(user);
		return "Created New User";
	}

	@PutMapping
	public String updateUser(@RequestBody User user) {
		userRepository.save(user);
		return "Updated User";
	}

	@DeleteMapping
	public String deleteUser(@RequestParam int id) {
		userRepository.deleteById(id);
		return "Deleted User";
	}

}
