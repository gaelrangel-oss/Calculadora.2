import java.util.Scanner;

public class Calculadora {
//*
//@autor Gael 
//@Version 1.0
//@Since 28/09/2026
//*

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("  1.-Suma");
        System.out.println("  2.-Resta");
        System.out.println("  3.-Multiplicacion");
        System.out.println("  4.-Division");
System.out.println("  ");
System.out.println("Elije alguna opcion"); 
int opcion=teclado.nextInt();
        if (opcion <= 0 || opcion > 4) {
            System.out.println("Opcion invalida");
            return;
        } 

/* 
if (opcion>0 && opcion<=4){*/


          boolean negativoX = false;
          boolean negativoY = false;
          System.out.println("Digita el primer numero");
          int x = teclado.nextInt();
          if(x <= -1){ negativoX = true; x = x*-1;}
          System.out.println("Digita el segundo numero");
          int y = teclado.nextInt();

if (x < -128 || x > 127 || y < -128 || y > 127) {
    System.out.println("Error: Los numeros exceden el rango de 8 bits (-128 a 127).");
    return;
}

          if(y <= -1){ negativoY = true; y = y*-1;}
          //Declaracion 8 bits para primer numero
          int x1,x2,x3,x4,x5,x6,x7,x8;
          //Declaracion 8 bits para segundo numero
          int y1,y2,y3,y4,y5,y6,y7,y8;
          int z1,z2,z3,z4,z5,z6,z7,z8;
          //Inicializacion en 0
          x1=x2=x3=x4=x5=x6=x7=x8=0;
          y1=y2=y3=y4=y5=y6=y7=y8=0;
          z1=z2=z3=z4=z5=z6=z7=z8=0;

          int tmx = x;
          int tmy = y;

            for(int i = 8;i >= 1;i--){
              int resX = tmx%2;
              tmx = tmx/2;

              int resY = tmy%2;
              tmy = tmy/2;

              switch (i) {
                case 1: x1 = resX; y1 = resY; break;
                case 2: x2 = resX; y2 = resY; break;
                case 3: x3 = resX; y3 = resY; break;
                case 4: x4 = resX; y4 = resY; break;
                case 5: x5 = resX; y5 = resY; break;
                case 6: x6 = resX; y6 = resY; break;
                case 7: x7 = resX; y7 = resY; break;
                case 8: x8 = resX; y8 = resY; break;
              }
            }

              if (negativoX) {
              if (x1 == 0) {x1 = 1;} else {x1 = 0;}
              if (x2 == 0) {x2 = 1;} else {x2 = 0;}
              if (x3 == 0) {x3 = 1;} else {x3 = 0;}
              if (x4 == 0) {x4 = 1;} else {x4 = 0;}
              if (x5 == 0) {x5 = 1;} else {x5 = 0;}
              if (x6 == 0) {x6 = 1;} else {x6 = 0;}
              if (x7 == 0) {x7 = 1;} else {x7 = 0;}
              if (x8 == 0) {x8 = 1;} else {x8 = 0;}

              int acarreo = 1;
              // Desde que i es = 8, mientras i sea mayor igual a 1
              // Y acarreo sea = 1 , ejecuta y luego resta 1 a i
                
              for (int f = 8; f >= 1 && acarreo == 1; f--) {
                switch (f) {
                  case 8: if (x8 == 0) { x8 = 1; acarreo = 0; } else { x8 = 0; } break;
                  case 7: if (x7 == 0) { x7 = 1; acarreo = 0; } else { x7 = 0; } break;
                  case 6: if (x6 == 0) { x6 = 1; acarreo = 0; } else { x6 = 0; } break;
                  case 5: if (x5 == 0) { x5 = 1; acarreo = 0; } else { x5 = 0; } break;
                  case 4: if (x4 == 0) { x4 = 1; acarreo = 0; } else { x4 = 0; } break;
                  case 3: if (x3 == 0) { x3 = 1; acarreo = 0; } else { x3 = 0; } break;
                  case 2: if (x2 == 0) { x2 = 1; acarreo = 0; } else { x2 = 0; } break;
                  case 1: if (x1 == 0) { x1 = 1; acarreo = 0; } else { x1 = 0; } break;
                }
                  }
                }
              
            // Caso y negativo
            if (negativoY) {
              if (y1 == 0) {y1 = 1;} else {y1 = 0;}
              if (y2 == 0) {y2 = 1;} else {y2 = 0;}
              if (y3 == 0) {y3 = 1;} else {y3 = 0;}
              if (y4 == 0) {y4 = 1;} else {y4 = 0;}
              if (y5 == 0) {y5 = 1;} else {y5 = 0;}
              if (y6 == 0) {y6 = 1;} else {y6 = 0;}
              if (y7 == 0) {y7 = 1;} else {y7 = 0;}
              if (y8 == 0) {y8 = 1;} else {y8 = 0;}

              int acarreo = 1;

              for (int i = 8; i >= 1 && acarreo == 1; i--) {
                switch (i) {
                  case 8: if (y8 == 0) { y8 = 1; acarreo = 0; } else { y8 = 0; } break;
                  case 7: if (y7 == 0) { y7 = 1; acarreo = 0; } else { y7 = 0; } break;
                  case 6: if (y6 == 0) { y6 = 1; acarreo = 0; } else { y6 = 0; } break;
                  case 5: if (y5 == 0) { y5 = 1; acarreo = 0; } else { y5 = 0; } break;
                  case 4: if (y4 == 0) { y4 = 1; acarreo = 0; } else { y4 = 0; } break;
                  case 3: if (y3 == 0) { y3 = 1; acarreo = 0; } else { y3 = 0; } break;
                  case 2: if (y2 == 0) { y2 = 1; acarreo = 0; } else { y2 = 0; } break;
                  case 1: if (y1 == 0) { y1 = 1; acarreo = 0; } else { y1 = 0; } break;
                  }
               }
            }

switch(opcion){

case 1:

int acarreo = 0;
            int suma;
if (x+y > 127 || x+y < -128) {
    System.out.println("Error: Overflow");
}

            for (int i = 8; i >= 1; i--) {
            switch (i) {
                case 8:
                    suma = x8 + y8 + acarreo;
                    z8 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 7:
                    suma = x7 + y7 + acarreo;
                    z7 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 6:
                    suma = x6 + y6 + acarreo;
                    z6 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 5:
                    suma = x5 + y5 + acarreo;
                    z5 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 4:
                    suma = x4 + y4 + acarreo;
                    z4 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 3:
                    suma = x3 + y3 + acarreo;
                    z3 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 2:
                    suma = x2 + y2 + acarreo;
                    z2 = suma % 2;
                    acarreo = suma / 2;
                    break;

                case 1:
                    suma = x1 + y1 + acarreo;
                    z1 = suma % 2;
                    acarreo = suma / 2;
                    break;
            }
        }

System.out.println("Numero 1: " +x1+x2+x3+x4+x5+x6+x7+x8);
        System.out.println("Numero 2: " +y1+y2+y3+y4+y5+y6+y7+y8);
        System.out.println("Resultado:");
        System.out.println("" + z1+z2+z3+z4+z5+z6+z7+z8);
            //case 1
break;




case 2:
int Nacarreo=0;
int resta=0;
int cux=0;
int cuy=0;
 if (negativoX || negativoY) {
            for (int i = 8; i >= 1; i--) {
            switch (i) {
                case 8:
                    suma = x8 + y8 + Nacarreo;
                    z8 = suma % 2;
                    Nacarreo = suma / 2;
                    break;

                case 7:
                    suma = x7 + y7 + Nacarreo;
                    z7 = suma % 2;
                    Nacarreo = suma / 2;
                    break;

                case 6:
                    suma = x6 + y6 + Nacarreo;
                    z6 = suma % 2;
                    Nacarreo = suma / 2;
                    break;

                case 5:
                    suma = x5 + y5 + Nacarreo;
                    z5 = suma % 2;
                    Nacarreo = suma / 2;
                    break;

                case 4:
                    suma = x4 + y4 + Nacarreo;
                    z4 = suma % 2;
                    Nacarreo = suma / 2;
                    break;

                case 3:
                    suma = x3 + y3 + Nacarreo;
                    z3 = suma % 2;
                    Nacarreo = suma / 2;
                    break;

                case 2:
                    suma = x2 + y2 + Nacarreo;
                    z2 = suma % 2;
                    Nacarreo = suma / 2;
                    break;

                case 1:
                    suma = x1 + y1 + Nacarreo;
                    z1 = suma % 2;
                    Nacarreo = suma / 2;
                    break;
            }
        }
    }
    for (int i = 8; i >= 1; i--) {
        switch (i) {
            case 8:
                resta = x8 - y8 - Nacarreo;
                if (resta < 0) {
                    z8 = resta + 2;
                    Nacarreo = 1;
                } else {
                    z8 = resta;
                    Nacarreo = 0;
                }
                break;

            case 7:
                resta = x7 - y7 - Nacarreo;
                if (resta < 0) {
                    z7 = resta + 2;
                    Nacarreo = 1;
                } else {
                    z7 = resta;
                    Nacarreo = 0;
                }
                break;

            case 6:
                resta = x6 - y6 - Nacarreo;
                if (resta < 0) {
                    z6 = resta + 2;
                    Nacarreo = 1;
                } else {
                    z6 = resta;
                    Nacarreo = 0;
                }
                break;

            case 5:
                resta = x5 - y5 - Nacarreo;
                if (resta < 0) {
                    z5 = resta + 2;
                    Nacarreo = 1;
                } else {
                    z5 = resta;
                    Nacarreo = 0;
                }
                break;

            case 4:
                resta = x4 - y4 - Nacarreo;
                if (resta < 0) {
                    z4 = resta + 2;
                    Nacarreo = 1;
                } else {
                    z4 = resta;
                    Nacarreo = 0;
                }
                break;

            case 3:
                resta = x3 - y3 - Nacarreo;
                if (resta < 0) {
                    z3 = resta + 2;
                    Nacarreo = 1;
                } else {
                    z3 = resta;
                    Nacarreo = 0;
                }
                break;

            case 2:
                resta = x2 - y2 - Nacarreo;
                if (resta < 0) {
                    z2 = resta + 2;
                    Nacarreo = 1;
                } else {
                    z2 = resta;
                    Nacarreo = 0;
                }
                break;

            case 1:
                resta = x1 - y1 - Nacarreo;
                if (resta < 0) {
                    z1 = resta + 2;
                    Nacarreo = 1;
                } else {
                    z1 = resta;
                    Nacarreo = 0;
                }
                break;
        }
    }
System.out.println("Numero 1: " +x1+x2+x3+x4+x5+x6+x7+x8);
        System.out.println("Numero 2: " +y1+y2+y3+y4+y5+y6+y7+y8);
        System.out.println("Resultado:");
        System.out.println("" + z1+z2+z3+z4+z5+z6+z7+z8);
         
break;

case 3:
    if (x * y > 127 || x * y < -128) {
    System.out.println("Error: Overflow");
    break;
}
   z1=z2=z3=z4=z5=z6=z7=z8=0;
    
    
    
    int k = x;
    int ym = y;
    
    int km1,km2,km3,km4,km5,km6,km7,km8;
    km1=km2=km3=km4=km5=km6=km7=km8=0;
    int ym1,ym2,ym3,ym4,ym5,ym6,ym7,ym8;
    ym1=ym2=ym3=ym4=ym5=ym6=ym7=ym8=0;

   
    for(int i = 8; i >= 1; i--){
        int resk = k % 2;
        k = k / 2;
        switch (i) {
            case 1: km1 = resk; break;
            case 2: km2 = resk; break;
            case 3: km3 = resk; break;
            case 4: km4 = resk; break;
            case 5: km5 = resk; break;
            case 6: km6 = resk; break;
            case 7: km7 = resk; break;
            case 8: km8 = resk; break;
        }
    }
    
    
    for(int i = 8; i >= 1; i--){
        int resY = ym % 2;
        ym = ym / 2;
        switch (i) {
            case 1: ym1 = resY; break;
            case 2: ym2 = resY; break;
            case 3: ym3 = resY; break;
            case 4: ym4 = resY; break;
            case 5: ym5 = resY; break;
            case 6: ym6 = resY; break;
            case 7: ym7 = resY; break;
            case 8: ym8 = resY; break;
        }
    }
    int m1,m2,m3,m4,m5,m6,m7,m8;
    m1=km1;
    m2=km2;
    m3=km3;
    m4=km4;
    m5=km5;
    m6=km6;
    m7=km7;
    m8=km8;
    
            int sumam;

            for (int i = 8; i >= 1; i--) {
int my=0;
switch (i){
    case 8: my=ym8; break;
    case 7: my=ym7; break;
    case 6: my=ym6; break;
    case 5: my=ym5; break;
    case 4: my=ym4; break;
    case 3: my=ym3; break;
    case 2: my=ym2; break;
    case 1: my=ym1; break;

            }
            if (my == 1) {
            int macarreo=0;
for (int f = 8; f >= 1; f--) {
    
            switch (f) {
                case 8:
                    sumam = z8 + m8 + macarreo;
                    z8 = sumam % 2;
                    macarreo = sumam / 2;
                    break;

                case 7:
                    sumam = z7 + m7 + macarreo;
                    z7 = sumam % 2;
                    macarreo = sumam / 2;
                    break;

                case 6:
                    sumam = z6 + m6 + macarreo;
                    z6 = sumam % 2;
                    macarreo = sumam / 2;
                    break;

                case 5:
                    sumam = z5 + m5 + macarreo;
                    z5 = sumam % 2;
                    macarreo = sumam / 2;
                    break;

                case 4:
                    sumam = z4 + m4 + macarreo;
                    z4 = sumam % 2;
                    macarreo = sumam / 2;
                    break;

                case 3:
                    sumam = z3 + m3 + macarreo;
                    z3 = sumam % 2;
                    macarreo = sumam / 2;
                    break;

                case 2:
                    sumam = z2 + m2 + macarreo;
                    z2 = sumam % 2;
                    macarreo = sumam / 2;
                    break;

                case 1:
                    sumam = z1 + m1 + macarreo;
                    z1 = sumam % 2;
                    macarreo = sumam / 2;
                    break;
            }
        }
    }
    m1=m2;
m2=m3;
m3=m4;
m4=m5;
m5=m6;
m6=m7;
m7=m8;
m8=0;
        }

if ((negativoX && !negativoY) || (!negativoX && negativoY)){
    if (z1 == 0) {z1 = 1;} else {z1 = 0;}
              if (z2 == 0) {z2 = 1;} else {z2 = 0;}
              if (z3 == 0) {z3 = 1;} else {z3 = 0;}
              if (z4 == 0) {z4 = 1;} else {z4 = 0;}
              if (z5 == 0) {z5 = 1;} else {z5 = 0;}
              if (z6 == 0) {z6 = 1;} else {z6 = 0;}
              if (z7 == 0) {z7 = 1;} else {z7 = 0;}
              if (z8 == 0) {z8 = 1;} else {z8 = 0;}

              int acarreoo = 1;
              // Desde que i es = 8, mientras i sea mayor igual a 1
              // Y acarreo sea = 1 , ejecuta y luego resta 1 a i
                
              for (int f = 8; f >= 1 && acarreoo == 1; f--) {
                switch (f) {
                  case 8: if (z8 == 0) { z8 = 1; acarreoo = 0; } else { z8 = 0; } break;
                  case 7: if (z7 == 0) { z7 = 1; acarreoo = 0; } else { z7 = 0; } break;
                  case 6: if (z6 == 0) { z6 = 1; acarreoo = 0; } else { z6 = 0; } break;
                  case 5: if (z5 == 0) { z5 = 1; acarreoo = 0; } else { z5 = 0; } break;
                  case 4: if (z4 == 0) { z4 = 1; acarreoo = 0; } else { z4 = 0; } break;
                  case 3: if (z3 == 0) { z3 = 1; acarreoo = 0; } else { z3 = 0; } break;
                  case 2: if (z2 == 0) { z2 = 1; acarreoo = 0; } else { z2 = 0; } break;
                  case 1: if (z1 == 0) { z1 = 1; acarreoo = 0; } else { z1 = 0; } break;
                }
                  }
                }

    


        System.out.println("Numero 1: " +x1+x2+x3+x4+x5+x6+x7+x8);
        System.out.println("Numero 2: " +y1+y2+y3+y4+y5+y6+y7+y8);
        System.out.println("Resultado:");
        System.out.println("" + z1+z2+z3+z4+z5+z6+z7+z8);

break;//fin caso 3(multiplicacion)

case 4:
    int res1,res2,res3,res4,res5,res6,res7,res8;
    res1=res2=res3=res4=res5=res6=res7=res8=0;
   if (y == 0) {
        System.out.println("No se puede dividir entre 0");
        break;
    }

    int kd1, kd2, kd3, kd4, kd5, kd6, kd7, kd8;
    kd1 = kd2 = kd3 = kd4 = kd5 = kd6 = kd7 = kd8 = 0;

    int yd1, yd2, yd3, yd4, yd5, yd6, yd7, yd8;
    yd1 = yd2 = yd3 = yd4 = yd5 = yd6 = yd7 = yd8 = 0;

    int kd = x; //dividendo
    int yd = y;

   
    for (int i = 8; i >= 1; i--) {
        int resk = kd % 2;
        kd = kd / 2;
        switch (i) {
            case 1: kd1 = resk; break;
            case 2: kd2 = resk; break;
            case 3: kd3 = resk; break;
            case 4: kd4 = resk; break;
            case 5: kd5 = resk; break;
            case 6: kd6 = resk; break;
            case 7: kd7 = resk; break;
            case 8: kd8 = resk; break;
        }
    }

   
    for (int i = 8; i >= 1; i--) {
        int resY = yd % 2;
        yd = yd / 2;
        switch (i) {
            case 1: yd1 = resY; break;
            case 2: yd2 = resY; break;
            case 3: yd3 = resY; break;
            case 4: yd4 = resY; break;
            case 5: yd5 = resY; break;
            case 6: yd6 = resY; break;
            case 7: yd7 = resY; break;
            case 8: yd8 = resY; break;
        }
    }

    
    int q1, q2, q3, q4, q5, q6, q7, q8;
    q1 = q2 = q3 = q4 = q5 = q6 = q7 = q8 = 0;

    
    boolean continuarRestando = true;


    while (continuarRestando) {

       
        boolean esMayorOIgual = true;
        for (int i = 1; i <= 8; i++) {
            int bitK = 0, bitY = 0;
            switch (i) {
                case 1: bitK = kd1; bitY = yd1; break;
                case 2: bitK = kd2; bitY = yd2; break;
                case 3: bitK = kd3; bitY = yd3; break;
                case 4: bitK = kd4; bitY = yd4; break;
                case 5: bitK = kd5; bitY = yd5; break;
                case 6: bitK = kd6; bitY = yd6; break;
                case 7: bitK = kd7; bitY = yd7; break;
                case 8: bitK = kd8; bitY = yd8; break;
            }

            if (bitK > bitY) {
                esMayorOIgual = true;
                break;
            } else if (bitK < bitY) {
                esMayorOIgual = false;
                break;
            }
        }

        if (esMayorOIgual) {
           
            int dNacarreo = 0;
            int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0, r7 = 0, r8 = 0;

            for (int i = 8; i >= 1; i--) {
                int bitK = 0, bitY = 0;
                switch (i) {
                    case 1: bitK = kd1; bitY = yd1; break;
                    case 2: bitK = kd2; bitY = yd2; break;
                    case 3: bitK = kd3; bitY = yd3; break;
                    case 4: bitK = kd4; bitY = yd4; break;
                    case 5: bitK = kd5; bitY = yd5; break;
                    case 6: bitK = kd6; bitY = yd6; break;
                    case 7: bitK = kd7; bitY = yd7; break;
                    case 8: bitK = kd8; bitY = yd8; break;
                }

                int dresta = bitK - bitY - dNacarreo;
                int bitRes;
                if (dresta < 0) {
                    bitRes = dresta + 2;
                    dNacarreo = 1;
                } else {
                    bitRes = dresta;
                    dNacarreo = 0;
                }

                switch (i) {
                    case 1: r1 = bitRes; break;
                    case 2: r2 = bitRes; break;
                    case 3: r3 = bitRes; break;
                    case 4: r4 = bitRes; break;
                    case 5: r5 = bitRes; break;
                    case 6: r6 = bitRes; break;
                    case 7: r7 = bitRes; break;
                    case 8: r8 = bitRes; break;
                }
            }

            
            kd1 = r1;
            kd2 = r2;
            kd3 = r3;
            kd4 = r4;
            kd5 = r5;
            kd6 = r6;
            kd7 = r7;
            kd8 = r8;

            res1 = r1;
            res2 = r2;
            res3 = r3;
            res4 = r4;
            res5 = r5;
            res6 = r6;
            res7 = r7;
            res8=r8;
    
            
            int acarreoQ = 1;
            for (int f = 8; f >= 1 && acarreoQ == 1; f--) {
                switch (f) {
                    case 8: if (q8 == 0) { q8 = 1; acarreoQ = 0; } else { q8 = 0; } break;
                    case 7: if (q7 == 0) { q7 = 1; acarreoQ = 0; } else { q7 = 0; } break;
                    case 6: if (q6 == 0) { q6 = 1; acarreoQ = 0; } else { q6 = 0; } break;
                    case 5: if (q5 == 0) { q5 = 1; acarreoQ = 0; } else { q5 = 0; } break;
                    case 4: if (q4 == 0) { q4 = 1; acarreoQ = 0; } else { q4 = 0; } break;
                    case 3: if (q3 == 0) { q3 = 1; acarreoQ = 0; } else { q3 = 0; } break;
                    case 2: if (q2 == 0) { q2 = 1; acarreoQ = 0; } else { q2 = 0; } break;
                    case 1: if (q1 == 0) { q1 = 1; acarreoQ = 0; } else { q1 = 0; } break;

                }
            }

        } else {
            continuarRestando = false;
        }
    }

    
    z1 = q1;
    z2 = q2;
    z3 = q3;
    z4 = q4;
    z5 = q5;
    z6 = q6;
    z7 = q7;
    z8 = q8;

    // 5. Ajustar signo (Complemento a 2) si uno solo de los operandos era negativo
    if ((negativoX && !negativoY) || (!negativoX && negativoY)) {
      
              if (z1 == 0) {z1 = 1;} else {z1 = 0;}
              if (z2 == 0) {z2 = 1;} else {z2 = 0;}
              if (z3 == 0) {z3 = 1;} else {z3 = 0;}
              if (z4 == 0) {z4 = 1;} else {z4 = 0;}
              if (z5 == 0) {z5 = 1;} else {z5 = 0;}
              if (z6 == 0) {z6 = 1;} else {z6 = 0;}
              if (z7 == 0) {z7 = 1;} else {z7 = 0;}
              if (z8 == 0) {z8 = 1;} else {z8 = 0;}

              int aacarreo = 1;

              for (int i = 8; i >= 1 && aacarreo == 1; i--) {
                switch (i) {
                  case 8: if (z8 == 0) { z8 = 1; aacarreo = 0; } else { z8 = 0; } break;
                  case 7: if (z7 == 0) { z7 = 1; aacarreo = 0; } else { z7 = 0; } break;
                  case 6: if (z6 == 0) { z6 = 1; aacarreo = 0; } else { z6 = 0; } break;
                  case 5: if (z5 == 0) { z5 = 1; aacarreo = 0; } else { z5 = 0; } break;
                  case 4: if (z4 == 0) { z4 = 1; aacarreo = 0; } else { z4 = 0; } break;
                  case 3: if (z3 == 0) { z3 = 1; aacarreo = 0; } else { z3 = 0; } break;
                  case 2: if (z2 == 0) { z2 = 1; aacarreo = 0; } else { z2 = 0; } break;
                  case 1: if (z1 == 0) { z1 = 1; aacarreo = 0; } else { z1 = 0; } break;
                  }
               }
            
    }

    // 6. Imprimir binario
    System.out.println("Numero 1: " + x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8);
    System.out.println("Numero 2: " + y1 + y2 + y3 + y4 + y5 + y6 + y7 + y8);
    System.out.println(" ");
    System.out.println("Cociente:" + z1 + z2 + z3 + z4 + z5 + z6 + z7 + z8);
System.out.println("Residuo:" + res1 + res2 + res3 + res4 + res5 + res6 + res7 + res8);
   

break; 





}//Swich



}//Main
    }//Clase

    
