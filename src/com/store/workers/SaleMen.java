package com.store.workers;

public class SaleMen extends Worker implements IWorker{
    @Override
    public String getWorkerType() {
        return "Salemen";
    }

    public SaleMen(String login, String password) {
        super(login, password);
    }

    public SaleMen() {

    }
}
