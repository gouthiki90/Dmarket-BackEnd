package site.dmarket.dmarketbackend.handler.ex;

public class CustomApiException extends RuntimeException { // api 컨트롤러

    public CustomApiException(String message) { // 런타임 예외 시 메시지 받기
        super(message);
    }
}
