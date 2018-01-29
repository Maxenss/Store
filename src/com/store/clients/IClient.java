package com.store.clients;

public interface IClient {
    // Метод для переопределения в производных классах
    String getClientType();

    // Скидка для клиентов
    int getSale();
}
