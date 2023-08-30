import java.util.Scanner;

 

public class Main {

    public static void main(String[] args) {

        String message = "Aqui será calculado o imc";

        System.out.println(message);

 

        Scanner input = new Scanner(System.in);

        int sexo, nome_sexo;

        double peso, altura, calcular_IMC;

        double[] h_imc = {20.7, 26.4};

        double[] m_imc = {19.1, 25.8};

        String h_resultado = "- Resultado para homens";

        String m_resultado = "- Resultado para mulheres";

 

        System.out.println("Defina seu sexo");

        System.out.println("Para masculino digite [1].");

        System.out.println("Para feminino digite [2].");

        sexo = input.nextInt(); // salva na variável sexo.

        nome_sexo = sexo;

 

        if (nome_sexo == 1) {

            System.out.println("- masculino!");

        }

 

        if (nome_sexo == 2) {

            System.out.println("- feminino!");

        }

 

        System.out.println("\n\nQual é o seu peso [Exemplo: 60.5]?");

        peso = input.nextDouble(); // salva na variável peso.

        System.out.printf("- O seu peso é: %6.1f kilogramas!", peso);

 

        System.out.println("\n\nQual é a sua altura [Exemplo: 1.70]?");

        altura = input.nextDouble(); // salva na variável altura.

        System.out.printf("- A sua altura é: %6.2f metros!", altura);

 

        calcular_IMC = peso / (altura * altura); // calcula o valor do IMC

 

        if (sexo == 1) {

            if (calcular_IMC < h_imc[0]) {

                System.out.println("\n\nResultado IMC (Masculino):");

                System.out.printf("- O seu IMC é: %6.1f. \n Você está abaixo do peso!", calcular_IMC);

                System.out.println(h_resultado);

            }

 

            if ((calcular_IMC > h_imc[0]) && (calcular_IMC < h_imc[1])) {

                System.out.println("\n\nResultado IMC (Masculino):");

                System.out.printf("- O seu IMC é: %6.1f.\n Você está no peso ideal!", calcular_IMC);

                System.out.println(h_resultado);

            }

 

            if (calcular_IMC > h_imc[1]) {

                System.out.println("\n\nResultado IMC (Masculino):");

                System.out.printf("- O seu IMC é: %6.1f.\n Você está acima do peso!", calcular_IMC);

                System.out.println(h_resultado);

            }

        }

 

        if (sexo == 2) {

            if (calcular_IMC < m_imc[0]) {

                System.out.println("\n\nResultado IMC (Feminino):");

                System.out.printf("- O seu IMC é: %6.1f.\n Você está abaixo do peso!", calcular_IMC);

                System.out.println(m_resultado);

            }

 

            if ((calcular_IMC > m_imc[0]) && (calcular_IMC < m_imc[1])) {

                System.out.println("\n\nResultado IMC (Feminino):");

                System.out.printf("- O seu IMC é: %6.1f.\n Você está no peso ideal!", calcular_IMC);

                System.out.println(m_resultado);

            }

 

            if (calcular_IMC > m_imc[1]) {

                System.out.println("\n\nResultado IMC (Feminino):");

                System.out.printf("- O seu IMC é: %6.1f.\n Você está acima do peso!", calcular_IMC);

                System.out.println(m_resultado);

            }

        }

    }

}
