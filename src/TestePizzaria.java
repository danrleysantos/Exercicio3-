
public class TestePizzaria {
    public static void main(String[] args){
        
        Pizzaria cliente1 = new Pizzaria();
        cliente1.cardapio = " 1 - Calabresa \n 2 - Frango c/ catupyry \n 3 - PORTUGUESA \n";
        cliente1.preço = " Pequena=20 \n Media=30 \n Grande=40 \n";
        cliente1.pedido = " Calabresa/Portuguesa - G";
        cliente1.total = 40;
        
        System.out.println("Cardapio \n" + cliente1.cardapio);
        System.out.println("Preços \n" + cliente1.preço);
        System.out.println("Pedido:  " + cliente1.pedido);
        System.out.println("Toal:" + cliente1.total);
    }
        
}
