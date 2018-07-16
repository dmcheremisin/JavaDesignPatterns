package com.dmch.design.patterns.state;

public class HumanApp {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Weekend());
        for(int i=0; i< 10; i++){
            human.changeState();
        }
//        Weekend (Zzz)
//        Weekend (Zzz)
//        Weekend (Zzz)
//        Working
//        Weekend (Zzz)
//        Weekend (Zzz)
//        Weekend (Zzz)
//        Working
    }
}
// State
interface Activity{
    void doSomething(Human human);
}
class Work implements Activity {
    public void doSomething(Human human) {
        System.out.println("Working");
        human.setState(new Weekend());
    }
}
class Weekend implements Activity {
    private int count = 0;
    public void doSomething(Human human) {
        if (count++ < 3){
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
