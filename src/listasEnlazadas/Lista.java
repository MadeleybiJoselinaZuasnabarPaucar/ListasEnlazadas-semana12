package listasEnlazadas;
//zuasnabar paucar madeley
public class Lista {
Nodo cab;
public Lista() {
cab = null;
}
void insertar(Estudiante x){
Nodo tem=new Nodo(x);
if(cab==null){
cab=tem;
}
else{
tem.enla=cab;
cab=tem;
}
}
void mostrar(){
Nodo tem=cab;
while(tem!=null){
System.out.print(tem.info);
tem=tem.enla;
}
System.out.println();
}
int cantidad(){
int con=0;
if(cab!=null){
Nodo tem=cab;
while(tem!=null){
if(tem.info.edad>20)
con++;
tem=tem.enla;
}
}
return con;
}
float promedio(){
int sum=0,con=0;
if(cab!=null){
Nodo tem=cab;
while(tem!=null){
sum+=tem.info.edad;
con++;
tem=tem.enla;
}
}
return (float)sum/con;
}
Estudiante mayor(){
Estudiante e=null;
int may=0;
if(cab!=null){
Nodo tem=cab;
while(tem!=null){
if(tem.info.edad>may){
may=tem.info.edad;
e=tem.info;
}
tem=tem.enla;
}
}
return e;
}
void InsertarNoRepetido(Estudiante x){
if(cab==null){
cab=new Nodo(x);
}
else{
Nodo p=cab;
while(p!=null){
if(p.info.CI.compareTo(x.CI)==0)
break;
p=p.enla;
}
if(p==null){
Nodo tem=new Nodo(x);
tem.enla=cab;
cab=tem;
}
}
}
void Intercalar(Nodo x){
if(cab==null)
cab=x;
if(x!=null){
Nodo tem1=cab,tem2=cab.enla;
while(x!=null&&tem2!=null){
tem1.enla=x;
tem1=x;
x=x.enla;
tem1.enla=tem2;
tem1=tem2;
tem2=tem2.enla;
}
if(x!=null){
tem1.enla=x;
}
}
}
}