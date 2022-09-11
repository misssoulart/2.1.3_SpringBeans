package app.model;

import org.springframework.stereotype.Component;

@Component("timer") // добавила
public class Timer {

    private Long nanoTime = System.nanoTime(); // дано

    public Long getTime() {
        return nanoTime;
    } // дано
}
