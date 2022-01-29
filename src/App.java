import java.util.Scanner;


public class App {
    private Scanner teclado;
    private int[] x;
    private int[] y;

    App(){
        teclado = new Scanner(System.in);
        int n;
        System.out.print("Ingrese la cantidad de puntos coordenado: ");
        n = teclado.nextInt();      
        x = new int[n];
        y = new int [n];
        int punto = 1;
        for(int i = 0; i < x.length; i++){
            System.out.print("Ingrese el valor de la cordenada X, para el punto " + punto + ": ");
            x[i] = teclado.nextInt();

            System.out.print("Ingrese el valor de la cordenada Y, para el punto " + punto + ": ");
            y[i] = teclado.nextInt();

            punto = punto + 1;
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }

    void imprimir(){
        System.out.println("Los puntos coordenados ingresados son: ");
        int n = 1;
        for(int i=0; i<x.length;i++){
            System.out.println("La coordenada numero " + n + " es: ("+x[i]+","+y[i]+")" );
            n = n +1;
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public void cuadrantes(){
        int cont1 = 0; // contador para cuadrante 1
        int cont2 = 0; //contador para cuadrante 2
        int cont3 = 0; //contador para cuadrante 3
        int cont4 = 0;  //contador para cuadrante 4
       
        for(int i=0;i<x.length;i++){           
                
                if(x[i] > 0 && y[i] > 0){ //primer cuadrante ++ 
                    cont1 = cont1 + 1;
                }else if(x[i] < 0  && y[i] > 0){  //segundo cuadrante -+
                    cont2 = cont2 + 1;
                }else if(x[i] < 0  && y[i] < 0){ //tercer cuadrante --
                    cont3 = cont3 + 1;
                }else if(x[i] > 0  && y[i] < 0){ //cuarto cuadrante +-
                    cont4 = cont4 + 1;
                }
            }
                              
        
        System.out.println("La cantidad de los puntos ingresados que se encuentra en el cuadrante 1 es de: " +cont1);
        System.out.println("La cantidad de los puntos ingresados que se encuentra en el cuadrante 2 es de: " +cont2);
        System.out.println("La cantidad de los puntos ingresados que se encuentra en el cuadrante 3 es de: " +cont3);
        System.out.println("La cantidad de los puntos ingresados que se encuentra en el cuadrante 4 es de: " +cont4);        
        
    }
    public static void main(String[] args){
        App cons = new App();
       cons.imprimir();
       cons.cuadrantes();
    }
}
