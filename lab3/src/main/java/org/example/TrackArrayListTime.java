package org.example;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

/**
 * Класс для измерения времени выполнения методов коллекции ArrayList
 */
public class TrackArrayListTime implements TrackTime {
    protected int size;
    protected Instant timeTracker;
    ArrayList<Integer> ArrayTest;

    /**
     * Конструктор класса, создает объект коллекции ArrayList
     * @param size - размер коллекции
     */
    TrackArrayListTime(int size) {
        this.size = size;
        ArrayTest = new ArrayList<>();
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
            ArrayTest.add(randomValues[i]);
        }
        return Instant.now().getNano()- timeTracker.getNano();
    }
    /**
     * Метод, измерияющий время выполнения метода Remove
     * @return - возвращает время Remove
     */
    public long trackRemoveTime() {
        if (ArrayTest.isEmpty()) trackAddTime();
        timeTracker = Instant.now();
        for (int i = 0; i < size; i++)
            ArrayTest.remove(0);
        return Instant.now().getNano()- timeTracker.getNano();
    }
    /**
     * Метод, измерияющий время выполнения метода Get
     * @return - возвращает время Get
     */
    public long trackGetTime() {
        if (ArrayTest.isEmpty()) trackAddTime();
        timeTracker = Instant.now();
        int value;
        for (int i = 0; i < size; i++)
            value = ArrayTest.get(0);
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
            ArrayTest.add(0);
        ArrayTest.subList(0, size);
        return Instant.now().getNano()- timeTracker.getNano();
    }
}
