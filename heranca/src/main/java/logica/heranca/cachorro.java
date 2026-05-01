package logica.heranca;

/**
 *
 * @author Pedro
 */
public class cachorro extends animal{

    // atributos
    private String raca;
    
    public cachorro(String raca, String nome, int Idade) {
        super(nome, Idade);
        this.raca = raca;
    }
    @Override
        public void fazerBarulho(){
        System.out.println("O cachorro "+ getNome() +" esta latindo");
    }
        
        public String getraca(){
            return raca;
        } 
}
