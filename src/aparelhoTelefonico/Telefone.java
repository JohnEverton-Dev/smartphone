package aparelhoTelefonico;

public class Telefone extends ReprodutorMusical {

    public void ligar(){
        System.out.println("FAZENDO CHAMADA DE VOZ");
    }
    public void atender(){
       controlarPausa();
       System.out.println("ATENDENDO CHAMADA DE VOZ");
    }
    public void correioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
