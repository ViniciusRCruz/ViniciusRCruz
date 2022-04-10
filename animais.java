import java.util.Scanner;
public class Main{ 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String resposta1 = leitor.nextLine();
        String resposta2 = leitor.nextLine();
        String resposta3 = leitor.nextLine();
        if(resposta1.equals("vertebrado")){

            if(resposta2.equals("ave") && resposta3.equals("carnivoro")){
                System.out.println("aguia");

            } else  if(resposta2.equals("ave") && resposta3.equals("onivoro")){
                System.out.println("pomba");

            } else if(resposta2.equals("mamifero") && resposta3.equals("onivoro")){
                System.out.println("homem");

            } else  if(resposta2.equals("mamifero") && resposta3.equals("herbivoro")){
                System.out.println("vaca");
            }


        } else if(resposta1.equals("invertebrado")){
            
            if(resposta2.equals("inseto") && resposta3.equals("hematofago")){
                System.out.println("pulga");

            } else  if(resposta2.equals("inseto") && resposta3.equals("herbivoro")){
                System.out.println("lagarta");

            } else if(resposta2.equals("anelideo") && resposta3.equals("hematofago")){
                System.out.println("sanguessuga");

            } else  if(resposta2.equals("anelideo") && resposta3.equals("onivoro")){
                System.out.println("minhoca");
            }
        }
        leitor.close();
    }
}
