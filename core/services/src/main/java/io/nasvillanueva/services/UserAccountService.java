package io.nasvillanueva.services;

import io.nasvillanueva.model.dto.UserAccountDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by jvillanueva on 8/24/16.
 */
public interface UserAccountService extends UserDetailsService {

    UserAccountDto get(Long id);

    List<UserAccountDto> getAll();

    UserAccountDto create(UserAccountDto userAccountDto);

    UserAccountDto update(UserAccountDto userAccountDto);
}
