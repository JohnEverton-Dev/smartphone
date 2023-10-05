package aparelhoTelefonico;

public class Smartphone {
    public static void main(String[] args) {

        Telefone telefone = new Telefone();
        telefone.ligar();
        telefone.atender();
        telefone.correioVoz();

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.tocar();
        reprodutorMusical.controlarPausa();
        reprodutorMusical.selecionar();

        Navegador navegador = new Navegador();
        navegador.exibir();
        navegador.adicionar();
        navegador.atualizar();

    }
}