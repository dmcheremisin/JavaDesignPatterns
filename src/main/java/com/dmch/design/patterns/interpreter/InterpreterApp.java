package com.dmch.design.patterns.interpreter;

public class InterpreterApp {
    public static void main(String[] args) {
        Context context = new Context();
        Expression result = context.evaluate("1-2+3");
        System.out.println(result.interpret()); // 2
        System.out.println(context.evaluate("110+55-10-20").interpret()); // 135
    }
}
interface Expression {
    int interpret();
}
class NumberExpression implements Expression {
    private int number;
    public NumberExpression(int number) {
        this.number = number;
    }
    public int interpret() {
        return number;
    }
}
class MinusExpression implements Expression {
    private Expression left;
    private Expression right;
    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
class PlusExpression implements Expression {
    private Expression left;
    private Expression right;
    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
class Context{
    Expression evaluate(String str){
        int pos = str.length() - 1;
        while(pos > 0){
            char c = str.charAt(pos);
            if(Character.isDigit(c)){
                pos--;
            } else {
                String leftStr = str.substring(0, pos);
                Expression left = evaluate(leftStr);
                String rightStr = str.substring(pos + 1, str.length());
                NumberExpression right = new NumberExpression(Integer.parseInt(rightStr));
                switch (c) {
                    case '+':
                        return new PlusExpression(left, right);
                    case '-':
                        return new MinusExpression(left, right);
                }
            }
        }
        int number = Integer.parseInt(str);
        return new NumberExpression(number);
    }
}
























