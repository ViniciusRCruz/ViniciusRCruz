- 👋 Hi, I’m @ViniciusRCruz
- 👀 I’m interested in ...
- 🌱 I’m currently learning ...
- 💞️ I’m looking to collaborate on ...
- 📫 How to reach me ...

import java.util.Scanner;
public class Main{ 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float salario = leitor.nextFloat();
        if(salario >=0 && salario <= 400){
            float NovoSalario = ((salario*15)/100) + salario;
            System.out.println(String.format("Novo salario: %.2f", NovoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", NovoSalario-salario));
            System.out.println("Em percentual: 15 %");
        } else if(salario >= 400.01 && salario <= 800){
            float NovoSalario = ((salario*12)/100) + salario;
            System.out.println(String.format("Novo salario: %.2f", NovoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", NovoSalario-salario));
            System.out.println("Em percentual: 12 %");
        } else if(salario >=800.01 && salario <= 1200){
            float NovoSalario = ((salario*10)/100) + salario;
            System.out.println(String.format("Novo salario: %.2f", NovoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", NovoSalario-salario));
            System.out.println("Em percentual: 10 %");
        } else if(salario >=1200.01 && salario <= 2000){
            float NovoSalario = ((salario*7)/100) + salario;
            System.out.println(String.format("Novo salario: %.2f", NovoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", NovoSalario-salario));
            System.out.println("Em percentual: 7 %");
        } else if(salario >=2000.01){
            float NovoSalario = ((salario*4)/100) + salario;
            System.out.println(String.format("Novo salario: %.2f", NovoSalario));
            System.out.println(String.format("Reajuste ganho: %.2f", NovoSalario-salario));
            System.out.println("Em percentual: 4 %");
        }
        leitor.close();
    }
}
