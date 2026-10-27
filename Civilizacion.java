import java.util.Scanner;

public class Civilizacion {

    
    private String nombre = "Roma";
    private int era = 1;
    private int poblacion = 50000;
    private int alimento = 1000;
    private int madera = 2000;
    private int oro = 5000;


    
    public Civilizacion(String nombre, int era, int poblacion, int alimento, int madera, int oro) {
        this.nombre = nombre;
        this.era = era;
        this.poblacion = poblacion;
        this.alimento = alimento;
        this.madera = madera;
        this.oro = oro;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEra() {
        return era;
    }

    public void setEra(int era) {
        if (era < 0) {
            System.out.println("Valor invalido");
        } else {
            this.era = era;
        }
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        if (poblacion < 0) {
            System.out.println("Valor invalido");
        } else {
            this.poblacion = poblacion;
        }
    }

    public int getAlimento() {
        return alimento;
    }

    public void setAlimento(int alimento) {
        if (alimento < 0) {
            System.out.println("Valor invalido");
        } else {
            this.alimento = alimento;
        }
    }

    public int getMadera() {
        return madera;
    }

    public void setMadera(int madera) {
        if (madera < 0) {
            System.out.println("Valor invalido");
        } else {
            this.madera = madera;
        }
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        if (oro < 0) {
            System.out.println("Valor invalido");
        } else {
            this.oro = oro;
        }
    }

   
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        
        Civilizacion c1 = new Civilizacion("Roma", 1, 50000, 1000, 2000, 5000);

        
        System.out.println("Valores Actuales de la Civilizacion");
        System.out.println("Nombre: " + c1.getNombre());
        System.out.println("Era: " + c1.getEra());
        System.out.println("Población: " + c1.getPoblacion());
        System.out.println("Alimento: " + c1.getAlimento());
        System.out.println("Madera: " + c1.getMadera());
        System.out.println("Oro: " + c1.getOro());
        System.out.println("   ");

        
        System.out.print("Ingrese número de aldeanos a alimentar/mantener: ");
        int aldeanos = teclado.nextInt();

        System.out.println("¿Cuánto consume cada aldeano?");
        System.out.print("Comida: ");
        int hambre = teclado.nextInt();

        System.out.print("Oro: ");
        int precio = teclado.nextInt();

        System.out.print("Madera: ");
        int fuego = teclado.nextInt();

        
        int consumoComida = aldeanos * hambre;
        int consumoOro = aldeanos * precio;
        int consumoMadera = aldeanos * fuego;

        System.out.println("Recursos Consumidos");
        System.out.println("Comida total consumida: " + consumoComida);
        System.out.println("Oro total consumido: " + consumoOro);
        System.out.println("Madera total consumida: " + consumoMadera);

        
        c1.setAlimento(c1.getAlimento() - consumoComida);
        c1.setOro(c1.getOro() - consumoOro);
        c1.setMadera(c1.getMadera() - consumoMadera);

        
        System.out.println("Recursos Restantes");
        System.out.println("Alimento restante: " + c1.getAlimento());
        System.out.println("Madera restante: " + c1.getMadera());
        System.out.println("Oro restante: " + c1.getOro());

     
    }
}