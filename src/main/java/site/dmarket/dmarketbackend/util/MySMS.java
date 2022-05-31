package site.dmarket.dmarketbackend.util;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API
 *        PHP
 */
@Component
public class MySMS {

    public String sendSMS(String phoneNumber) {
        String api_key = "NCS8OFX6GAFQ5YPA";
        String api_secret = "KOO6FLCC4TZXWO750FD3FRLHLLQETI9S";
        Message coolsms = new Message(api_key, api_secret);
        String authId = getSalt();

        // 4 params(to, from, type, text) are mandatory. must be filled
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", phoneNumber);
        params.put("from", "01041235561"); // 등록된 번호
        params.put("type", "SMS");
        params.put("text", "회원가입 인증번호는 [" + authId + "] 입니다.");

        try {
            JSONObject obj = (JSONObject) coolsms.send(params);
            System.out.println(obj.toString());
        } catch (CoolsmsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }
        return authId;
    }

    public String getSalt() {
        String uniqId = "";
        Random randomGenerator = new Random();

        // length - set the unique Id length
        for (int length = 1; length <= 6; ++length) {
            int randomInt = randomGenerator.nextInt(10); // digit range from 0 - 9
            uniqId += randomInt + "";
        }

        return uniqId;
    }
}