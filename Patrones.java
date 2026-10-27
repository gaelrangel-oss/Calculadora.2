

import java.util.Scanner;


public class Patrones {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
System.out.println("Ingresa torre a relizar");
System.out.println("1.-Piramide con unos");
System.out.println("2.-Piramide de asteriscos");
System.out.println("3.-Rombo de asteriscos");
System.out.println("4.-Piramide numerica simetrica");
int opcion = teclado.nextInt();

System.out.println("Ingresa tamaño del patron");
        
int n = teclado.nextInt();

switch (opcion){
            
case (1):   
int r = n;
String s = " ";
int j = 2;

for (int e = 1; e <= n; e++) {

System.out.print(s);

    }
System.out.println("1");
while (j <= n) {
 for (int i = n; i <= r; i++) {
if (i < (n + 1)) {
for (int k = 1; k <= n - j; k++) {
 System.out.print(s);
}
System.out.print("1");
                        }
System.out.print(" *");
 }
r = r + 1;
j = j + 1;
System.out.println(" 1");
                }
         break;  

case (2):
int l = n;
 String p = " ";
int u = 1;

while (u <= n) {
for (int i = n; i <= l; i++) {
if (i < (n + 1)) {
for (int k = 1; k <= n - u; k++) {
System.out.print(p);
}
}
System.out.print("* ");
}
l = l + 1;
u = u + 1;
System.out.println("");
}

break;

case (3):
int a = n;
String b = " ";
int c = 1;

while (c <= n) {
for (int i = n; i <= a; i++) {
if (i < (n + 1)) {
for (int k = 1; k <= n - c; k++) {
System.out.print(b);
}
 }
System.out.print("* ");
}
a = a + 1;
c = c + 1;
System.out.println("");
 }

a = a - 2;
c = n - 1;

while (c >= 1) {
for (int i = n; i <= a; i++) {
if (i < (n + 1)) {
for (int k = 1; k <= n - c; k++) {
  System.out.print(b);
}

}
System.out.print("* ");
}
a = a - 1;
c = c - 1;
System.out.println("");
}
break;
case (4):

for (int i = 1; i <= n; i++) {
for (int k = 1; k <= n - i; k++) {
  System.out.print("  ");
 }
for (int num = 1; num <= i; num++) {
 System.out.print(num + " ");
  }

   for (int num = i - 1; num >= 1; num--) {
System.out.print(num + " ");
}

System.out.println("");
 }




  break;
        }
    
    }


}//fin clase