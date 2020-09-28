
package menucalif;

import java.util.Scanner;

public class Main {

   
public static void main(String[] args){
   
   String[] datosUsuario=new String[15];
        String[] datosCtrl=new String[15];
        int[] calif=new int[15];
        
        nombres  instancianombres=new nombres();
        instancianombres.metodoNom(datosUsuario);
        instancianombres.metodoCtrl(datosCtrl);
        promedios instanciapromedios=new promedios();
         int res;
        int opc=0;
        Scanner c=new Scanner(System.in);
        
        
        
        
        System.out.println("Ingresa las calificaciones de los siguientes alumnos:");
       
         for(int i=0;i<15;i++){
          
             System.out.print(datosCtrl[i]+" "+datosUsuario[i]+"  ");
             calif[i]=c.nextInt();
         }
         do{
        System.out.println("¿Que promedio necesitas?");
        System.out.println("1.De la clase    2.Primeros 5     3.Ultimos 5    4.Salir");
        opc=c.nextInt();
        
        switch(opc){
            
            case 1:
              instanciapromedios.todos(calif);
                
            break;
            
            case 2:
                instanciapromedios.principio(calif);
            break;
            
            case 3:
                instanciapromedios.finales(calif);
            break;
            
            case 4:
                System.exit(0);
            break;    
            
            default: System.out.println("Opción incorrecta");
        }
        
        do{
        System.out.println("¿Quieres calcular otro promedio? 1. Si 2. No");
        opc=c.nextInt();
        
             switch(opc){
                 case 1:
                 opc=1;
             break;
                 case 2:
                 System.exit(0);
                 break;
                 default: System.out.println("Opción incorrecta");
             }
        
        }while(opc>1);
       
         }while(opc==1);
       
    }
    

}
