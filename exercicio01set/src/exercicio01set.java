import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class exercicio01set {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new TreeSet<>();
        
        //Set<String> coresArcoIris = new HashSet<>();

        coresArcoIris.add("vermelho");
        coresArcoIris.add("amarelho");
        coresArcoIris.add("azul");
        coresArcoIris.add("roxo");
        coresArcoIris.add("verde");
        coresArcoIris.add("bordo");
        coresArcoIris.add("lilas");


        System.out.println("todas as cores: "+ coresArcoIris);

        //b) A quantidade de cores que o arco-íris tem;
        int quantidade = coresArcoIris.size();
        System.out.println("o Arco Íris tem: " + quantidade + " cores");

        //c) Exiba as cores em ordem alfabética;
        System.out.println("Ordem alfabetica");
        for (String elemento : coresArcoIris) {
            System.out.println(elemento);
        }

        //d) Exiba as cores na ordem inversa da que foi informada;
        Set<String> coresArcoIrisReverse = new TreeSet<>(Comparator.reverseOrder());
        coresArcoIrisReverse.addAll(coresArcoIris);
        System.out.println("Elementos em ordem alfabética inversa:");
        for (String elemento : coresArcoIrisReverse) {
            System.out.println(elemento);
        }
    
        //e) Exiba todas as cores que começam com a letra ”v”;
        System.out.println("Cores que começam com a letra 'V' : ");
        for (String cor : coresArcoIris){
            if (cor.toLowerCase().startsWith("v")) {
                System.out.println(cor);
            }
        }

        //f) Remova todas as cores que não começam com a letra “v”;
        System.out.println("Remova cores que se inicia com letra 'v'");
        coresArcoIris.removeIf(cor -> cor.toLowerCase().startsWith("v"));
        for (String cor: coresArcoIris) {
                System.out.println(cor);
        }
       
        //g) Limpe o conjunto;
        System.out.println("limpar todo o conjunto");

        System.out.println("Antes de limpar o conjunto" + coresArcoIris);
        coresArcoIris.clear();

        System.out.println("depois de limpar: " + coresArcoIris);
    
        //h) Confira se o conjunto está vazio;
        System.out.println("O conjunto está vazio? " + coresArcoIris.isEmpty());

    }
}