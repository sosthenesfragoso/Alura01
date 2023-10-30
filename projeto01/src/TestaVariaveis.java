public class TestaVariaveis {
    public static void main(String[] args) throws Exception {
        

        int idade = 32;
        float salario = 7530.96f;
        double salariod = 7530.96;

        System.out.println("Idade = "+ idade + "\nSalario = " + salario);
        System.out.println("Idade = "+ idade + " e Salario = " + salariod);

        int divisao = (int) 3.14/2;
        System.out.println(divisao);

        long divisao2 = 3245464798987l;
        short divisao3 = 2131;
        byte b = 127;
        

        String frase = "Sosthenes";
        System.out.println(frase);
        frase = frase + " Fragoso";
        System.err.println(frase);

        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro;
        System.out.println(segundo+" "+frase);
    }    

}
