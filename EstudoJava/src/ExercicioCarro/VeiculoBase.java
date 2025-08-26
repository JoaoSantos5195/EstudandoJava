package ExercicioCarro;

public abstract class VeiculoBase {
    String modelo;
    int ano;
    boolean ligado;

    public String status(int x){
        String resp;
        if (x == 1) {
            resp ="O carro está ligado";
        }else if (x == 0){
            resp ="O carro está desligado";
        }else{
            resp = "escolha inválida";
        }
        return resp;
    }
}
