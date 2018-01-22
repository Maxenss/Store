package com.store.products;

public class Phone {
    // Если поле помечено модификатором private, то поле должно начинаться с малеленькой буквы m
    // Марка телефона
    private String mMark;

    // Модель телефона
    private String mModel;

    // Цена
    private double mCost;

    // Количество телефонов на складе
    private int mCount;


    // Пользовательский конструктор
    public Phone(String mMark,
                 String mModel,
                 double mCost,
                 int mCount) {
        this.mMark = mMark;
        this.mModel = mModel;
        this.mCost = mCost;
        this.mCount = mCount;
    }

    // Конструктор по-умолчанию
    public Phone() {

    }

    // Методы доступа
    public String getMark() {
        return mMark;
    }

    public void setMark(String mMark) {
        this.mMark = mMark;
    }

    public String getModel() {
        return mModel;
    }

    public void setModel(String mModel) {
        this.mModel = mModel;
    }

    public double getCost() {
        return mCost;
    }

    public void setCost(double mCost) {
        this.mCost = mCost;
    }

    public int getCount() {
        return mCount;
    }

    public void setCount(int mCount) {
        this.mCount = mCount;
    }

    // Переопределенный базовый метод toString, для вывода информации о телефоне
    @Override
    public String toString() {
        String result = "";
        result+= mMark + " " + mModel + ", " + mCost + " грн., кол: " + mCount + " шт.";
        return result;
    }
}
