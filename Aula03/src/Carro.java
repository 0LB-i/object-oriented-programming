
/**
 *
 * @author gabriel.machado4
 */
public class Carro {
 	public String marca;
 	public String cor;
 	public String placa;
 	public Integer velocidadeAtual;
	public char marchaAtual;
 	public Boolean freioDeMaoPuxado;
 	public Boolean chaveVirada;
        boolean buzina;
        
        void buzinar(){
            this.buzina = true;
            System.out.println(this.placa + " buzinando: Honk! Honk!");
            this.buzina = false;
        }
        
 	
	public Carro(String marca, String cor, String placa) {
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.velocidadeAtual = 0;
		this.marchaAtual = '0';
		this.freioDeMaoPuxado = true;
		this.chaveVirada = false;
	}
	
	public void ligar() {
		chaveVirada = true;
		freioDeMaoPuxado = false;
		marchaAtual = '1';
	}
	
	public void acelerarAte(Integer velocidade) {
		if (!chaveVirada) return;
		if (freioDeMaoPuxado) return;
		if (marchaAtual == '0') return;
		velocidadeAtual = velocidade;
	}
	
	public void mudarMarcha(char marcha) {
		marchaAtual = marcha;
	}
	
	public void parar() {
		acelerarAte(0);
		freioDeMaoPuxado = true;
		chaveVirada = false;
		marchaAtual = '1';
	}
	
	public String toString() {
		String out = "";
		out += "Marca(" + marca + ") ";
		out += "Cor(" + cor + ") ";
		out += "Placa(" + placa + ") ";
		out += "Chave(" + chaveVirada + ") ";
		out += "Freio(" + freioDeMaoPuxado + ") ";
		out += "Marcha(" + marchaAtual + ") ";
		out += "Veloc(" + velocidadeAtual + ")";
		return out;
	}
	
	public static void main(String[] args) {
		Carro gol = new Carro("Wolkswagen", "branca", "XYZ9803");
		Carro uno = new Carro("Fiat", "vermelha", "ABC4445");
		
		System.out.println(gol);
		System.out.println(uno);
		
		gol.ligar();
		gol.acelerarAte(20);
		gol.mudarMarcha('2');
		System.out.println(gol);
		System.out.println(uno);
		
		uno.ligar();
		gol.acelerarAte(50);
		gol.mudarMarcha('3');
		uno.acelerarAte(10);
		uno.mudarMarcha('2');		
		System.out.println(gol);
		System.out.println(uno);
                
                gol.buzinar();
                uno.buzinar();
	}
}