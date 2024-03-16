package co.simplon.p25.api.security;

import co.simplon.p25.api.dtos.SendMailDto;

public interface EmailService {

    void sendSimpleMail(SendMailDto inputs);

}
