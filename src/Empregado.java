public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void promover() {
        if (this.idade > 18) {
            aumentarSalario(25);
            System.out.println("O empregado " + this.nome + " foi promovido!");
        } else {
            System.out.println("O empregado não tem idade necessária");
        }
    }

    public void aumentarSalario(double percent) {
        this.salario = (percent * this.salario / 100) + this.salario;
        System.out.println("Salário aumentado! Novo salário: " + this.salario);
    }

    // 1 justa causa, 2 decisão, 3 aposentadoria
    public void demitir(int motivo) {
        switch (motivo) {
            case 2:
                double multa = 40 * this.salario / 100;
                System.out.println("O empregado deverá pagar " + multa + " de multa");
                break;
            case 3:
                if (this.salario > 1000 && this.salario < 2000) {
                    this.salario = 1500;
                } else if (this.salario > 2001 && this.salario < 3000) {
                    this.salario = 2500;
                } else if (this.salario > 3001 && this.salario < 4000) {
                    this.salario = 3500;
                } else {
                    this.salario = 4000;
                }
                System.out.println("Salário novo da aposentadoria: " + this.salario);
                break;
            default:
                System.out.println("O empregado deverá cumprir aviso prévio");
                break;
        }
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Felicidades! Idade atual do empregado: " + this.idade);
    }
}
