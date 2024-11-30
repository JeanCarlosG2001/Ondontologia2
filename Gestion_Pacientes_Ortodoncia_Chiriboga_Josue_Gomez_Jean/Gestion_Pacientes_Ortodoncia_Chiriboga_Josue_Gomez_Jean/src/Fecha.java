/*Universidad De Las Americas
 * Estudiantes: Josue Chiriboga y Jean Carlos Gomez
 * Asignatura: Programación II
 * Fecha: 27/10/2024
 * NRC:5458
 * Actividad: Avance De Proyecto*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //Getters

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    //Setters

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Inicializar Fecha
    public void inicializarHoy(){
        GregorianCalendar gc = new GregorianCalendar();
        this.dia = gc.get(Calendar.DAY_OF_MONTH);
        this.mes = gc.get(Calendar.MONTH)+1;
        this.anio = gc.get(Calendar.YEAR);
    }

    //Calcular UltimoControl a ProximoControl

    //Formato fecha
    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }
}
