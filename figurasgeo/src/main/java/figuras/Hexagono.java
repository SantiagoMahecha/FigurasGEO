package figuras;
import java.util.Scanner;

public class Hexagono extends Figuras 
{
    Scanner sc = new Scanner(System.in);
    private double Radio;
    private double RespuestaA;
    private double RespuestaPH;
    private double LadoH;


    public Hexagono()
    {

    }
    public Hexagono(double LadoH,double Radio, double RespuestaA,double RespuestaPH)
    {
        this.LadoH = LadoH;
        this.Radio = Radio;
        this.RespuestaA = RespuestaA;
        this.RespuestaPH = RespuestaPH;
    }

    
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getRespuestaA() {
        return RespuestaA;
    }
    public void setRespuestaA(double respuestaA) {
        RespuestaA = respuestaA;
    }
    public double getRespuestaPH() {
        return RespuestaPH;
    }
    public void setRespuestaPH(double respuestaPH) {
        RespuestaPH = respuestaPH;
    }
    public double getLadoH() {
        return LadoH;
    }
    public void setLadoH(double ladoH) {
        LadoH = ladoH;
    }

    public double calcularPerimetro()
    {
        setRespuestaPH(Radio*6);
        System.out.println("El perimetro es: " + getRespuestaPH());
        return getRespuestaPH();
    }
   
    public double calcularArea()
    {
        setRespuestaA(3* Math.pow(Radio,2));
        System.out.println("El Area es: " + getRespuestaA());
        return getRespuestaA();
    }
}
