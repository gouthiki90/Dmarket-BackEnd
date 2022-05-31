package site.dmarket.dmarketbackend.web.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.dmarket.dmarketbackend.domain.user.User;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserJoinReqDto {
    private String phoneNumber;
    private String email;
    private String region;

    public User toEntity() {
        User user = new User();
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        user.setRegion(region);
        return user;
    }
}
