
public class TesteFabrica {
    public static void main(String[] args){
        
        Fabrica ficha = new Fabrica();
        ficha.chapa = 1010;
        ficha.funcionario = "Danrley Santos";
        ficha.cargo = "Analista de Sistemas" ;
        
        System.out.println(" Ficha dos Funcionarios de uma Fabrica \n");
        System.out.println("Chapa: " + ficha.chapa);
        System.out.println("nome: " + ficha.funcionario);
        System.out.println("Cargo:  " + ficha.cargo);
        
    }
    
}
