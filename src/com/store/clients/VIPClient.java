package com.store.clients;

public class VIPClient implements IClient {
    int count = 5;

    @Override
    public String getClientType() {
        return "VIP Client";
    }

    @Override
    public int getSale() {
        return 20;           // 20%
    }
}
