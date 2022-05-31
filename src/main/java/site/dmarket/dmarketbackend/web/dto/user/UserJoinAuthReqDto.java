package site.dmarket.dmarketbackend.web.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserJoinAuthReqDto {
    private String phoneNumber;
}
