import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> listaDeRespostas = new ArrayList<>();
        String resposta;
        int validacao = 0;

        System.out.println(" Responda as pergunta somente com SIM ou NAO");
        // Pergunta 1
        do {
            System.out.println("Telefonou para Vitima ?");
            resposta = leia.next().toLowerCase();
            if(resposta.equals("sim") || resposta.equals("nao")) {
                listaDeRespostas.add(resposta);
                validacao = 1;
            } else System.out.println("Resposta Invalida, favor responda as pergunta somente com SIM ou NAO");
        } while (validacao == 0);

        System.out.println("------------------------------------------------");
        // Pergunta 2
        validacao = 0;
        do {
            System.out.println("Esteve no local do crime ?");
            resposta = leia.next().toLowerCase();
            if(resposta.equals("sim") || resposta.equals("nao")) {
                listaDeRespostas.add(resposta);
                validacao = 1;
            } else System.out.println("Resposta Invalida, favor responda as pergunta somente com SIM ou NAO");
        } while (validacao == 0);

        System.out.println("------------------------------------------------");
        // Pergunta 3
        validacao = 0;
        do {
            System.out.println("Mora perto da vitima ?");
            resposta = leia.next().toLowerCase();
            if(resposta.equals("sim") || resposta.equals("nao")) {
                listaDeRespostas.add(resposta);
                validacao = 1;
            } else System.out.println("Resposta Invalida, favor responda as pergunta somente com SIM ou NAO");
        } while (validacao == 0);

        System.out.println("------------------------------------------------");
        // Pergunta 4
        validacao = 0;
        do {
            System.out.println("Devia para a vitima  ?");
            resposta = leia.next().toLowerCase();
            if(resposta.equals("sim") || resposta.equals("nao")) {
                listaDeRespostas.add(resposta);
                validacao = 1;
            } else System.out.println("Resposta Invalida, favor responda as pergunta somente com SIM ou NAO");
        } while (validacao == 0);

        System.out.println("------------------------------------------------");
        // Pergunta 5
        validacao = 0;
        do {
            System.out.println("Ja trabalhou com a vitima  ?");
            resposta = leia.next().toLowerCase();
            if(resposta.equals("sim") || resposta.equals("nao")) {
                listaDeRespostas.add(resposta);
                validacao = 1;
            } else System.out.println("Resposta Invalida, favor responda as pergunta somente com SIM ou NAO");
        } while (validacao == 0);



        System.out.println(listaDeRespostas.toString());


    }
}