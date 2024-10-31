package kr.ypshop.api.money.exception;

import kr.ypshop.api.money.PlayerBank;

public class NotEnoughBalanceException extends BankException {
    public NotEnoughBalanceException(PlayerBank bank) {
        super(bank,"플레이어의 잔액이 부족합니다.");
    }
}
