/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alferezroque20250811;

/**
 *
 * @author UFG
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    
    //VARAIBLES GLOBALES
    public static int horasEnUnDia = 24;
    public static int segundosEnUnaHora = 3600;
    public static int segundosEnUnMinuto = 60;
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES LOCALES
        int segundosTotales = 91111;
        //se asigna el valor de dias a la variable local
        int dias = calcularDias(segundosTotales);
        int segundosRestantesDespuesDeExtraerDias = obtenerSegundosRestantesDespuesDeExtraerDias(segundosTotales);
        
        int horas = calcularHoras(segundosRestantesDespuesDeExtraerDias);
        int segundosRestantesDespuesDeExtraerHoras = obtenerSegundosRestantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);
        
        int minutos = calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        int segundosFinales = obtenerSegundosRestantesDespuesDeExtraerMinutos(segundosRestantesDespuesDeExtraerHoras);
        
        
        System.out.println("Usted a solicitado calcular los dias, horas, ,minutos y segundos a partir de un numero mayor a 86400");
        System.out.println("Usted ha indicado el valor actual de segundos como: " + segundosTotales);
        System.out.println("Dias: " +dias);
        System.out.println("Horas: " +horas);
        System.out.println("Minutos: " +minutos);
        System.out.println("Segundos:" +segundosFinales);
    }
    /*MODULO PARA CALCULAR LA CANTIDAD DE DIAS*/
    public static int calcularDias(int segundosTotales){
        return segundosTotales/(Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    
    /*MODULO PARA CALCULAR LOS SEGUNDOS RESTANTES DESPUES DE EXTRAER LOS DIAS*/
    public static int obtenerSegundosRestantesDespuesDeExtraerDias(int segundosTotales){
        return segundosTotales % (Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    
    /*MODULO PARA CALCULAR LAS HORAS*/
    
    public static int calcularHoras(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnaHora;
    }
    
    /*MODULOS PARA CALCULAR LOS SEGUNDOS RESTANTES DESPUES DE EXTRAER LAS HORAS*/
    public static int obtenerSegundosRestantesDespuesDeExtraerHoras(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnaHora;
    }
    
    /*MODULO PARA CALCULAR LA CANTIDAD A PARTIR DE LOS SEGUNDOS RESTANTES*/
    public static int calcularMinutos(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnMinuto;
    }
    
    /*MODULO PARA CALCULAR LOS SEGUNDOS RESTANTES DE TODA LA OPERACIÓN*/
    public static int obtenerSegundosRestantesDespuesDeExtraerMinutos(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnMinuto;
    }
}
