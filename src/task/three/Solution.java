package task.three;

import java.time.Duration;

public class Solution {
    public static void main(String[] args) {
        Song song = new Song("Java", "Selena", 355);
        System.out.println(song.getDurationInMinuteAndSecond());
    }
}
