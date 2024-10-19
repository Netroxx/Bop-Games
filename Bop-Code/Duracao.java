package Bop-Code;


public class Duracao {
    private Hora hora;
    private int distancia;

    // Construtor
    public Duracao(Hora hora, int distancia) {
        if (distancia < 0) {
            throw new IllegalArgumentException("A distância não pode ser negativa.");
        }
        this.hora = hora;
        this.distancia = distancia;
    }


    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

   
    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTotalSegundos() {
        return (hora.getHoras() * 3600) + (hora.getMinutos() * 60) + hora.getSegundos();
    }
    
    // Método Relatório
    public String relatorio() {
        return "Tempo: " + hora.getHorasFormatadas() + " - Distância: " + distancia + " metros";
    }
}
    

