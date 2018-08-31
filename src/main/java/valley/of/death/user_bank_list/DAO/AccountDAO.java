package valley.of.death.user_bank_list.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valley.of.death.user_bank_list.entity.Account;
import valley.of.death.user_bank_list.repository.AccountRepository;

import java.util.List;

@Service
public class AccountDAO implements IAccountDAO {

    private AccountRepository repository;

    @Autowired
    public void setAccountRepository(AccountRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Account> findAll(){
        return repository.findAll();
    }

    @Override
    public int getSumOfAllAccounts(){
        return 1;
    }
}
