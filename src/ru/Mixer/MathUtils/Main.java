package ru.Mixer.MathUtils;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation puj = new QuadraticEquation(1, -4, 3);

        System.out.println(MathUtils.calculateQuadraticEquation(puj));
    }
}
