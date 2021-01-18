package ru.hasa.springbootapp.dao;

import ru.hasa.springbootapp.model.Role;

public interface RoleDao {

    Role findByRolename(String name);
}
