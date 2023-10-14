package co.simplon.p25.api.services;

import co.simplon.p25.api.dtos.CreateContactRoleDto;

public interface ContactRoleService {

    void create(CreateContactRoleDto inputs);

    public boolean roleCodeValueExists(String roleCode);

    public boolean contactRoleNameValueExists(
	    String contactRoleName);

}