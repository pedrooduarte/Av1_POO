package Questão_1;
// Classe Pagamento
public class Pagamento {
    private String dataHoraPagamento;
    private int numeroPagamento;
    private double valorPago;

    public Pagamento() {
    }

    public Pagamento(String dataHoraPagamento, int numeroPagamento, double valorPago) {
        this.dataHoraPagamento = dataHoraPagamento;
        this.numeroPagamento = numeroPagamento;
        this.valorPago = valorPago;
    }

    public abstract String imprimirCupomFiscal();
}

// Classe CartaoCredito
public class CartaoCredito extends Pagamento {
    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String bandeiraCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        // Implemente a lógica para imprimir o cupom fiscal do cartão de crédito
        return "Cupom fiscal do Cartão de Crédito: " + numCartao + ", " + titularCartao;
    }
}

// Classe Pix
public class Pix extends Pagamento {
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    @Override
    public String imprimirCupomFiscal() {
        // Implemente a lógica para imprimir o cupom fiscal do Pix
        return "Cupom fiscal do Pix: " + comprovanteTransacaoPix;
    }
}

// Classe CartaoDebito
public class CartaoDebito extends Pagamento {
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        // Implemente a lógica para imprimir o cupom fiscal do cartão de débito
        return "Cupom fiscal do Cartão de Débito: " + numCartao + ", " + titularCartao;
    }
}

// Classe principal (main)
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes
        CartaoCredito cartaoCredito = new CartaoCredito("2023-10-05 14:30:00", 12345, 100.0, "1234-5678-9012-3456", "Visa", "João Silva");
        Pix pix = new Pix("2023-10-05 15:00:00", 54321, 50.0, true);
        CartaoDebito cartaoDebito = new CartaoDebito("2023-10-05 16:45:00", 98765, 75.0, "9876-5432-1098-7654", "Maria Souza");

        // Imprimindo os cupons fiscais
        System.out.println(cartaoCredito.imprimirCupomFiscal());
        System.out.println(pix.imprimirCupomFiscal());
        System.out.println(cartaoDebito.imprimirCupomFiscal());
    }
}

