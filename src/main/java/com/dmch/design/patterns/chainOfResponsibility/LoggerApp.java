package com.dmch.design.patterns.chainOfResponsibility;

public class LoggerApp {
    public static void main(String[] args) {
        Logger smsLogger = new SmsLogger(Level.ERROR);
        Logger emailLogger = new EmailLogger(Level.DEBUG);
        Logger fileLogger = new FileLogger(Level.INFO);

        smsLogger.setNext(emailLogger);
        emailLogger.setNext(fileLogger);

        smsLogger.writeMessage("Absolute failure", Level.ERROR);
        smsLogger.writeMessage("Some problems", Level.DEBUG);
        smsLogger.writeMessage("Work fine", Level.INFO);

//        SMS: Absolute failure
//        Email: Absolute failure
//        File: Absolute failure
//        Email: Some problems
//        File: Some problems
//        File: Work fine
    }
}
enum Level{
    ERROR(1), DEBUG(2), INFO(3);

    private int priority;
    Level(int i) {
        this.priority = i;
    }
    int getPriority(){
        return this.priority;
    }
}

abstract class Logger {
    private int priority;
    Logger next;
    public Logger(Level level) {
        this.priority = level.getPriority();
    }
    public void setNext(Logger next) {
        this.next = next;
    }
    public void writeMessage(String message, Level level){
        if(level.getPriority() <= this.priority) {
            write(message);
        }
        if(next != null) {
            next.writeMessage(message, level);
        }
    }
    abstract void write(String message);
}
class SmsLogger extends Logger{
    public SmsLogger(Level level) {
        super(level);
    }
    void write(String message) {
        System.out.println("SMS: " + message);
    }
}
class EmailLogger extends Logger{
    public EmailLogger(Level level) {
        super(level);
    }
    void write(String message) {
        System.out.println("Email: " + message);
    }
}
class FileLogger extends Logger{
    public FileLogger(Level level) {
        super(level);
    }
    void write(String message) {
        System.out.println("File: " + message);
    }
}

