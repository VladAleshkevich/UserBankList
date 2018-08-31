package valley.of.death.user_bank_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import valley.of.death.user_bank_list.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}