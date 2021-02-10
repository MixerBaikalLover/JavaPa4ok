package ru.Mixer.MathUtils;

public class MathUtils {

   public static QuadraticEquationRoot calculateQuadraticEquation(QuadraticEquation equation) {
        QuadraticEquationRoot qer = new QuadraticEquationRoot();
       double d = equation.getB()*equation.getB() - 4* equation.getA()* equation.getC();
       double dSqrt = Math.sqrt(d);
       if(d == 0){
           qer.setX1(-equation.getB() / 2*equation.getA());
           qer.setX2(0);
           qer.setRootCount(1);
       }else if (d > 0){
           qer.setX1((-equation.getB() + dSqrt) / 2*equation.getA());
           qer.setX2((-equation.getB() - dSqrt) / 2*equation.getA());
           qer.setRootCount(2);
       } else {
           qer.setX1(0);
           qer.setX2(0);
           qer.setRootCount(0);
       }
        return (qer);
    }
}
