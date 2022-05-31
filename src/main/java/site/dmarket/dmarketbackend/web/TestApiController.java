package site.dmarket.dmarketbackend.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.dmarket.dmarketbackend.service.user.UserService;
import site.dmarket.dmarketbackend.util.MySMS;
import site.dmarket.dmarketbackend.web.dto.user.UserJoinReqDto;

@RequiredArgsConstructor
@RestController
public class TestApiController {

    private final MySMS mySMS;

    private final UserService userService;

    @PostMapping("/sendSMS")
    public ResponseEntity<?> sendSMS(@RequestBody String phoneNumber) {

        String authId = mySMS.sendSMS(phoneNumber);

        return new ResponseEntity<>(authId, HttpStatus.OK);
    }

    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody UserJoinReqDto reqDto) {

        userService.회원가입(reqDto.toEntity());

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
