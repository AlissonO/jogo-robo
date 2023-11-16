package engtelecom.poo;

import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;

public class Mapa {
    private int largura;
    private int altura;

    private int totalDeTesouros;
    private ArrayList<Elemento> elementos;

    public Mapa(int largura, int altura, int totalDeTesouros) {
        this.largura = largura;
        this.altura = altura;
        this.totalDeTesouros = totalDeTesouros;
        this.elementos = new ArrayList<>();
        this.posicionaTesouros();
    }

    public void posicionaTesouros(){
        // TODO implementar
        this.elementos.add(new Tesouro(100, 250, 100));
        this.elementos.add(new Tesouro(150, 100, 100)); 
        this.elementos.add(new Tesouro(540,300, 100));


        this.elementos.add(new Parede(480, 300));
        this.elementos.add(new Parede(210, 100));
        this.elementos.add(new Parede(160, 250));

    }

    public void desenhar(Draw desenho){
        elementos.forEach(e->e.desenhar(desenho));
    }

    public Tesouro coletarTesouro(int x, int y){
        // TODO implementar
        return null;
    }

    public boolean temTesouroAqui(int x, int y){
        // TODO implementar
        return false;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    

}
