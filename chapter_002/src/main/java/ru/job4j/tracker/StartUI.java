package ru.job4j.tracker;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    private static final String EDIT = "1";
    private static final String DELETE = "2";
    private static final String FIND_BY_NAME = "4";
    private static final String FIND_BY_ID = "3";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                //добавление заявки вынесено в отдельный метод.
                this.createItem();
                } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FIND_BY_NAME.equals(answer)) {
                this.findByNameItem();
            } else if (FIND_BY_ID.equals(answer)) {
                this.findByIdItem();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void showMenu() {
        System.out.println("Меню.");
        // добавить остальные пункты меню.
    }

    private void editItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите ID заявки :");
        Item item = this.tracker.findById(id);
        if (item != null) {
            String name = this.input.ask("Введите имя заявки :");
            String desc = this.input.ask("Введите описание заявки :");
            Item newItem = new Item(name, desc);
            this.tracker.replace(id, newItem);
            item = this.tracker.findById(id);
            System.out.println("Id : " + item.getId() + " Имя : " + item.getName());
            System.out.println("------------ Заявка " + item.getId() + " отредактирована --------------");
        } else {
            System.out.println("------------ Заявка с таким id отсутствует --------------");
        }
    }

    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите ID заявки :");
        Item item = this.tracker.findById(id);
        if (item != null) {
            this.tracker.delete(id);
            System.out.println("------------ Заявка " + id + " удалена --------------");
        } else {
            System.out.println("------------ Заявка с таким id отсутствует --------------");
        }
    }

    private void findByNameItem() {
        System.out.println("------------ Поиск заявок по имени --------------");
        String name = this.input.ask("Введите имя заявки : ");
        Item[] items = this.tracker.findByName(name);
        System.out.println("------------ Результат поиска --------------");
        for (Item item : items) {
            System.out.println("Id : " + item.getId() + " Имя : " + item.getName());
        }
        System.out.println("------------ Конец списка --------------");
    }

    private void findByIdItem() {
        System.out.println("------------ Поиск заявки по ID --------------");
        String id = this.input.ask("Введите ID заявки :");
        Item item = this.tracker.findById(id);
        if (item != null) {
            System.out.println("Id : " + item.getId() + " Имя : " + item.getName());
            System.out.println("------------ Заявка " + item.getId() + " найдена --------------");
        } else {
            System.out.println("------------ Заявка с таким id не найдена --------------");
        }
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
