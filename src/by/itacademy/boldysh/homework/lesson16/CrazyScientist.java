package by.itacademy.boldysh.homework.lesson16;

import lombok.Getter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Getter
public class CrazyScientist {
    private String name;
    private Map<Detail, Integer> detailsForRobots = new HashMap<>();

    public CrazyScientist(String name) {
        this.name = name;
    }

    public int assembleRobot() {
        return getDetailsForRobots().size() != Detail.values().length ? 0 :
                Collections.min(getDetailsForRobots().values());
    }
}