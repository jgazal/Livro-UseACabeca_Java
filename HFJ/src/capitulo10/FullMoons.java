package capitulo10;

import java.util.Calendar;

import static java.lang.System.out;

class FullMoons {

    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2016,6,8,16,55);
        long day1 = c.getTimeInMillis();

        for(int x=0; x<60; x++){
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("Lua Cheia em %tc", c));
        }
    }
}
