package personagens;

import classes.Mago;
import raca.Maia;
import mapa.*;

public class Gandalf extends Personagem implements Maia, Mago {

    private String fala;
    private String grupoPersonagem;

    public Gandalf() {
        this.fala = "A Wizard is never late, nor is he early. He arrives precisely when he means to.";
        this.grupoPersonagem = "Faz parte da sociedade do anel.";
        this.forca = 2;
        this.inteligencia = 10;
        this.agilidade = 3;
        this.constituicao = 80;
    }

    @Override
    public String falar() {
        return this.fala;
    }

    @Override
    public String toString() {
        return "G";
    }

    @Override
    public Object ressucitar() {
        if (this.getConstituicao().equals(0)) {
            return new Gandalf();
        }
        return null;
    }

    @Override
    public String grupo() {
        return this.grupoPersonagem;
    }

    @Override
    public void atacar(Mapa mapa) {
        atacarMagoSociedade(mapa);
    }

    @Override
    public void movimentar(Mapa mapa) {
        movimentarMagoSociedade(mapa);
    }
}