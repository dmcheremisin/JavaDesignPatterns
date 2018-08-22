package com.dmch.design.patterns.chainOfResponsibility;

public class AtmApp {
    public static void main(String[] args) {
        Machine machine5000 = new Machine(Money.R5000);
        Machine machine1000 = new Machine(Money.R1000);
        Machine machine500 = new Machine(Money.R500);
        Machine machine100 = new Machine(Money.R100);

        machine5000.setNext(machine1000);
        machine1000.setNext(machine500);
        machine500.setNext(machine100);

        machine5000.giveMoney(104_900);
//        Changed notes 20 with nominal 5000
//        Changed notes 4 with nominal 1000
//        Changed notes 1 with nominal 500
//        Changed notes 4 with nominal 100
    }
}

enum Money{
    R5000(5000), R1000(1000), R500(500), R100(100);

    private int nominal;
    Money(int nominal) {
        this.nominal = nominal;
    }
    int getNominal(){
        return nominal;
    }
}
interface Handler {
    void setNext(Handler next);
    void giveMoney(int amount);
}
class Machine implements Handler{
    private int nominal;
    private Handler next;

    public Machine(Money money) {
        this.nominal = money.getNominal();
    }
    public void setNext(Handler next) {
        this.next = next;
    }
    public void giveMoney(int amount){
        if(amount > 0 && amount < 200_000 && amount % Money.R100.getNominal() == 0){
            int changedNotes = amount / nominal;
            if(changedNotes > 0) {
                System.out.println("Changed notes " + changedNotes + " with nominal " + nominal);
            }
            int amountLeft = amount - changedNotes * nominal;
            if (next != null && amountLeft > 0) {
                next.giveMoney(amountLeft);
            }
        } else {
            throw new RuntimeException("Wrong amount");
        }
    }
}