package aparelhoTelefonico;

public class ReprodutorMusical {

    public void tocar(){
        System.out.println("TOCANDO MUSICA");
    }
    public void controlarPausa(){
        pausar();
    }
    private void pausar(){ System.out.println("MUSICA EM PAUSA");}
    public void selecionar(){
        System.out.println("SELECIONANDO MUSICA");
    }
}
