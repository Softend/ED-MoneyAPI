package kr.ypshop.api.money;

import kr.ypshop.api.money.exception.BankException;
import kr.ypshop.api.money.exception.ConflictBankException;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

public interface ServerBank {

    /**
     * 해당 UUID를 가진 플레이어의 PlayerBank 를 가져옵니다.
     * @param uuid
     * @return PlayerBank
     */
    PlayerBank getBank(UUID uuid);

    /**
     * 해당 UUID를 가진 플레이어의 새 PlayerBank 객체를 생성합니다.
     * @param uuid
     * @return PlayerBank
     */
    PlayerBank createBank(UUID uuid);

    /**
     * 해당 UUID와 balance를 가진 PlayerBank를 등록합니다.
     * @param uuid
     * @param balance
     * @return PlayerBank
     */
    PlayerBank registerBank(UUID uuid, BigInteger balance) throws ConflictBankException;

    /**
     * PlayerBank를 등록합니다.
     * @param bank
     * @return PlayerBank
     */
    PlayerBank registerBank(PlayerBank bank) throws ConflictBankException;

    /**
     * 등록 된 모든 PlayerBank 를 가져옵니다.
     * @return 모든 PlayerBank
     */
    List<PlayerBank> getBanks();
}
