package ru.job4j.tracker;

import java.util.*;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
    private static final Random random = new Random();
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    public Item[] getItems() {
        return items;
    }

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + random.nextInt(200));
    }

    public Item findById(String id) {
        Item result = null;
        for(Item item : this.items) {
            if(item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        Item[] itemsNew = new Item[100];
        int count = 0;
        for (Item item : this.items) {
            if (item != null) {
                itemsNew[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(itemsNew, count);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[100];
        int j = 0;
        for (Item item : this.items) {
            if(item.getName().equals(key)) {
                result[j++] = item;
            }
        }
        return result;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.items.length; i++) {
            if(this.items[i].getId().equals(id)) {
                this.items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index != this.items.length; index++) {
            if (this.items[index] != null && this.items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, this.items.length - 1 - index);
                position--;
                result = true;
                break;
            }
        }
        return result;
    }
}