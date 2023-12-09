package co.simplon.p25.api.services;

import co.simplon.p25.api.dtos.users.UserCreate;
import co.simplon.p25.api.dtos.users.UserSignIn;
import co.simplon.p25.api.security.Jwt;

public interface UserService {
	void create(UserCreate inputs);

	Jwt signIn(UserSignIn inputs);
}
