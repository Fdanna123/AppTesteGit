public class App {
    public static float n1, n2, n3, mf;
    public static String status;

    public static void main(String[] args) throws Exception {
        n1 = 5.6f;
        n2 = 5.8f;
        n3 = 4.9f;

        // cálculo da média
        mf = (n1 + n2 + n3) / 3;

        // verificando situação
        if (mf >= 7) {
            System.out.println("Aluno aprovado ✅");
        } else if (mf >= 5) {
            System.out.println("Aluno em recuperação ⚠️");
        } else {
            System.out.println("Aluno reprovado ❌");
        }

        // mostrando a média também
        System.out.println("Média final: " + mf);
    }
}
