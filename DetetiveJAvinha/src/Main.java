import javax.swing.*;
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


        // Calculando quantidade de sim
        int sim = 0;
        for (String res : listaDeRespostas) {
            if(res.equals("sim")) sim++;
        }

        // Saidas
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------");
        switch (sim) {
            case 2:
                JOptionPane.showMessageDialog(null,"Voce e so um suspeita !");
                break;
            case 3, 4:
                JOptionPane.showMessageDialog(null,"Voce e cumplice !");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Parado voce esta preso!! Voce e o assasino !");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Parabens voce e inocente!!");

        }




    }
}