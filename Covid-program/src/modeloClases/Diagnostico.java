package modeloClases;

import java.util.Date;

public class Diagnostico {

    private int idDiagnostico;

    private Date fecha_informe;

    private int temperatura;

    private boolean estado;

    private int cantSintomas;

    private Ciudadano Ciudadano;

    public Diagnostico(int idDiagnostico, Date fecha_informe, Ciudadano Ciudadano, int temperatura, boolean estado) {
        this.idDiagnostico = idDiagnostico;
        this.fecha_informe = fecha_informe;
        this.Ciudadano = Ciudadano;
        this.temperatura = temperatura;
        this.estado = estado;
    }

    public Diagnostico() {

    }

    public Diagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }
    

    public Diagnostico(Date fecha_informe, int temperatura, boolean estado) {
        this.fecha_informe = fecha_informe;
        this.temperatura = temperatura;
        this.estado = estado;
    }

    public Diagnostico(Date fecha_informe, int temperatura, boolean estado, int cantSintomas) {
        this.fecha_informe = fecha_informe;
        this.temperatura = temperatura;
        this.estado = estado;
        this.cantSintomas = cantSintomas;
    }

    public int getCantSintomas() {
        return cantSintomas;
    }

    public void setCantSintomas(int cantSintomas) {
        this.cantSintomas = cantSintomas;
    }

    public Date getFecha_informe() {
        return fecha_informe;
    }

    public void setFecha_informe(Date fecha_informe) {
        this.fecha_informe = fecha_informe;
    }

    public Ciudadano getCiudadano() {
        return Ciudadano;
    }

    public void setCiudadano(Ciudadano Ciudadano) {
        this.Ciudadano = Ciudadano;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
