package by.itacademy.boldysh.homework.lesson16;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Dump {
    private String name;
    private List<Detail> details = new ArrayList<>();

    public Dump(String name) {
        this.name = name;
    }

    public void addDetailsDumpFirstNight() {
        for (int i = 0; i < TaskOneUtil.QUANTITY_DETAIL_FIRST_NIGHT; i++) {
            getDetails().add(Detail.values()[RandomDetailUtil.getQualityDetailRobot()]);
        }
    }
}