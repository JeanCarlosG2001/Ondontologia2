/*Universidad De Las Americas
 * Estudiantes: Josue Chiriboga y Jean Carlos Gomez
 * Asignatura: Programación II
 * Fecha: 27/10/2024
 * NRC:5458
 * Actividad: Avance De Proyecto*/

import java.util.Date;

public class Paciente {

    private int idPaciente;
    private String nombre;
    private String apellido;
    private Fecha fechaUltimoControl;
    private Fecha fechaProximoControl;
    private String grupo;
    private Doctor doctora;
    private String asistencia;
    private String estadoControl;
    private double valorControl;


    public Paciente(int idPaciente, String nombre, String apellido, Fecha fechaUltimoControl, Fecha fechaProximoControl, String grupo, Doctor doctora, String asistencia, String estadoControl, double valorControl){
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaUltimoControl = fechaUltimoControl;
        this.fechaProximoControl = fechaProximoControl;
        this.grupo = grupo;
        this.doctora = doctora;
        this.asistencia = asistencia;
        this.estadoControl = estadoControl;
        this.valorControl = valorControl;
    }

    //Getters

    public int getIdPaciente() {
        return idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Fecha getFechaUltimoControl() {
        return fechaUltimoControl;
    }

    public Fecha getFechaProximoControl() {
        return fechaProximoControl;
    }

    public String getGrupo() {
        return grupo;
    }

    public Doctor getDoctora() {
        return doctora;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public String getEstadoControl() {
        return estadoControl;
    }

    public double getValorControl() {
        return valorControl;
    }

    //Setters

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaProximoControl(Fecha fechaProximoControl) {
        this.fechaProximoControl = fechaProximoControl;
    }

    public void setFechaUltimoControl(Fecha fechaUltimoControl) {
        this.fechaUltimoControl = fechaUltimoControl;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setDoctora(Doctor doctora) {
        this.doctora = doctora;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public void setEstadoControl(String estadoControl) {
        this.estadoControl = estadoControl;
    }

    public void setValorControl(double valorControl) {
        this.valorControl = valorControl;
    }

    @Override
    public String toString() {
        return  "ID Paciente:" + idPaciente + '\n' +
                "Nombre Paciente:" + nombre + '\n' +
                "Apellido Paciente:" + apellido + '\n' +
                "Fecha Ultimo Control:" + fechaUltimoControl.toString() + '\n' +
                "Fecha Proximo Control:" + fechaProximoControl.toString() + '\n' +
                "Grupo:" + grupo + '\n' +
                "Doctor Designado:" + doctora.toString() + '\n' +
                "Asistencia Paciente:" + asistencia + '\n' +
                "Estado de Control:" + estadoControl + '\n' +
                "Valor A Pagar:" + valorControl;
    }
}
