package com.store.workers;

public class ProductManager extends Worker implements IWorker {
    @Override
    public String getWorkerType() {
        return "Product Manager";
    }

    // Пользовательский конструктор
    public ProductManager(String login, String password) {
        // Вызов конструктора родительского класса
        super(login, password);
    }

    public ProductManager() {

    }
}
