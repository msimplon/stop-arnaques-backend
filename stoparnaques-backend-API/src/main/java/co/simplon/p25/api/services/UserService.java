package co.simplon.p25.api.services;

import co.simplon.p25.api.dtos.UserCreate;
import co.simplon.p25.api.dtos.UserSignIn;

public interface UserService {
void create (UserCreate inputs);

Object signIn (UserSignIn inputs);
}
