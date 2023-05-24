
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author gabriel.machado4
 */
public class CidadesRS {
   String nome;
   int pop2010;
   int pop2022;
   int difPop;

    public CidadesRS(String nome, int pop2010, int pop2022) {
        this.nome = nome;
        this.pop2010 = pop2010;
        this.pop2022 = pop2022;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPop2010() {
        return pop2010;
    }

    public void setPop2010(int pop2010) {
        this.pop2010 = pop2010;
    }

    public int getPop2022() {
        return pop2022;
    }

    public void setPop2022(int pop2022) {
        this.pop2022 = pop2022;
    }

    public int getDifPop() {
        return difPop;
    }

    public void setDifPop(int difPop) {
        this.difPop = difPop;
    }

    @Override
    public String toString() {
        return "\nCidadesRS{" + "nome=" + nome + ", pop2010=" + pop2010 + ", pop2022=" + pop2022 + ", difPop=" + difPop + '}';
    }
        
    
       public static void inicializar(ArrayList<CidadesRS> array) {
        array.add(new CidadesRS("Porto Alegre", 1450555, 1404269));
        array.add(new CidadesRS("Caxias do Sul", 437889, 503068));
        array.add(new CidadesRS("Canoas", 323827, 339133));
        array.add(new CidadesRS("Pelotas", 328275, 324026));
        array.add(new CidadesRS("Santa Maria", 268450, 295081));
        array.add(new CidadesRS("Gravataí", 255660, 279205));
        array.add(new CidadesRS("Novo Hamburgo", 239051, 241306));
        array.add(new CidadesRS("Viamão", 239384, 223679));
        array.add(new CidadesRS("Passo Fundo", 184826, 217240));
        array.add(new CidadesRS("São Leopoldo", 214210, 216964));
        array.add(new CidadesRS("Rio Grande", 197253, 191719));
        array.add(new CidadesRS("Alvorada", 195718, 185921));
        array.add(new CidadesRS("Cachoeirinha", 118278, 134545));
        array.add(new CidadesRS("Santa Cruz do Sul", 118287, 133136));
        array.add(new CidadesRS("Sapucaia do Sul", 130957, 130554));
        array.add(new CidadesRS("Bento Gonçalves", 107341, 129430));
        array.add(new CidadesRS("Uruguaiana", 125507, 115100));
        array.add(new CidadesRS("Bagé", 116792, 113173));
        array.add(new CidadesRS("Erechim", 96087, 105428));
        array.add(new CidadesRS("Lajeado", 71481, 97432));
        array.add(new CidadesRS("Guaíba", 94230, 91304));
        array.add(new CidadesRS("Ijuí", 78920, 85135));
        array.add(new CidadesRS("Santana do Livramento", 82513, 83764));
        array.add(new CidadesRS("Cachoeira do Sul", 83827, 79778));
        array.add(new CidadesRS("Santa Rosa", 68587, 77519));
        array.add(new CidadesRS("Santo Ângelo", 76304, 76768));
        array.add(new CidadesRS("Sapiranga", 75020, 75613));
        array.add(new CidadesRS("Farroupilha", 63635, 74879));
        array.add(new CidadesRS("Esteio", 80669, 74653));
        array.add(new CidadesRS("Alegrete", 77673, 71945));
        array.add(new CidadesRS("Venâncio Aires", 65964, 68420));
        array.add(new CidadesRS("Montenegro", 59436, 66878));
        array.add(new CidadesRS("Campo Bom", 60081, 65380));
        array.add(new CidadesRS("Vacaria", 61345, 64033));
        array.add(new CidadesRS("Capão da Canoa", 42047, 62040));
        array.add(new CidadesRS("Camaquã", 62759, 61598));
        array.add(new CidadesRS("Carazinho", 59301, 60983));
        array.add(new CidadesRS("Cruz Alta", 62615, 59057));
        array.add(new CidadesRS("São Borja", 61671, 58757));
        array.add(new CidadesRS("São Gabriel", 60508, 58263));
        array.add(new CidadesRS("Parobé", 51481, 54095));
        array.add(new CidadesRS("Canela", 39238, 53348));
        array.add(new CidadesRS("Taquara", 54656, 53164));
        array.add(new CidadesRS("Tramandaí", 41655, 51872));
        array.add(new CidadesRS("Osório", 40941, 50395));
        array.add(new CidadesRS("Osasco", 700264, 701428));
        array.add(new CidadesRS("Sorocaba", 694234, 695328));
        array.add(new CidadesRS("Santos", 432864, 433991));
        array.add(new CidadesRS("Santiago", 49082, 48959));
        array.add(new CidadesRS("Canguçu", 53268, 48922));
        array.add(new CidadesRS("Estância Velha", 42589, 48682));
        array.add(new CidadesRS("Marau", 36383, 46643));
        array.add(new CidadesRS("Gramado", 32300, 44643));
        array.add(new CidadesRS("Panambi", 38068, 43320));
        array.add(new CidadesRS("Santo Antônio da Patrulha", 39679, 42904));
        array.add(new CidadesRS("São Lourenço do Sul", 43114, 41756));
        array.add(new CidadesRS("Torres", 34646, 41709));
        array.add(new CidadesRS("Eldorado do Sul", 34335, 39330));
        array.add(new CidadesRS("Dom Pedrito", 38916, 36559));
        array.add(new CidadesRS("Portão", 30881, 36410));
        array.add(new CidadesRS("Rosário do Sul", 39751, 36343));
        array.add(new CidadesRS("Itaqui", 38166, 35408));
        array.add(new CidadesRS("Garibaldi", 30692, 35219));
        array.add(new CidadesRS("Charqueadas", 35363, 34954));
        array.add(new CidadesRS("São Luiz Gonzaga", 34558, 34690));
        array.add(new CidadesRS("Rio Pardo", 37602, 34447));
        array.add(new CidadesRS("Flores da Cunha", 27135, 33430));
        array.add(new CidadesRS("Igrejinha", 31663, 33173));
        array.add(new CidadesRS("Palmeira das Missões", 34328, 32873));
        array.add(new CidadesRS("Triunfo", 25811, 32859));
        array.add(new CidadesRS("Teutônia", 27265, 32776));
        array.add(new CidadesRS("Caçapava do Sul", 33700, 32447));
        array.add(new CidadesRS("Frederico Westphalen", 28848, 32284));
        array.add(new CidadesRS("Estrela", 30628, 31909));
        array.add(new CidadesRS("Santa Vitória do Palmar", 31002, 30953));
        array.add(new CidadesRS("Dois Irmãos", 27572, 30551));
        array.add(new CidadesRS("Soledade", 30065, 30060));
        array.add(new CidadesRS("Carlos Barbosa", 25193, 29834));
        array.add(new CidadesRS("Nova Petrópolis", 19058, 28579));
        array.add(new CidadesRS("Nova Santa Rita", 22706, 28290));
        array.add(new CidadesRS("Candelária", 30176, 28249));
        array.add(new CidadesRS("Lagoa Vermelha", 27529, 27598));
        array.add(new CidadesRS("Capão do Leão", 24294, 27071));
        array.add(new CidadesRS("Imbé", 17667, 27053));
        array.add(new CidadesRS("Vera Cruz", 23986, 26702));
        array.add(new CidadesRS("Jaguarão", 27942, 26583));
        array.add(new CidadesRS("São Sebastião do Caí", 21944, 26300));
        array.add(new CidadesRS("Nova Prata", 22830, 25656));
        array.add(new CidadesRS("São José do Norte", 25523, 25491));
        array.add(new CidadesRS("Três Passos", 23973, 25467));
        array.add(new CidadesRS("Três Coroas", 23855, 25344));
        array.add(new CidadesRS("Três de Maio", 23726, 25006));
        array.add(new CidadesRS("Taquari", 26138, 25004));
        array.add(new CidadesRS("Guaporé", 22810, 24958));
        array.add(new CidadesRS("Tapejara", 19252, 24539));
        array.add(new CidadesRS("Veranópolis", 22815, 23878));
        array.add(new CidadesRS("São Francisco de Paula", 20570, 23682));
        array.add(new CidadesRS("Quaraí", 23021, 23475));
        array.add(new CidadesRS("Ivoti", 19877, 22911));
        array.add(new CidadesRS("Sarandi", 22623, 22693));
        array.add(new CidadesRS("Encantado", 20514, 22391));
        array.add(new CidadesRS("Encruzilhada do Sul", 24537, 22276));
        array.add(new CidadesRS("Arroio do Meio", 18783, 21961));
        array.add(new CidadesRS("Restinga Seca", 15850, 21961));
        array.add(new CidadesRS("Espumoso", 15240, 15594));
        array.add(new CidadesRS("Dom Feliciano", 14380, 15556));
        array.add(new CidadesRS("Sobradinho", 14285, 15041));
        array.add(new CidadesRS("Balneário Pinhal ", 10855, 14645));
        array.add(new CidadesRS("Bom Princípio", 11792, 14446));
        array.add(new CidadesRS("Cerro Largo", 13289, 14243));
        array.add(new CidadesRS("Arroio dos Ratos", 13608, 14201));
        array.add(new CidadesRS("Santo Cristo", 14378, 14177));
        array.add(new CidadesRS("Santo Augusto", 13970, 13813));
        
    }
       
       public static void calcularDiferenca(ArrayList<CidadesRS> city){
           
           for(CidadesRS c: city){
                int dif = c.pop2010 - c.pop2022;
                if(dif < 0){
                    dif = dif* -1;
                }
                c.difPop = dif;
           }
           
       }

        
    public static void main(String[] args) {
        ArrayList<CidadesRS> city = new ArrayList<CidadesRS>();
        inicializar(city);
        System.out.println(city);
        System.out.println("\n\n\n\n");
        
        
        city.sort(Comparator.comparing(CidadesRS::getNome));
        System.out.println("Nome - Ordem Alfabética: ");
        System.out.println(city);
        
        System.out.println("\n\n\n");
        
        city.sort(Comparator.comparing(CidadesRS::getPop2010));
        System.out.println("\nPopulação 2010 - Ordem crescente: ");
        System.out.println(city);
        
        System.out.println("\n\n\n");
        
        city.sort(Comparator.comparing(CidadesRS::getPop2022));
        System.out.println("\nPopulação 2022 - Ordem crescente: ");
        System.out.println(city);
        
        System.out.println("\n\n\n");
        
        int pos = 0;
        for(CidadesRS aux: city){
            if(aux.getNome().equals("Osasco")){
                System.out.println("\nOsasco está na posição " + pos);
                break;
            }
            pos++;
        }
        city.remove(pos);
        System.out.println("Osasco removido");
        
        pos = 0;
        for(CidadesRS aux: city){
            if(aux.getNome().equals("Sorocaba")){
                System.out.println("\nSorocaba está na posição " + pos);
                break;
            }
            pos++;
        }
        city.remove(pos);
        System.out.println("Sorocaba removido");
        
        pos = 0;
        for(CidadesRS aux: city){
            if(aux.getNome().equals("Santos")){
                System.out.println("\nSantos está na posição " + pos);
                break;
            }
            pos++;
        }
        city.remove(pos);
        System.out.println("Santos removido");
        
        calcularDiferenca(city);
        
        System.out.println("\n\n\n");
        
        city.sort(Comparator.comparing(CidadesRS::getDifPop));
        
        System.out.println("Cidades ordenadas por diferença de população em ordem crescente:\n" + city);
        
        System.out.println("\n\n");
        
        city.sort(Comparator.comparing(CidadesRS::getDifPop, Collections.reverseOrder()));
        
        System.out.println("Cidades ordenadas por diferença de população em ordem decrescente:\n" + city);
        
        System.exit(0);
    }
}
