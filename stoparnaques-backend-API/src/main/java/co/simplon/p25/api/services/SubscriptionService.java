package co.simplon.p25.api.services;

import co.simplon.p25.api.dtos.CreateSubscriptionDto;

public interface SubscriptionService {

    void create(CreateSubscriptionDto inputs);

    public boolean subscriptionNameValueExist(
	    String subscriptionName);
}