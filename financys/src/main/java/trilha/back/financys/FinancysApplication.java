package trilha.back.financys;

// @SpringBootAplicattion
public class FinancysApplication {

    public static void main(String[] args) {

        Categoria c1 = new Categoria(4, "Salário", "Recebimento de Salário");
        Categoria c2 = new Categoria();
        c2.setId(1);
        c2.setName("Alimentação");
        c2.setDescription("Gastos com Alimentação");
        System.out.println(c1.toString());
        System.out.println();
        System.out.println(c2.toString());

        Lancamento l1 = new Lancamento(3, 4, "Salário na Empresa X", "Adiantamento quinzenal",
                "revenue", "4405,49", "15/09/2021", true);
         Lancamento l2 = new Lancamento();
        l2.setId(2);
        l2.setName("Compra em sorveteria");
        l2.setDescription("Casquinha de baunilha");
        l2.setType("spending");
        l2.setAmount("5,30");
        l2.setDate("21/10/2021");
        l2.setPaid(false);
        l2.setCategoryId(1);
        System.out.println();
        System.out.println(l1.toString());
        System.out.println();
        System.out.println(l2.toString());

        Produto p1 = new Produto(4, "Hora Extra", "% de Vendas", 450.00);
        Produto p2 = new Produto();
        p2.setId(3);
        p2.setName("Compra em padaria");
        p2.setDescription("Pão Italiano");
        p2.setPrice(5.50);
        System.out.println();
        System.out.println(p1.toString());
        System.out.println();
        System.out.println(p2.toString());
    }
}
