package io.nasvillanueva.repositories.jpa;

import io.nasvillanueva.model.entities.UserAccount;
import io.nasvillanueva.repositories.base.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jvillanueva on 8/24/16.
 */
@Repository
public interface UserAccountRepository extends BaseRepository<UserAccount, Long> {
    UserAccount findByUsername(String s);
}
