package site.dmarket.dmarketbackend.service.user;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.dmarket.dmarketbackend.domain.user.User;
import site.dmarket.dmarketbackend.domain.user.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void 회원가입(User reqDto) {
        userRepository.save(reqDto);
    }
}
