package kr.ypshop.api.money.exception;

import kr.ypshop.api.money.PlayerBank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class BankException extends RuntimeException {

    @Getter
    private PlayerBank bank;
    private String message;

    @Override
    public String getMessage() {
        return message;
    }
}
