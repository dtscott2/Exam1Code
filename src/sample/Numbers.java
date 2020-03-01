package sample;

import java.util.Random;

public class Numbers {

    public int min;
    public int max;
    public int genNum;


    public int genRandomNumber(){

        Random random = new Random();
        int limit = max - min + 1;
        int randNum = random.nextInt(limit)+min;
        return randNum;

    }


    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String toString() {
        return String.valueOf(genNum);
    }
}
