package Bop-Code;
import java.util.ArrayList;
import java.util.List;

public class Ciclista extends Participante {
    private List<Etapa> etapas;

    public Ciclista(String nome, int numero, String cidade) {
        super(nome, numero, cidade);
        this.etapas = new ArrayList<>();
    }

    public void registrarEtapa(Etapa etapa) {
        if (etapas.size() < 21) {
            etapas.add(etapa);
        } else {
            System.out.println("Limite de 21 etapas já atingido.");
        }
    }

    public List<Etapa> getEtapas() {
        return etapas;
    }

    public int calcularTempoTotal() {
        int tempoTotal = 0;
        for (Etapa etapa : etapas) {
            tempoTotal += etapa.getDuracao().getTotalSegundos();
        }
        return tempoTotal;
    }

    public String difTempoEntreCiclistas(Ciclista outroCiclista) {
        int meuTempo = calcularTempoTotal();
        int tempoOutro = outroCiclista.calcularTempoTotal();
        int diferenca = Math.abs(meuTempo - tempoOutro);

        int minutos = diferenca / 60;
        int segundos = diferenca % 60;

        if (meuTempo < tempoOutro) {
            return getNome() + " está à frente de " + outroCiclista.getNome() + " por " + minutos + " minutos e " + segundos + " segundos.";
        } else if (meuTempo > tempoOutro) {
            return outroCiclista.getNome() + " está à frente de " + getNome() + " por " + minutos + " minutos e " + segundos + " segundos.";
        } else {
            return "Ambos os ciclistas têm o mesmo tempo.";
        }
    }

    public Ciclista vencedorDaEtapa(Ciclista outroCiclista, int numeroEtapa) {
        Etapa minhaEtapa = getEtapaPorNumero(numeroEtapa);
        Etapa etapaOutro = outroCiclista.getEtapaPorNumero(numeroEtapa);

        if (minhaEtapa != null && etapaOutro != null) {
            return minhaEtapa.getDuracao().getTotalSegundos() < etapaOutro.getDuracao().getTotalSegundos() ? this : outroCiclista;
        }
        return null; 
    }

    private Etapa getEtapaPorNumero(int numero) {
        for (Etapa etapa : etapas) {
            if (etapa.getNumero() == numero) {
                return etapa;
            }
        }
        return null; 
    }
}