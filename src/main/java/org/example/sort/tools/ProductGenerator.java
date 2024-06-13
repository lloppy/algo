package org.example.sort.tools;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.sort.data.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductGenerator {
    public static void main(String[] args) {
        List<Product> products = generateProducts(100);
        saveToJson(products, "products.json");
    }

    private static List<Product> generateProducts(int count) {
        List<Product> productList = new ArrayList<>();
        Random random = new Random();

        String[] names = {
                "Электрическая чайник",
                "Смартфон",
                "Планшетный компьютер",
                "Ноутбук",
                "Фитнес-трекер",
                "Беспроводные наушники",
                "Умные часы",
                "Цифровая камера",
                "Принтер",
                "Микроволновая печь",
                "Кофеварка",
                "Умный телевизор",
                "Игровая консоль",
                "Холодильник",
                "Пылесос",
                "Умный дом",
                "Робот-пылесос",
                "Умные колонки",
                "Электрическая зубная щетка",
                "Электрическая бритва",
                "Умные лампочки",
                "Портативная зарядка",
                "Умные термостаты",
                "Робот-пылесос",
                "Дрон",
                "VR-очки",
                "Умные кнопки",
                "Электрическая мясорубка",
                "Водонагреватель",
                "Кондиционер",
                "Умные замки",
                "Автомобильный навигатор",
                "Умные весы",
                "Система видеонаблюдения",
                "Умные розетки",
                "Умные шторы",
                "Мультиварка",
                "Домашний кинотеатр",
                "Электрическая зубная нить",
                "Пароочиститель",
                "Индукционная плита",
                "Пылеуловитель",
                "Умные коврики",
                "Умный гарнитур",
                "Автоматический полив",
                "Умный душ",
                "Электрическая зубная щетка",
                "Массажное кресло",
                "Умные очки",
                "Электронный ключ",
                "Смарт-зеркало",
                "Умный кошелек"
        };

        for (int i = 0; i < count; i++) {
            String name = names[random.nextInt(names.length)];
            int price = random.nextInt(10, 250);
            int sale = random.nextInt(10, 90);
            int sellerPrice = random.nextInt(100, 500);
            int imageResourceId = random.nextInt(0, 9);

            Product product = new Product(name, price, sale, sellerPrice, imageResourceId);
            productList.add(product);
        }

        return productList;
    }

    private static void saveToJson(List<Product> products, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(products, writer);
            System.out.println("Сохранение в файл успешно завершено: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
