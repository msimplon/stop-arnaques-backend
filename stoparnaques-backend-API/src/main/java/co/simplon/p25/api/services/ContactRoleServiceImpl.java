//package co.simplon.p25.api.services;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import co.simplon.p25.api.dtos.CreateContactRoleDto;
//import co.simplon.p25.api.entities.ContactRole;
//import co.simplon.p25.api.repositories.ContactRoleRepository;
//
//@Service
//@Transactional(readOnly = true)
//public class ContactRoleServiceImpl
//	implements ContactRoleService {
//
//    private final ContactRoleRepository contactRolesRepo;
//
//    public ContactRoleServiceImpl(
//	    ContactRoleRepository contactRolesRepo) {
//	this.contactRolesRepo = contactRolesRepo;
//    }
//
//    @Transactional
//    @Override
//    public void create(CreateContactRoleDto inputs) {
//	ContactRole contactRole = new ContactRole();
//	contactRole.setContactRoleName(
//		inputs.getContactRoleName());
//	contactRole.setRoleCode(inputs.getRoleCode());
//	this.contactRolesRepo.save(contactRole);
//    }
//
//    @Override
//    public boolean roleCodeValueExists(String roleCode)
//	    throws UnsupportedOperationException {
//	return this.contactRolesRepo
//		.existsByRoleCode(roleCode.toString());
//    }
//
//    @Override
//    public boolean contactRoleNameValueExists(
//	    String contactRoleName)
//	    throws UnsupportedOperationException {
//	return this.contactRolesRepo
//		.existsByContactRoleName(
//			contactRoleName.toString());
//    }
//
//}