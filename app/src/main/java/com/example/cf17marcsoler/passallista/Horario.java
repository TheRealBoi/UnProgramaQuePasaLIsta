package com.example.cf17marcsoler.passallista;
import java.io.*;
public class Horario{

    public static final int N_MODULOS = 13;
    public static final int N_HORAS = 6;
    /*
     * El código del modulo estará formado por 5 cifras, las dos primeras sacadas del módulo, las otras tres conformadas por la UF correspondeiente.
     * EL código del curso estara formado por cuatro cifras, basadas en el código Ascii de dos de las letras significativas del nombre del curso, que serán: DM (DAM), DW (DAW), AX (ASIX)
     * Los códigos de los cursos serán los siguientes: DM = 6877, DW = 6887, AX = 6588
     * Los códigos de los módulos se ordenan de 001 a 015, el primer 0 siendo la M y el resto el número del módulo.
      */


    int horas[] = new int[N_HORAS];
    //int modulos[] = new int[N_MODULOS];
    int modulo;
    private int curso;
    private int hora, minuto;



    public Horario(){
       // for(int i = 0; i < N_MODULOS; i++ ){
       //     modulos[i] = 0;
       // }
        modulo = 000;
        curso = 0;
        hora = 0;
        minuto = 0;
    }
    public Horario(int curso){
        this();
        this.curso = curso;
    }
    public Horario(int modulos[], int codigo){
        for(int i = 0; i < N_HORAS; i++ ){
            if(i != 3){
                this.horas[i] = codigo;
            }else {
                this.horas[i] = 000;
            }
        }
    }

    public void setModulo(int modulo){
        this.modulo = modulo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto < 60){
            this.minuto = minuto;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
// la hora sera entre 8 y 21 dado que fuera de esas horas el centro permanece cerrado, por lo que no puede haber personas con horario en esas horas.
        if(hora >= 8 && hora < 21){
            this.hora = hora;
        }

    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        if(curso == 6877 || curso == 6887 || curso == 6588) {
            this.curso = curso;
        }
    }

    public String toString(){
        String string = new String();
        for(int i = 0; i < horas.length; i++ ){
            string = horas[i] + " ";
            if(horas[i] == 000){
                string = "patio";
            }else{
                string = "M" + horas[i];
            }
        }
        return string;
    }

}