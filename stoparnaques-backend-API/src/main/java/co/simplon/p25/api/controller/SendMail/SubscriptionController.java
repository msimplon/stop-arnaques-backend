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
//import co.simplon.p25.api.dtos.CreateSubscriptionDto;
//import co.simplon.p25.api.services.SubscriptionService;
//
//@RestController
//@RequestMapping("/subscriptions")
//public class SubscriptionController {
//
//    private final SubscriptionService service;
//
//    public SubscriptionController(
//	    SubscriptionService service) {
//	this.service = service;
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void create(
//	    @Valid @RequestBody CreateSubscriptionDto inputs) {
//	service.create(inputs);
//    }
//
//}