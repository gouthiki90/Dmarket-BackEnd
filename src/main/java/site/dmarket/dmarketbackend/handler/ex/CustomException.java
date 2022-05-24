package site.dmarket.dmarketbackend.handler.ex;

public class CustomException extends RuntimeException{ // 컨트롤러

    public CustomException(String message) { // 런타임 예외 시 메시지 받기
        super(message);
    }
    
}
