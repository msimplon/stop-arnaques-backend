package co.simplon.p25.api.controller.SendMail;
//package co.simplon.p25.api.controller;
//
//import javax.validation.Valid;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import co.simplon.p25.api.dtos.SendEmailDto;
//import co.simplon.p25.api.services.EmailService;
//
//@RestController
//@RequestMapping("/send-mail")
//public class MailController {
//
//    private final EmailService service;
//
//    public MailController(EmailService service) {
//	this.service = service;
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void sendSimpleMail(
//	    @Valid @RequestBody SendEmailDto inputs) {
//	this.service.sendSimpleMail(inputs);
//    }
//
//}