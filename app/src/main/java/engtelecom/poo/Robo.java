package engtelecom.poo;

import java.util.ArrayList;
import java.util.Random;

public class Robo extends Elemento{
    
    public static final int LARGURA = 20;
    public static final int ALTURA = 20;

    private Mapa mapa;

    private int velicidadeY;
    private int velicidadeX;

    int pontuacao;

    private int posicaoX;
    private int posicaoY;

    private int capacidadeMochila;
    private ArrayList<Tesouro> mochila;

    // Construtor
    
    public Robo(Mapa mapa, int posicaoX, int posicaoY, int velicidadeY, int velicidadeX, int capacidadeMochila) {
        this.mapa = mapa;
        this.velicidadeY = velicidadeY;
        this.velicidadeX = velicidadeX;
        // TODO garantir que a posicao x e y estao dentro dos limites do mapa
        // se nao estiver posicinao o robo no centro do mapa
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        
        this.poscionarRoboNoMapa(this.mapa);

        this.capacidadeMochila = capacidadeMochila;
        this.pontuacao = 0;
        this.mochila = new ArrayList<>();
    }

    public boolean poscionarRoboNoMapa(Mapa mapa){
        // TODO implementar

        Random r = new Random();

        int x = r.nextInt(100); // 0 a 99
        
        return false;
    } 

    // Métodos

    public boolean cavar(){
        if(!mochilaCheia()){
            Tesouro t = mapa.coletarTesouro(posicaoX, posicaoY);
            if (t != null) {
                this.mochila.add(t);
                return true;
            }
        }
        return false;
    }
    public boolean temTesouroAqui(int x, int y){
        return false;
    }
    
    // public boolean adicionarTesouro(Tesouro t){
    //     if(this.mochila.size() < this.capacidadeMochila){
    //         this.mochila.add(t);
    //         return true;
    //     }
    //     // TODO implementar
    //     return false;
    // }

    public Tesouro removerTesouro(){
        // TODO implementar
        return null;
    }

    public int pontuacao(){
        // TODO implementar
        return -1;
    }

    public boolean mochilaCheia(){
        return this.mochila.size() == this.capacidadeMochila;
    }

    public boolean movimentar(int direcao){
        // TODO implementar
        return false;
    }

} // Final classe ROBO
