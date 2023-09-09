//package co.simplon.p25.api.services;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import co.simplon.p25.api.dtos.EmailTemplateDto;
//import co.simplon.p25.api.entities.EmailTemplate;
//import co.simplon.p25.api.repositories.EmailTemplateRepository;
//
//@Service
//@Transactional(readOnly = true)
//public class EmailTemplateServiceImpl
//	implements EmailTemplateService {
//
//    private final EmailTemplateRepository emailTemplates;
//
//    public EmailTemplateServiceImpl(
//	    EmailTemplateRepository emailTemplates) {
//	this.emailTemplates = emailTemplates;
//    }
//
//    @Override
//    @Transactional
//    public void update(Long id, EmailTemplateDto inputs) {
//
//	EmailTemplate entity = emailTemplates.findById(id)
//		.get();
//
//	entity.setTemplateSubject(
//		inputs.getTemplateSubject());
//	entity.setTemplateBody(inputs.getTemplateBody());
//	this.emailTemplates.save(entity);
//    }
//
//}