package kr.ypshop.api.money.exception;

import kr.ypshop.api.money.PlayerBank;

public class ConflictBankException extends BankException {

    public ConflictBankException(PlayerBank bank) {
        super(bank, "이미 존재하는 PlayerBank 입니다!");
    }
}
