package co.simplon.p25.api.services;

import co.simplon.p25.api.dtos.UserCreate;
import co.simplon.p25.api.dtos.UserSignIn;
import co.simplon.p25.api.security.Jwt;

public interface UserService {
	void create(UserCreate inputs);

	Jwt signIn(UserSignIn inputs);
}
