package org.example;

import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Класс для измерения времени выполнения методов коллекции LinkedList
 */
public class TrackLinkedListTime implements TrackTime {
    protected int size;
    protected Instant timeTracker;
    LinkedList<Integer> ListTest;
    /**
     * Конструктор класса, создает объект коллекции LinkedList
     * @param size - размер коллекции
     */
    TrackLinkedListTime(int size) {
        this.size = size;
        ListTest = new LinkedList<>();
    }
    /**
     * Метод, измерияющий время выполнения метода Add
     * @return - возвращает время Add
     */
    public long trackAddTime() {
        int[]randomValues = new int[size];
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            i = random.nextInt();
        }
        timeTracker = Instant.now();
        for (int i = 0; i < size; i++) {
            ListTest.add(randomValues[i]);
        }
        return Instant.now().getNano()- timeTracker.getNano();
    }
    /**
     * Метод, измерияющий время выполнения метода Remove
     * @return - возвращает время Remove
     */
    public long trackRemoveTime() {
        if (ListTest.isEmpty()) trackAddTime();
        timeTracker = Instant.now();
        for (int i = 0; i < size; i++)
            ListTest.remove(0);
        return Instant.now().getNano()- timeTracker.getNano();
    }
    /**
     * Метод, измерияющий время выполнения метода Get
     * @return - возвращает время Get
     */
    public long trackGetTime() {
        if (ListTest.isEmpty()) trackAddTime();
        timeTracker = Instant.now();
        int value;
        for (int i = 0; i < size; i++)
            value = ListTest.get(0);
        return Instant.now().getNano()- timeTracker.getNano();
    }
    /**
     * Метод, измерияющий время выполнения метода SubList
     * @return - возвращает время SubList
     */
    public long trackSubListTime() {
        timeTracker = Instant.now();
        trackAddTime();
        for(int i = 0; i < size; i++)
            ListTest.add(0);
        ListTest.subList(0, size);
        return Instant.now().getNano()- timeTracker.getNano();
    }
}
