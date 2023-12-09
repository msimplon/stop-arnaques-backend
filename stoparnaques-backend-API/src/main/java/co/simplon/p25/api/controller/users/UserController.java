package co.simplon.p25.api.controller.users;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.api.dtos.users.UserCreate;
import co.simplon.p25.api.dtos.users.UserSignIn;
import co.simplon.p25.api.security.Jwt;
import co.simplon.p25.api.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
	this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(
	    @RequestBody @Valid UserCreate inputs) {
	service.create(inputs);

    }

    @PostMapping("/sign-in")
    public Jwt signIn(@RequestBody UserSignIn inputs) {
	return service.signIn(inputs);
    }

}
