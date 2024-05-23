package com.homeWorkRace.RaceCarRunnable;

import com.homeWorkRace.Car.Car;
import com.homeWorkRace.Race.Race;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class RaceCarRunnable extends Car implements Runnable {
    private int passed = 0;
    private int distance;
    private boolean isFinish = false;
    private CountDownLatch latch;
    private long finishTime;
    private int speed =0;

    public RaceCarRunnable(String name, int maxSpeed, int distance, CountDownLatch latch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.latch = latch;
    }

    private int getRandomSpeed() {
        Random rand = new Random();
        return rand.nextInt(maxSpeed / 2) + (maxSpeed / 2);
    }
    @Override
    public String toString(){
        return ""+name + " => speed: " + speed + "; progress: " + passed + "/" + distance;
    }

    @Override
    public void run() {
        while (!isFinish) {
            speed = getRandomSpeed();
            passed += speed;

            System.out.println(this);

            if (passed >= distance) {
                isFinish = true;
                finishTime = System.currentTimeMillis() - Race.startRaceTime.get();
                System.out.println(name + " FINISHED!");
                latch.countDown();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    

    public long getFinishTime() {
        return finishTime;
    }
}
