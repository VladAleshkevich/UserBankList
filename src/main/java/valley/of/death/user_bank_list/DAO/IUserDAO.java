package valley.of.death.user_bank_list.DAO;

import valley.of.death.user_bank_list.entity.User;

public interface IUserDAO {

    User getUserById(Integer id);
    User getRichestUser();
}
