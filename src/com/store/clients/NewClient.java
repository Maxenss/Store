package com.store.clients;

public class NewClient implements IClient {
    // кол-во посещений магазина
    int count = 0;

    @Override
    public String getClientType() {
        return "New Client";
    }

    // Возвращает скидку для клиента в %
    @Override
    public int getSale() {
        return 0;                 // 0%
    }
}
