  public static void main(String[] args) {
        // 1. Criando uma nova conta bancária (Instanciando o objeto)
        ContaBancaria conta = new ContaBancaria();

        // 2. Definindo os valores através dos métodos SET (Escrita)
        conta.setTitular("Ana Silva");
        conta.setSaldo(1500.00);

        // 3. Exibindo os valores na tela através dos métodos GET (Leitura)
        System.out.println("--- Dados Iniciais da Conta ---");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo Atual: R$ " + conta.getSaldo());

        // 4. Tentando injetar um valor inválido (O método SET vai bloquear)
        System.out.println("\n--- Tentando realizar depósito negativo ---");
        conta.setSaldo(-500.00); 

        // 5. O saldo permanece intacto devido à proteção do encapsulamento
        System.out.println("Saldo após tentativa inválida: R$ " + conta.getSaldo());
    }
}

// Classe de suporte que encapsula os dados
class ContaBancaria {
    private String titular;
    private double saldo;

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("[Erro]: Não é permitido saldo ou depósito negativo!");
        }
    }
}