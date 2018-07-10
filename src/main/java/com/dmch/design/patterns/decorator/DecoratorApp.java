package com.dmch.design.patterns.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        Printer printer = new Printer("Hello");
        BracketsDecorator bracketsDecorator = new BracketsDecorator(printer);
        bracketsDecorator.print(); // [Hello]
        System.out.println();
        QuotesDecorator quotesDecorator = new QuotesDecorator(bracketsDecorator);
        quotesDecorator.print(); // "[Hello]"
    }
}
interface PrinterInterface {
    void print();
}
class Printer implements PrinterInterface {
    String value;
    public Printer(String value) {
        this.value = value;
    }
    public void print() {
        System.out.print(value);
    }
}
abstract class Decorator implements PrinterInterface {
    PrinterInterface printer;
    public Decorator(PrinterInterface printer) {
        this.printer = printer;
    }
    public void print() {
        printer.print();
    }
}
class BracketsDecorator extends Decorator {
    public BracketsDecorator(PrinterInterface printer) {
        super(printer);
    }
    public void print() {
        System.out.print("[");
        super.print();
        System.out.print("]");
    }
}
class QuotesDecorator extends Decorator {
    public QuotesDecorator(PrinterInterface printer) {
        super(printer);
    }
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}