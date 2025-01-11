package kr.ypshop.api.money;

import kr.ypshop.api.money.exception.BankException;
import kr.ypshop.api.money.exception.NotEnoughBalanceException;

import java.math.BigInteger;
import java.util.UUID;

public abstract class PlayerBank {

    /**
     * 해당 객체가 balance 만큼 금액을 갖고 있는지 확인합니다.
     * @param balance 확인 할 금액
     * @return 금액의 소지 여부
     */
    public abstract boolean hasBalance(BigInteger balance) throws BankException;

    /**
     * 해당 객체가 balance 만큼 금액을 갖고 있는지 확인합니다.
     * @param balance 확인 할 금액
     * @return 금액의 소지 여부
     */
    public abstract boolean hasBalance(int balance) throws BankException;

    /**
     * 객체에서 balance 만큼의 금액을 출금합니다.
     * @param balance 출금 할 금액
     * @throws NotEnoughBalanceException 해당 객체에 충분한 금액이 없을 경우 발생합니다.
     */
    public abstract void withdraw(BigInteger balance) throws NotEnoughBalanceException;

    /**
     * 객체에서 balance 만큼의 금액을 출금합니다.
     * @param balance 출금 할 금액
     * @throws NotEnoughBalanceException 해당 객체에 충분한 금액이 없을 경우 발생합니다.
     */
    public abstract void withdraw(int balance) throws NotEnoughBalanceException;

    /**
     * 객체에 balance 만큼의 금액을 입금합니다.
     * @param balance 입금 할 금액
     */
    public abstract void deposit(BigInteger balance) throws BankException;

    /**
     * 객체에 balance 만큼의 금액을 입금합니다.
     * @param balance 입금 할 금액
     */
    public abstract void deposit(int balance) throws BankException;

    /**
     * 객체의 금액을 balance 로 설정합니다.
     * @param balance 설정 할 금액
     */
    public abstract void set(BigInteger balance) throws BankException;

    /**
     * 객체의 금액을 balance 로 설정합니다.
     * @param balance 설정 할 금액
     */
    public abstract void set(int balance) throws BankException;

    /**
     * 객체가 현재 보유중인 금액을 반환합니다.
     * @return 현재 보유중인 금액
     */
    public abstract BigInteger getBalance();

    /**
     * 해당 객체와 연결된 플레이어의 UUID를 반환합니다.
     * @return 해당 객체와 연결된 플레이어의 UUID
     */
    public abstract UUID getOwner();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerBank bank)) {
            return false;
        }
        return bank.getOwner().equals(this.getOwner());
    }
}
