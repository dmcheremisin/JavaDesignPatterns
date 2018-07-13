package com.dmch.design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat chat = new TextChat();
        User dima = new SimpleUser("Dima", chat);
        User anya = new SimpleUser("Anya", chat);
        User mark = new AdminUser("Mark", chat);

        dima.sendMessage("Hello, everybody!");
        anya.sendMessage("Hi!");
        mark.sendMessage("Hello, Dima and Anya.");
//        Dima send message: Hello, everybody!
//        User Anya received message: Hello, everybody!
//        Admin Mark received message: Hello, everybody!
//        Anya send message: Hi!
//        User Dima received message: Hi!
//        Admin Mark received message: Hi!
//        Mark send message: Hello, Dima and Anya.
//        User Dima received message: Hello, Dima and Anya.
//        User Anya received message: Hello, Dima and Anya.
    }
}
interface Chat{
    void addUser(User user);
    void sendMessage(String text, User user);
}
abstract class User {
    protected Chat chat;
    protected String name;
    public User(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
        chat.addUser(this);
    }
    public String getName() {
        return name;
    }
    void sendMessage(String text) {
        System.out.println(name + " send message: " + text);
        chat.sendMessage(text, this);
    }
    abstract void receiveMessage(String text);
}
class SimpleUser extends User {
    public SimpleUser(String name, Chat chat) {
        super(name, chat);
    }
    void receiveMessage(String text) {
        System.out.println("User " + name + " received message: " + text);
    }
}
class AdminUser extends User {
    public AdminUser(String name, Chat chat) {
        super(name, chat);
    }
    void receiveMessage(String text) {
        System.out.println("Admin " + name + " received message: " + text);
    }
}

class TextChat implements Chat {
    List<User> users = new ArrayList<>();
    public void addUser(User user){
        users.add(user);
    }
    @Override
    public void sendMessage(String text, User user) {
        users.forEach(u -> {
            if(u != user) {
                u.receiveMessage(text);
            }
        });
    }
}

