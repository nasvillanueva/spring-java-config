package io.nasvillanueva.repositories.jpa;

import io.nasvillanueva.model.entities.UserAccount;
import io.nasvillanueva.model.ref.RoleType;
import io.nasvillanueva.repositories.base.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by jvillanueva on 8/24/16.
 */
@Repository
public interface UserAccountRepository extends BaseRepository<UserAccount, Long> {
    Optional<UserAccount> findByUsername(String s);

    @Query("select distinct u from UserAccount u inner join u.roles r where r.roleType = :roleType")
    List<UserAccount> findByRoleType(@Param("roleType") RoleType roleType);

}
