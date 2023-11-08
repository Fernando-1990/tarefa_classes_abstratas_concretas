public class Main {
    public static void main(String[] args) {
        PesspaFisica pf = new PesspaFisica();
        pf.setNome("Fernando");
        pf.setCpf(99999999999L);

        System.out.println("nome "+ pf.getNome());
        System.out.println("cpf "+ pf.getCpf());

        PesspaFisica pj = new PesspaFisica();
        pj.setNome("Felipe");
        pj.setCpf(99999999000199L);

        System.out.println("nome "+ pj.getNome());
        System.out.println("cpf "+ pj.getCpf());




    }
}
