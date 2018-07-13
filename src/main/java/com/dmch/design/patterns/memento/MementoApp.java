package com.dmch.design.patterns.memento;

public class MementoApp {
    public static void main(String[] args) {
        Game game = new Game();

        game.setProgress("LVL 1", 30);
        File file = new File();
        file.setSave(game.saveProgress());
        System.out.println(game);

        game.setProgress("LVL 2", 50);
        System.out.println(game);

        game.load(file.getSave());
        System.out.println(game);
//        Game[level='LVL 1, seconds=30]
//        Game[level='LVL 2, seconds=50]
//        Game[level='LVL 1, seconds=30]
    }
}
class Game{
    private String level;
    private int seconds;

    public void setProgress(String level, int ms){
        this.level = level;
        this.seconds = ms;
    }
    public void load(Save save){
        this.level = save.getLevel();
        this.seconds = save.getSeconds();
    }
    public Save saveProgress(){
        return new Save(level, seconds);
    }

    @Override
    public String toString() {
        return "Game[" + "level='" + level + ", seconds=" + seconds + ']';
    }
}
class Save {
    private final String level;
    private final int seconds;
    public Save(String level, int ms) {
        this.level = level;
        this.seconds = ms;
    }
    public String getLevel() {
        return level;
    }
    public int getSeconds() {
        return seconds;
    }
}
class File {
    private Save save;
    public Save getSave() {
        return save;
    }
    public void setSave(Save save) {
        this.save = save;
    }
}