package engtelecom.poo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import edu.princeton.cs.algs4.Draw;

public class Robo extends Elemento{
    
    // Nao usado no momento
    public static final int LARGURA = 20;
    public static final int ALTURA = 20;

    private Mapa mapa;

    private int velicidadeY;
    private int velicidadeX;

    int pontuacao;

    private int capacidadeMochila;
    private ArrayList<Tesouro> mochila;

    // Construtor
    public Robo(int posicaoX, int posicaoY, Mapa mapa, int velicidadeY, int velicidadeX, int pontuacao,
            int capacidadeMochila, ArrayList<Tesouro> mochila) {
        super(posicaoX, posicaoY);
        this.mapa = mapa;  
        this.poscionarRoboNoMapa(this.mapa);

        this.velicidadeY = velicidadeY;
        this.velicidadeX = velicidadeX;
        this.pontuacao = 0;
        this.capacidadeMochila = capacidadeMochila;
        this.mochila = new ArrayList<>();
    }

    public boolean poscionarRoboNoMapa(Mapa mapa){
        // TODO implementar

        Random r = new Random();

        int x = r.nextInt(100); // 0 a 99
        
        return false;
    } 

    // Métodos

    @Override
    public void desenhar(Draw d){
        // d.setPenColor(Color.RED);
        // d.filledSquare(posicaoX, posicaoY, LARGURA);
        d.picture(posicaoX, posicaoY, "robotDim.png");

    }

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
