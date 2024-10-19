package Bop-Code;
public class Etapa {
    
    public class Etapa {
        private int numero;
        private Data data;
        private Duracao duracao;
    
      
        public Etapa(int numero, Data data, Duracao duracao) {
            this.numero = numero;
            this.data = data;
            this.duracao = duracao;
        }
    
   
        public int getNumero() {
            return numero;
        }
    
        public void setNumero(int numero) {
            this.numero = numero;
        }
    
       
        public Data getData() {
            return data;
        }
    
        public void setData(Data data) {
            this.data = data;
        }
    
     
        public Duracao getDuracao() {
            return duracao;
        }
    
        public void setDuracao(Duracao duracao) {
            this.duracao = duracao;
        }
    }