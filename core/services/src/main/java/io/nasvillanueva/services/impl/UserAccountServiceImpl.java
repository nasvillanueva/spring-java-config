package io.nasvillanueva.services.impl;

import io.nasvillanueva.model.entities.UserAccount;
import io.nasvillanueva.repositories.jpa.UserAccountRepository;
import io.nasvillanueva.services.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by jvillanueva on 8/24/16.
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public UserAccount loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<UserAccount> userAccount = Optional.of(userAccountRepository.findByUsername(s));
        if (!userAccount.isPresent()) {
            return null;
        }
        return userAccount.get();
    }
}
