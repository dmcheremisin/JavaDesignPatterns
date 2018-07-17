package com.dmch.design.patterns.proxy;

/**
 * Created by Dmitrii on 17.07.2018.
 */
public class ProxyApp {
    public static void main(String[] args) {
        Image forest = new ProxyImage("C:\\images\\forest.jpg");
        Image desert = new ProxyImage("C:\\images\\desert.jpg");
        desert.display();
        //Loading file C:\images\desert.jpg
        //Displaying file C:\images\desert.jpg
    }
}
interface Image {
    void display();
}
class RealImage implements Image{
    private String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    private void load(){
        System.out.println("Loading file " + file);
    }

    public void display() {
        System.out.println("Displaying file " + file);
    }
}
class ProxyImage implements Image{
    private String file;
    private RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    // lazy loading
    public void display() {
        if(image == null){
            image = new RealImage(file);
        }
        image.display();
    }
}