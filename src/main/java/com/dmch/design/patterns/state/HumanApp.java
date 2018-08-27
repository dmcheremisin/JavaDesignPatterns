package com.dmch.design.patterns.state;

public class HumanApp {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());
        for(int i=0; i < 15; i++){
            human.changeState();
        }
//        Working
//        Working
//        Working
//        Working
//        Working
//        Weekend (Zzz)
//        Weekend (Zzz)
//        Working
//        Working
//        Working
//        Working
//        Working
    }
}
// State
interface Activity{
    void doSomething(Human human);
}
class Work implements Activity {
    private int count = 0;
    public void doSomething(Human human) {
        if (count++ < 5){
            System.out.println("Working");
        } else {
            human.setState(new Weekend());
        }
    }
}
class Weekend implements Activity {
    private int count = 0;
    public void doSomething(Human human) {
        if (count++ < 2){
            System.out.println("Weekend (Zzz)");
        } else {
            human.setState(new Work());
        }
    }
}
// Context
class Human {
    private Activity state;
    public void setState(Activity activity){
        this.state = activity;
    }
    public void changeState(){
        state.doSomething(this);
    }
}
