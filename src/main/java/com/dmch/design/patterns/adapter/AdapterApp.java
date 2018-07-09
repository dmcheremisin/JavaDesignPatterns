package com.dmch.design.patterns.adapter;

public class AdapterApp {
    public static void main(String[] args) {
        VectorGraphicsInterface vgInterface = new RasterToVectorInheritanceAdapter();
        vgInterface.drawLine();
        vgInterface.drawSquare();
        // Raster line
        // Raster square

        VectorGraphicsInterface vgi = new RasterToVectorCompositionAdapter();
        vgi.drawLine();
        vgi.drawSquare();
        // Raster line
        // Raster square
    }
}

interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}
class RasterGraphics{
    public void drawRasterLine() {
        System.out.println("Raster line");
    }
    public void drawRasterSquare(){
        System.out.println("Raster square");
    }
}
// 1st variant - adapter through inheritance
class RasterToVectorInheritanceAdapter extends RasterGraphics implements VectorGraphicsInterface {
    public void drawLine() {
        drawRasterLine();
    }
    public void drawSquare() {
        drawRasterSquare();
    }
}
// 2nd variant - adapter through composition
class RasterToVectorCompositionAdapter implements VectorGraphicsInterface {
    public RasterGraphics rg = new RasterGraphics();
    public void drawLine() {
        rg.drawRasterLine();
    }
    public void drawSquare() {
        rg.drawRasterSquare();
    }
}