package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "desc", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "desc", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void findAllItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 100L);
        tracker.add(item);
        Item[] expected = {item};
        assertThat(tracker.findAll(), is(expected));
    }

    @Test
    public void deleteSecondItem() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("test1", "desc", 100L));
        tracker.add(new Item("test2", "desc2", 100L));
        tracker.add(new Item("test3", "desc3", 100L));
        tracker.delete(tracker.getItems()[1].getId());
        assertThat(tracker.getItems()[1].getName(), is("test3"));
    }

    @Test
    public void findByIdItem() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("test1", "desc", 100L));
        tracker.add(new Item("test2", "desc2", 100L));
        Item res = tracker.findById(tracker.getItems()[0].getId());
        assertThat(res.getName(), is("test1"));
    }
}