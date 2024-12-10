package view.localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03LocalTimeDuration {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.of(2,2,22);
        LocalTime lt2 = LocalTime.now();

        System.out.println(lt1);
        System.out.println(lt2);

        Duration duration = Duration.between(lt1, lt2);

        System.out.println(duration.toMinutes());

    }
}
