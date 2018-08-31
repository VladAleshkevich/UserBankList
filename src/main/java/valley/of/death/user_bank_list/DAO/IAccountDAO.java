package valley.of.death.user_bank_list.DAO;

import valley.of.death.user_bank_list.entity.Account;
import java.util.List;

public interface IAccountDAO {

    List<Account> findAll();
    int getSumOfAllAccounts();

}