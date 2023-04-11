package TrabalhoIndependente2;

/**
 *
 * @author gabriel.machado4
 */
public class Onibus {
    int id;
    String rota;
    String origem;
    String destino;
    int horaPartida;
    int minutoPartida;
    int distancia;
    int tempoViagem;

    public Onibus() {
        id = 0;
        rota = "";
        origem = "";
        destino = "";
        horaPartida = 0;
        minutoPartida = 0;
        distancia = 0;
        tempoViagem = 0;
    }

    public Onibus(int id, String origem, String destino, int distancia) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Onibus(int id, String rota, String origem, String destino, int horaPartida, int minutoPartida, int distancia) {
        this.id = id;
        this.rota = rota;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.minutoPartida = minutoPartida;
        this.distancia = distancia;
    }

    public void setTempoViagem(int tempoViagem) {
        this.tempoViagem = tempoViagem;
    }
    
    
    public double calcularConsumo(){
        double consumoCombustivel = this.distancia / 9.0;
        
        return consumoCombustivel;
    }
    
    public int calcularTempoViagem(){
        
        double tempo = (this.distancia / 80.0) * 60;
        
        this.setTempoViagem((int)tempo);
        
        return (int)tempo;
    }
    
    public static void main(String[] args) {
        
        Onibus bus1 = new Onibus(1, "Lajeado","Canoas", 103);
        Onibus bus2 = new Onibus( 2, "EST-TOR", "Estrela", "Torres", 10, 30, 287);
        
        System.out.println("Consumo de combústivel do bus1 entre "+ bus1.origem +" e "+ bus1.destino +": "+bus1.calcularConsumo()+" litros.");
        System.out.println("Consumo de combústivel do bus2 entre "+ bus2.origem +" e "+ bus2.destino +": "+bus2.calcularConsumo()+" litros.");
        
        System.out.println("Tempo de viagem do bus1: "+bus1.calcularTempoViagem() + " Minutos");
        System.out.println("Tempo de viagem do bus2: "+bus2.calcularTempoViagem() + " Minutos");
        System.out.println(bus1.tempoViagem);
        
        System.exit(0);
    }
    
    
    
}
