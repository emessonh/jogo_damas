package entidades;

public class Peca {
    
    private short[] posicao;
    private String cor;

    public Peca(short x, short y, String cor) {
        this.posicao = new short[] {x, y};
        this.cor = cor;
    }
}
