package com.patterns.behavioralpatterns.interpreter;

public class InterpreterMain {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isSpring = getSpringExpression();

        System.out.println("Does developer know Java core? " + isJava.interpret("Java core"));
        System.out.println("Does developer know Spring? " + isSpring.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getSpringExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
