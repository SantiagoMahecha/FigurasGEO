package figuras;
import java.util.Scanner;

public class Rombo extends Figuras
{
    Scanner sc = new Scanner(System.in);
    double DiagonalMayor;
    double DiagonalMenor;
    double RespuestaA;
    double RespuestaP;
    double Lado;

    public Rombo()
    {

    }

    public Rombo(double Lado,double DiagonalMayor,double DiagonalMenor, double RespuestaA,double RespuestaP)
    {
        this.Lado = Lado;
        this.DiagonalMayor = DiagonalMayor;
        this.DiagonalMenor = DiagonalMenor;
        this.RespuestaA = RespuestaA;
        this.RespuestaP = RespuestaP;
    }

    

    public double getDiagonalMayor() {
        return DiagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        DiagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return DiagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        DiagonalMenor = diagonalMenor;
    }

    public double getRespuestaA() {
        return RespuestaA;
    }

    public void setRespuestaA(double respuestaA) {
        RespuestaA = respuestaA;
    }

    public double getRespuestaP() {
        return RespuestaP;
    }

    public void setRespuestaP(double respuestaP) {
        RespuestaP = respuestaP;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double lado) {
        Lado = lado;
    }

    public double calcularPerimetro()
    {
        setRespuestaP(Lado*4);
        System.out.println("El perimetro es: " + getRespuestaP());
        return getRespuestaP();
    }
    
    public double calcularArea()
    {
        setRespuestaA((DiagonalMayor * DiagonalMenor)/2);
        System.out.println("El area es: " + getRespuestaA());
        return getRespuestaA();
    }
}
