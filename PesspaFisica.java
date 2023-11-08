import java.math.BigInteger;

public class PesspaFisica extends Pessoa {

    private Long cpf;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PesspaFisica{" +
                "cpf=" + cpf +
                '}';
    }
}
