package listasEnlazadas;
//Zuasnabar paucar madeley
import java.util.Scanner;
public class Prueba {
public static void main(String[] args) {
Lista lis=new Lista();
Lista l=new Lista();
Estudiante est;
int n=1;
Scanner cs=new Scanner(System.in);
String nom;
int eda;
String ci;
while(n<6){
System.out.println("introdusca el nombre del studiante\t"+n);
nom=cs.next();
System.out.println("introdusca la edad del estudiante\t"+n);
eda=cs.nextInt();
System.out.println("introdusca el CI del estudiante\t"+n);
ci=cs.next();
est=new Estudiante(nom, eda, ci);
lis.insertar(est);
l.InsertarNoRepetido(est);
n++;
}
System.out.println("primera lista");
lis.mostrar();
System.out.println("segunda lista");
l.mostrar();
System.out.println("intercalados");
lis.Intercalar(l.cab);
lis.mostrar();
}
}
