package figuras;
import java.util.Scanner;

public class Estrella extends Figuras
{
    Scanner sc = new Scanner(System.in);
    double Apotema;
    double RespuestaAE;
    double RespuestaPE;
    double LadoE;

    public Estrella()
    {

    }

    public Estrella(double LadoE,double Apotema, double RespuestaAE,double RespuestaPE)
    {
        this.LadoE = LadoE;
        this.Apotema = Apotema;
        this.RespuestaAE = RespuestaAE;
        this.RespuestaPE = RespuestaPE;
    }

  

    public double getApotema() {
        return Apotema;
    }

    public void setApotema(double apotema) {
        Apotema = apotema;
    }

    public double getRespuestaAE() {
        return RespuestaAE;
    }

    public void setRespuestaAE(double respuestaAE) {
        RespuestaAE = respuestaAE;
    }

    public double getRespuestaPE() {
        return RespuestaPE;
    }

    public void setRespuestaPE(double respuestaPE) {
        RespuestaPE = respuestaPE;
    }

    public double getLadoE() {
        return LadoE;
    }

    public void setLadoE(double ladoE) {
        LadoE = ladoE;
    }

    public double calcularPerimetro()
    {
        setRespuestaPE((5)*getApotema()/2);
        System.out.println("El perimetro es: " + getRespuestaPE());
        return getRespuestaPE();
    }

    public double calcularArea()
    {
        setRespuestaAE(3* Math.pow(Apotema,2));
        System.out.println("El Are es: " + getRespuestaAE());
        return getRespuestaAE();
    }
}
