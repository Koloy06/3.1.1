package ru.hasa.springbootapp.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.hasa.springbootapp.model.Role;
import ru.hasa.springbootapp.model.User;

import java.util.Collection;
import java.util.List;

public interface UserService extends UserDetailsService {

    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User showUser(long id);

    void updateUser(User user);

    User findByUsername(String username);

    UserDetails loadUserByUsername(String username);

    Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles);
}
