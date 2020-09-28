
package menucalif;


public class promedios {
    int res;
    public int[] todos(int calif[]){
        res=(calif[0]+calif[1]+calif[2]+calif[3]+calif[4]+calif[5]+calif[6]+calif[7]+calif[8]+calif[9]+calif[10]+calif[11]+calif[12]+calif[13]+calif[14])/15;
        System.out.println("Promedio de toda la clase:"+res);
        return calif;
}
    
    public int[] principio(int calif[]){
        res=(calif[0]+calif[1]+calif[2]+calif[3]+calif[4])/5;
        System.out.println("Promedio primeros 5:"+res);
        return calif;
}
    
    
    public int[] finales(int calif[]){
        res=(calif[10]+calif[11]+calif[12]+calif[13]+calif[14])/5;
        System.out.println("Promedio de toda la clase:"+res);
        return calif;
}
}
