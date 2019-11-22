
package figuras;

import java.awt.Graphics;

public class Cuadrado extends FiguraGeometrica{
    private static int lado;
    public Cuadrado (int pLado){
        super();
        lado = pLado;
    }

    /**
     * @return the lado
     */
    public static int getLado() {
        return lado;
    }

    /**
     * @param aLado the lado to set
     */
    public static void setLado(int plado) {
        lado = plado;
    }
    @Override
    public float Area(){
        return (float)(lado * lado);
    }
    @Override
    public float Perimetro(){
        return (float) (4 * lado);
    }
    @Override
    public void drawFigure (Graphics g){
        g.drawRect((int)(155 -(lado/2)),(int)(110-(lado/2)), lado, lado);
    }
}
