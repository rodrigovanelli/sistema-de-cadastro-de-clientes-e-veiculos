package modelo;

public class Veiculo {
    // Atributos
    public String placa;
    public String modelo;
    public String ano;
    public String fabricante;
    public String cor;

    // Construtor
    public Veiculo(String placa, String modelo, String ano, String fabricante, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
        this.cor = cor;
    }

    // Getters e Setters
    public String getPlaca(String placa) {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo(String modelo) {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno(String ano) {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getFabricante(String fabricante) {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor(String cor) {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo: " + modelo + " " + cor + "\n" +
                "Ano: " + ano + "\n" +
                "Placa: " + placa + "\n" +
                "Fabricante: " + fabricante;
    }
}
