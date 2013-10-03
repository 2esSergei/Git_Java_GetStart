/*
1.a. A parancssori parameterek a sik pontjait irjak le.
Add meg, melyik van legtavolabb az origotol.
1.b. Add meg, hogy melyik pont van legkozelebb a legelso ponthoz.
(Sajat maga kivetelevel, termeszetesen. Legalabb ket pontunk van.)
*/

import java.util.Scanner;

public class Prog01{
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  String [] s = new String[20];
  float rr, r1, r2, x, y;
  rr=0;r1=0;r2=0;
  int i = 0; 
  if(0 == args[0].compareTo("a")){
   //a) feladat
   System.out.println("Sik megadott pontjai kozul az origotol a legtavolabbi keresese!\nKerem adja meg a pontokat soronkent a koordinata parokat szokozzel elvalasztva:\n(exit = bevitel befejezese, max. 10 koordinata-par)");
   s[0] = in.next();
   while(s[i].compareTo("exit") != 0 & i < 20){
    x = Float.parseFloat(s[i]);
    i++;
    s[i] = in.next();
    y = Float.parseFloat(s[i]);
    if (x*x+y*y > rr){
     r1 = x;
     r2 = y;
     rr = x*x+y*y;
    }
    i++;
    s[i] = in.next();
   }
   System.out.println("A legtavolabbi pont az origotol: (" + r1 + ";" + r2 + ") ami " + Math.sqrt(rr) + " tavolsagra van.");
  }else{
   //b) feladat
   System.out.println("Sik megadott pontjai kozul egy kijelolt ponttol a legtavolabbi keresese!\nKerem adja meg a referencia pont koordinatait (2 valos szam szokozzel elvalasztva):");
   float f1, f2;
   f1 = in.nextFloat();
   f2 = in.nextFloat();
   System.out.println("Kerem adja meg a pontokat soronkent a koordinata parokat szokozzel elvalasztva:\n(exit = bevitel befejezese, max. 10 koordinata-par)");
   s[0] = in.next();
   while(s[i].compareTo("exit") != 0 & i < 20){
    x = Float.parseFloat(s[i]);
    i++;
    s[i] = in.next();
    y = Float.parseFloat(s[i]);
    if ((x-f1)*(x-f1)+(y-f2)*(y-f2) > rr){
     r1 = x;
     r2 = y;
     rr = (x-f1)*(x-f1)+(y-f2)*(y-f2);
   }
    i++;
    s[i] = in.next();
   }
   System.out.println("A legtavolabbi pont a (" + f1 + ";" + f2 +") ponttol: (" + r1 + ";" + r2 + ") ami " + Math.sqrt(rr) + " tavolsagra van.");
  }
 }
}

//Ha tudjuk okosan kezelni a programot, akkor szepen mukodik, de ez keves
//Cel: ellenorzott beolvasas, azaz a "bolond-biztos" program elkeszitese
//Otlet: a Scanner modul kiismerese a dokumentaciokon es a referencia-leirasokon keresztul eredmenyes lehet
//Lehetseges eredmeny: tapasztalat szerzes a JAVA doksik bongeszeseben, betekintes szerzese egy alapveto JAVA modul mukodesebe, ezaltal a JAVA programozasi nyelvbe
//Javaslat: olyan atomi feladatokbol induljunk, amik kizarolag egy-egy eszkozre mutatnak ra (a tanulo feladata legyen megkeresni a megfelelo eszkozt is!), majd fokozatosan emeljuk a szintet, ahogy egyre tobb de mar megismert eszkozt kell egyuttesen alkalmazni. (En most meg nem tudok ossze allitani ilyet.) 
