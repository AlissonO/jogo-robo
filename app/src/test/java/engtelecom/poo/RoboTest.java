package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoboTest {
    
    @Test
    public void posicionarRobo(){

        Mapa mapa = new Mapa(100,100 ,100 );
        Robo robo = new Robo(mapa, 5, 5, 1 ,2, 3);

        assertTrue(robo.poscionarRoboNoMapa(mapa));

        // Altura e largura são menores que a dimensão do Robo
        assertFalse(robo.poscionarRoboNoMapa(new Mapa(1, 1, 1)));

        // Somente largura é menor que a dimensão do Robo
        assertFalse(robo.poscionarRoboNoMapa(new Mapa(1, 30, 1)));

        // Somente largura é menor que a dimensão do Robo
        assertFalse(robo.poscionarRoboNoMapa(new Mapa(30, 1, 1)));
    }

    @Test
    public void adicionarTesouro(Tesouro t){
        Mapa mapa = new Mapa(100,100 ,100 );
        Robo robo = new Robo(mapa,5 , 5, 1 ,2, 3 );
        Tesouro tesouro = new Tesouro(20, 5, 5);
        
        // mochila com espaço suficiente
        robo.cavar();
        assertFalse(robo.cavar());

        // mochila com espaço suficiente adicionando mais de um tesouro
        robo.cavar();
        assertFalse(robo.cavar());

        // mochila com espaço insuficiente
        robo = new Robo(mapa, 5, 5, 1, 2, 1);
        robo.cavar();
        robo.cavar();
        assertFalse(robo.cavar());
        


    }

    @Test
    public void removerTesouro(){

    }

    @Test
    public void pontuacao(){
    }
    
    @Test
    public void movimentar(int direcao){
    }
}
