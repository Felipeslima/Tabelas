package tabela;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Elemento> roll = new ArrayList<Elemento>();
        
        double aux;
        
        System.out.println("Digite os elementos da tabela."
                + "\nSinalize o termino com o valor 0.");
        aux = scan.nextDouble();
        System.out.println(" ");
        
        while(aux != 0){
        roll.add(new Elemento(aux));
        System.out.println("Digite os elementos da tabela."
                + "\nSinalize o termino com o valor 0.");
        aux = scan.nextDouble();
        System.out.println(" ");
        }
        
        
        System.out.println("Roll: ");
        for (Elemento elemento : roll) {
            System.out.println(elemento.getValor());
        }
    }
    
}
