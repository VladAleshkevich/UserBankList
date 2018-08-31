package valley.of.death.user_bank_list.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valley.of.death.user_bank_list.entity.User;
import valley.of.death.user_bank_list.repository.UserRepository;

@Service
public class UserDAO implements IUserDAO {

    private UserRepository repository;

    @Autowired
    public void setUserRepository(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public User getUserById(Integer id){
        return repository.findById(id).orElse(null);
    }

    @Override
    public User getRichestUser(){
        return null;
    }
}
