package Carros;

public abstract class EstruturaBasica {
    String modelo;
    String cor;
    String tipo;
    String motor;

    public abstract void ligarCarro();
    public abstract void desligarCarro();
    public abstract void acelerarCarro();
    public abstract void frearCarro();
}
