package com.homeWorkRace.Race;

import com.homeWorkRace.RaceCarRunnable.RaceCarRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class Race {
    public static AtomicLong startRaceTime = new AtomicLong();

    public static void startRace(List<Thread> cars) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("3...");
                    Thread.sleep(500);
                    System.out.println("2...");
                    Thread.sleep(500);
                    System.out.println("1...");
                    Thread.sleep(500);
                    System.out.println("GO!!!");
                    startRaceTime.set(System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (Thread car : cars) {
                    car.start();
                }
            }
        }).start();
    }

    public static String convertToTime(long time) {
        long seconds = time / 1000;
        long minutes = seconds / 60;
        seconds = seconds % 60;
        long milliseconds = time % 1000;
        return String.format("%02d:%02d.%03d", minutes, seconds, milliseconds);
    }

    public static void main(String[] args) {
        int numCars = 4;
        CountDownLatch latch = new CountDownLatch(numCars);

        List<RaceCarRunnable> cars = new ArrayList<>();
        cars.add(new RaceCarRunnable("Car1", 200, 1000, latch));
        cars.add(new RaceCarRunnable("Car2", 220, 1000, latch));
        cars.add(new RaceCarRunnable("Car3", 210, 1000, latch));
        cars.add(new RaceCarRunnable("Car4", 230, 1000, latch));

        List<Thread> threads = new ArrayList<>();
        for (RaceCarRunnable car : cars) {
            threads.add(new Thread(car));
        }

        startRace(threads);

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All cars have finished the race!");

        RaceCarRunnable winner = cars.get(0);
        for (RaceCarRunnable car : cars) {
            System.out.println(car.getName() + " FINISHED in " + convertToTime(car.getFinishTime()));
            if (car.getFinishTime() < winner.getFinishTime()) {
                winner = car;
            }
        }

        System.out.println("The winner is " + winner.getName() + " with time " + convertToTime(winner.getFinishTime()) + "!");
    }
}
