package figuras;

import java.util.Scanner;

public class Procesos {

    public void MENU(){
        Scanner sc = new Scanner(System.in);
        Estrella estrella = new Estrella();
        Hexagono hexagono = new Hexagono();
        Rombo rombo = new Rombo();

        System.out.println("MENU PRINCIPAL");
        System.out.println("Seleccione la figura que desea: \n1.Estrella\n2.Hexagono\n3.rombo");
        int opcion = sc.nextInt();

        switch(opcion)
        {
            case 1: 
            System.out.println("Ingrese el tamaño del apotema");
            estrella.setApotema(sc.nextDouble());
            estrella.calcularPerimetro();
            System.out.println("Ingrese el tamaño del apotema");
            estrella.setApotema(sc.nextDouble());
            estrella.calcularArea();
            break;

            case 2:
            System.out.println("Ingrese el tamaño del radio");
            hexagono.setRadio(sc.nextDouble());
            hexagono.calcularPerimetro();
            System.out.println("Ingrese el tamaño del radio");
            hexagono.setRadio(sc.nextDouble());
            hexagono.calcularArea();
            break;

            case 3:
            System.out.println("Ingrese el tamaño de un lador");
            rombo.setDiagonalMayor(sc.nextDouble());
            rombo.calcularPerimetro();
            System.out.println("Ingrese el tamaño de la diagonal mayor");
            rombo.setDiagonalMayor(sc.nextDouble());
            System.out.println("Ingrese el tamaño de la diagonal menor");
            rombo.setDiagonalMenor(sc.nextDouble());
            rombo.calcularArea();
        }
        sc.close();
    }
}
