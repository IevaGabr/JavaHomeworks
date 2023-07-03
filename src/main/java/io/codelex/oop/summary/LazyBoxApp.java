package io.codelex.oop.summary;

public class LazyBoxApp {

    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(LazyBoxApp::calculate);

        //First time calling get - it should calculate the value
        Integer contents = box.get();

        //Second time calling get - it should just return previously calculated value and not calculate again
        Integer contents2 = box.get();

    }


    public static Integer calculate() {
        return 200;
    }
}
