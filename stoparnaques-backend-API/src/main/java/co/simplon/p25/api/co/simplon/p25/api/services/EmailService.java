package co.simplon.p25.api.services;

import co.simplon.p25.api.dtos.SendMailDto;

public interface EmailService {

    void sendSimpleMail(SendMailDto inputs);

}
