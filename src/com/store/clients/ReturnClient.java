package com.store.clients;

public class ReturnClient implements IClient {
    // кол-во посещений
    int count = 1;

    @Override
    public String getClientType() {
        return "Returning Client";
    }

    @Override
    public int getSale() {
        return 10;                 // 10%
    }
}
