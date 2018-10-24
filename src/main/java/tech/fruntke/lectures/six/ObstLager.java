package tech.fruntke.lectures.six;

import java.util.ArrayList;
import java.util.List;

public class ObstLager {


    public static void main(String[] args) {
        List<Obst> obstLager = new ArrayList<>();
        obstLager.add(new Birne());
        obstLager.add(new Orange());
        obstLager.add(new Apfel());
        for (Obst obst : obstLager) {
            obst.print();
        }
    }
}
