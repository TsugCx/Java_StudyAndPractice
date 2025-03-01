package Javacore.E_BlocosdeInicializacao.Domain;

public class Anime {
    private String nome;
    private int[] episodios;

    //1-Alocado espaço na memoria;
    //2-Cada Atributo de classe e criado e inicializado com valores defalt ou o quer for passado;
    //3-Bloco de inicialização e executado;
    //4-Construtor e executado;

    {
        System.out.println("Dentro do bloco de Inicializacao");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {

        for(int episodios: this.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
