package com.store;

import com.store.clients.IClient;
import com.store.clients.NewClient;
import com.store.clients.ReturnClient;
import com.store.clients.VIPClient;
import com.store.products.Order;
import com.store.products.Phone;
import com.store.workers.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private static ArrayList<Phone> phonesArrayList
            = new ArrayList<>();
    private static ArrayList<Order> ordersArrayList
            = new ArrayList<>();
    private static  ArrayList<IWorker> workersArrayList
            = new ArrayList<>();
    private static  ArrayList<IClient> clientsArrayList
            = new ArrayList<>();

    // Текущий пользователь в системе
    private static IWorker currentWorker;

    // Объект для считывания данных с консоли
    private static Scanner scanner =
            new Scanner(System.in);

    public static void storeWork(){
        while (true){
            // вызывать только в том случае, если пользователь
            // не авторизирован
            if (currentWorker == null) {
                currentWorker = authorize();
            }

            // Проверяем нашли ли пользователя
            // Если не нашли, переходим на след итерацию
            // цикла, и повторяем авторизация
            if (currentWorker == null){
                continue;
            }

            // Логика работы магазина
        }
    }

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

        // Создаём клиентов
        NewClient client1 = new NewClient();
        NewClient client2 = new NewClient();
        ReturnClient client3 = new ReturnClient();
        ReturnClient client4 = new ReturnClient();
        VIPClient client5 = new VIPClient();
        VIPClient client6 = new VIPClient();

        // Помещаем клиентов в коллекцию clientsArrayList
        // Коллекция элементов IClient
        clientsArrayList.add(client1);
        clientsArrayList.add(client2);
        clientsArrayList.add(client3);
        clientsArrayList.add(client4);
        clientsArrayList.add(client5);
        clientsArrayList.add(client6);

        // Создаём работников
        Casier casier
                = new Casier("Casier", "123456");
        SaleMen saleMen
                = new SaleMen("SaleMen", "654321");
        ProductManager productManager
                = new ProductManager("ProductManager", "qwerty");

        // Помащаем работников в коллекцию workersArrayList
        // Коллекция элементов IWorker
        workersArrayList.add(casier);
        workersArrayList.add(saleMen);
        workersArrayList.add(productManager);
    }

    // Метод, выводящий информацию о доступных товарах в магазине
    public static void ShowProducts(){
        System.out.println("Информация о товарах: ");

        for (Phone phone:
             phonesArrayList) {
            System.out.println(phone.toString());
        }
    }

    // Метод для авторизации
    public static IWorker authorize(){
        System.out.println("Авторизация");

        String login;
        String password;

        System.out.print("Введите логин: ");
        login = scanner.next(); // считываем ввод в консоли

        System.out.print("Введите пароль: ");
        password = scanner.next(); // считываем ввод в консоли

        for (IWorker worker:
             workersArrayList) {
            // Ключевое слово instanceof применяется в той ситуации,
            // когда необходимо определить к какому классу пренадлежит текущий объект
            // Если текущий объект наследуется, или изначально был создан как объект класс
            // с которым происходим сравнение с помощью констр. instanceof, то результат
            // логического выражения yyy instanceof zzz == true, иначе yyy instanceof zzz == false.
            if(worker instanceof Worker){
                // Приведение объекта базового типа IWorker, к объекту
                // производного типа Worker
                Worker tempWorker = (Worker)worker;

                // Если нашли совпадения по логину и паролю
                // то вернуть объект, у которого логин и пароль,
                // Такие как мы ввели при авторизации
                if (tempWorker.login.equals(login) &&
                        tempWorker.password.equals(password)){
                    System.out.println("Вы авторизированы!");
                    System.out.println("Ваша роль: " + worker.getWorkerType());
                    return worker;
                }
            }
        }
        // Если не найдены совпадения
        // null - означет отсутстиве объекта
        return null;
    }

    public static void sale(){
        // Описать метод на продажу товаров
    }

    public static void addProductsToStore(){
        // Описать метод на поставку товаров на склад
    }
}
