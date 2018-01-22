package com.store;

import com.store.clients.IClient;
import com.store.products.Order;
import com.store.products.Phone;
import com.store.workers.IWorker;

import java.util.ArrayList;

public class Store {
    private static ArrayList<Phone> phonesArrayList
            = new ArrayList<>();
    private static ArrayList<Order> ordersArrayList
            = new ArrayList<>();
    private static  ArrayList<IWorker> workersArrayList
            = new ArrayList<>();
    private static  ArrayList<IClient> clientArrayList
            = new ArrayList<>();

    // Метод, заполняющий коллекцию телефонами
    public static void TestData(){
        // Создаём объекты класса Phone
        Phone phone1 = new Phone("Samsung", "S5", 5000, 100);
        Phone phone2 = new Phone("Samsung", "S6", 8000, 130);
        Phone phone3 = new Phone("Samsung", "S7", 10000, 80);
        Phone phone4 = new Phone("Samsung", "S8", 20000, 66);
        Phone phone5 = new Phone("IPhone", "8", 20000, 90);

        // Добавляем телефоны в коллекцию
        phonesArrayList.add(phone1);
        phonesArrayList.add(phone2);
        phonesArrayList.add(phone3);
        phonesArrayList.add(phone4);
        phonesArrayList.add(phone5);
    }

    // Метод, выводящий информацию о доступных товарах в магазине
    public static void ShowProducts(){
        System.out.println("Информация о товарах: ");

        for (Phone phone:
             phonesArrayList) {
            System.out.println(phone.toString());
        }
    }

    public static void sale(){
        // Описать метод на продажу товаров
    }

    public static void addProductsToStore(){
        // Описать метод на поставку товаров на склад
    }
}
