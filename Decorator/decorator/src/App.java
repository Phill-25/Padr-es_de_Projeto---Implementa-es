
public class App {
    public static void main(String[] args) throws Exception {
        
        ImpressoraMono impressoraMono = new ImpressoraMono();
        DecoratorImpressoraCopiadoraMono impressoraCopiadoraMono = new DecoratorImpressoraCopiadoraMono(impressoraMono);

        System.out.println(impressoraMono.getTipo() + " R$" + impressoraMono.getPreco());
        System.out.println(impressoraCopiadoraMono.getTipo() + " R$" + impressoraCopiadoraMono.getPreco());

        System.out.println("\n \n");

        ImpressoraColor impressoraColor = new ImpressoraColor();
        DecoratorImpressoraCopiadoraColor impressoraCopiadoraColor = new DecoratorImpressoraCopiadoraColor(impressoraColor);

        System.out.println(impressoraColor.getTipo() + " R$" + impressoraColor.getPreco());
        System.out.println(impressoraCopiadoraColor.getTipo() + " R$" + impressoraCopiadoraColor.getPreco());

    }
}
