package site.dmarket.dmarketbackend.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.dmarket.dmarketbackend.util.MySMS;

@RequiredArgsConstructor
@RestController
public class TestApiController {

    private final MySMS mySMS;

    @PostMapping("/sendSMS")
    public ResponseEntity<?> SendSMS(@RequestBody String phoneNumber) {

        String authId = mySMS.sendSMS(phoneNumber);

        return new ResponseEntity<>(authId, HttpStatus.OK);
    }
}
