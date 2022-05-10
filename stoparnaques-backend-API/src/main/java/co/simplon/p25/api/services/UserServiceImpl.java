package co.simplon.p25.api.services;


import javax.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;


import co.simplon.p25.api.dtos.UserCreate;
import co.simplon.p25.api.entities.User;
import co.simplon.p25.api.repositories.UserRepository;

public class UserServiceImpl implements UserService {
	private final UserRepository repository;
	private final PasswordEncoder encoder;

public  UserServiceImpl (UserRepository repository, PasswordEncoder encoder) {
this.repository = repository;
this.encoder = encoder;
}

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final PasswordEncoder encoder;

    public UserServiceImpl(UserRepository repository, PasswordEncoder encoder) {
    this.repository = repository;
    this.encoder = encoder;
    }

    @Transactional
    @Override
    public void create(UserCreate inputs) {

    User user = new User();
    user.setUsername(inputs.getUsername());
    String encoded = encoder.encode(inputs.getPassword());
    user.setPassword(encoded);
    repository.save(user);

    }
}
}