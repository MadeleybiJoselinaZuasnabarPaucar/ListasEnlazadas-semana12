package listasEnlazadas;
//zuasnabar paucar madeley
public class Estudiante{
String nombre;
int edad;
String CI;
public Estudiante(String n,int e,String c) {
nombre=n;
edad=e;
CI=c;
}
@Override
public String toString(){
return nombre+"\t"+edad+"\t"+CI+"\n";
}
}
