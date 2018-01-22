package com.store.products;

import java.util.ArrayList;

public class Order {
    // Список товаров в заказе
    private ArrayList<Phone> mPhonesOrders;
    // Сумма всех товаров в заказе
    private double mSum;

    // Пользовательский конструктор, принимающий на вход коллекцию телефонов на продажу
    public Order(ArrayList<Phone> mPhonesOrders) {
        this.mPhonesOrders = mPhonesOrders;

        // Получаем конечную сумму заказа
        getFullSum();
    }

    // Получаем общую сумму за все товары в чеке
    public double getFullSum(){
        double sum = 0;
        for (Phone phone:
             mPhonesOrders) {
            sum = phone.getCount() * phone.getCost();
        }

        return sum;
    }

    // Получаем информацию о заказе
    @Override
    public String toString() {
        String  result = "";
        result +="Информация о заказе:";
        for (Phone phone:
             mPhonesOrders) {
              result += phone.toString() + "\n";
        }
        result += "Сумма заказа: " + mSum;

        return result;
    }
}
