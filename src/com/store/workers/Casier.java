package com.store.workers;

// ALT + INS
public class Casier extends Worker implements IWorker {
    @Override
    public String getWorkerType() {
        return "Casier";
    }

    public Casier(String login, String password) {
        super(login, password);
    }

    public Casier() {
        super();
    }
}
