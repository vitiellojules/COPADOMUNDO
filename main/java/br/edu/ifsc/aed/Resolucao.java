/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.aed;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author renato
 */
public class Resolucao {

    public static void printList(Iterable l, String msg) {
        System.out.println(msg);
        for (Object object : l) {
            System.out.println(object);
        }
        System.out.println("");
    }

    /**
     * 1 - Considere uma pilha P vazia e uma fila F não vazia. Faça um método
     * que preencha a pilha da seguinte forma: adicione um elemento da fila,
     * adicione o elemento multiplicado por 2 e assim por diante. Ao final a
     * pilha deve ter o dobro do tamanho da fila.
     *
     * @param F
     * @param P
     */
    public static void questao1Preenche(Queue<Integer> F, Stack<Integer> P) {
        printList(F, "Fila");

        while (!F.isEmpty()) {
            Integer elemento = F.poll();
            P.push(elemento);
            P.push(elemento * 2);
        }
        printList(F, "Pilha-antiga");
        printList(P, "Pilha-nova");
    }

    /**
     * 2 - Considere uma lista contendo números inteiros. Escreva uma função
     * para ordenar essa fila em ordem crescente de seus valores.
     *
     * @param L
     */
    public static void questao2Ordena(LinkedList<Integer> L) {
        printList(L, "Ordenando a lista");

        LinkedList<Integer> K = new LinkedList<>();
        while (!L.isEmpty()) {
            Integer maior = getMaior(L);
            K.addFirst(buscarEremover(maior, L));
        }
        L.clear();
        L.addAll(K);
        printList(L, "Lista ordenada");

    }

    public static Integer buscarEremover(Integer x, LinkedList<Integer> lista) {
        //     printList(lista, "Buscando o valor " + x + " na lista:");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(x)) {
                //           System.out.println("Valor " + x + " encontrado na posicao " + i);
                lista.remove(i);
                //         printList(lista, "Nova lista");
                return x;
            }
        }
        //System.out.println("Objeto " + x + " não encontrado:");
        return null;
    }

    public static Integer getMaior(LinkedList<Integer> lista) {
        Integer maior = lista.getFirst();
        for (Integer valor : lista) {
            if (valor.compareTo(maior) > 0) {
                maior = valor;
            }
        }
        return maior;
    }

    /**
     * 3 - Considere uma lista contendo números inteiros. Escreva uma função ao
     * que calcule o maior, o menor e a media aritmética dos seus elementos
     *
     * @param F
     */
    public static void questao3Calcular(List<Integer> L) {
        int maior = L.get(0);
        int menor = L.get(0);
        double soma = 0;

        for (Integer val : L) {
            soma += val;
            if (val > maior) {
                maior = val;
            }
            if (val < menor) {
                menor = val;
            }
        }
        printList(L, "Lista");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + (soma / L.size()));

    }

    public static boolean questao4MaisElemento(LinkedList F1, LinkedList F2) {
        int totalF1 = 0;
        int totalF2 = 0;
        while (!F1.isEmpty()) {
            F1.remove();
            totalF1++;
        }
        while (!F2.isEmpty()) {
            F2.remove();
            totalF2++;
        }
        return totalF1 > totalF2;
    }

    /**
     * 5 - Faça uma função que receba três filas, duas já preenchidas em ordem
     * crescente e preencha a última com os valores das duas primeiras em ordem
     * crescente sem ter elementos repetidos
     */
    public static void questao5PreencheEordena(LinkedList<Integer> L1, LinkedList<Integer> L2, LinkedList<Integer> L3) {
        printList(L1, "L1");
        printList(L2, "L2");
        while (!(L1.isEmpty() && L2.isEmpty())) {
            int e1 = L1.poll();
            int e2 = L2.poll();
            if (!L3.contains(e1)) {
                L3.add(e1);
            }
            if (!L3.contains(e2)) {
                L3.add(e2);
            }
        }

        questao2Ordena(L3);
    }

    /**
     * 6 - Implemente uma função que receba uma lista como parâmetro e cria uma
     * fila e uma pilha e em seguida imprima os elementos das três estruturas
     */
    public static void questao6preenche(LinkedList<Integer> L1) {
        Stack<Integer> pilha = new Stack<>();
        LinkedList<Integer> fila = new LinkedList<>();
        for (Integer integer : L1) {
            pilha.push(integer);
            fila.add(integer);
        }
        printList(L1, "Lista");
        printList(fila, "Fila");
        printList(pilha, "Pilha");
    }

    /**
     * 7 - Faça uma função que receba uma fila como argumento e retorne o valor
     * armazenado em seu início. A função deve remover também esse elemento.
     */
    public static int questao7PegarPrimeiro(LinkedList<Integer> lista) {
        return lista.pollFirst();
    }

    /**
     * 8 - Faça uma função para retornar o número de elementos da fila que
     * possuem valor ímpar.
     *
     */
    public static int questao8QuantidadeImpar(LinkedList<Integer> lista) {
        int impar = 0;
        for (Integer numero : lista) {
            if (numero % 2 != 0) {
                impar++;
            }
        }
        return impar;
    }

    /**
     * 9 - Faça uma função para retornar o número de elementos da fila que
     * possuem valor par.
     *
     */
    public static int questao9QuantidadePar(LinkedList<Integer> lista) {
        int par = 0;
        for (Integer numero : lista) {
            if (numero % 2 == 0) {
                par++;
            }
        }
        return par;
    }

    /**
     * 10 – Faça uma função que receba 2 parâmetros: o primeiro uma pilha de
     * números inteiros e o segundo um valor inteiro. A função deve retornar
     * quantos elementos deve ser desempilhado até encontrar o número passado
     * como parâmetro, caso não encontre o número, retorne -1.
     */
    public static int questao10NumeroDesempilhado(Stack<Integer> pilha, int valor) {
        int res = 0;
        while (!pilha.isEmpty()) {
            if (pilha.pop() == valor) {
                return res;
            }
            res++;
        }
        return -1;
    }

    /**
     * 11 – Faça uma função que receba uma fila como parâmetro e retorne qual o
     * maior número par presente na fila. Informe na tela todos os elementos
     * pares
     */
    public static int questao11MaiorPar(List<Integer> lista) {
        LinkedList<Integer> pares = new LinkedList<>();
        int maiorPar = -1;
        for (Integer val : lista) {
            if (val % 2 == 0) {
                if (val > maiorPar) {
                    maiorPar = val;
                }
                pares.add(val);
            }
        }
        printList(lista, "Todos");
        printList(pares, "Pares");

        return maiorPar;

    }

    /**
     * Faça um método para embaralhar 2 pilhas de cartas, para isso, receba 2
     * listas (L1 e L2) como parâmetro, embaralhe as duas listas individualmente
     * com o método shuffle() e crie duas pilhas distintas P1 e P2 com o
     * conteúdo da sua respectiva lista. Ao término, faça uma lista final L3 que
     * vai receber a carta do topo de P1 e depois o topo de P2. Faça isso até
     * finalizar as duas pilhas de cartas. Apresente em tela L1, L2, P1, P2 e L3
     *
     * @param lista12l1
     * @param lista12l2
     * @return
     */
    private static LinkedList<Integer> questao12Embaralha(LinkedList<Integer> L1,
            LinkedList<Integer> L2) {
        Collections.shuffle(L1);
        Collections.shuffle(L2);
        printList(L1, "Questao 12 - L1");
        printList(L2, "Questao 12 - L2");
        Stack<Integer> P1 = new Stack<>();
        for (Integer val : L1) {
            P1.push(val);
        }
        Stack<Integer> P2 = new Stack<>();
        for (Integer val : L2) {
            P2.push(val);
        }
        printList(P1, "Questao 12 - P1");
        printList(P2, "Questao 12 - P2");

        LinkedList<Integer> L3 = new LinkedList<>();
        while (!(P1.isEmpty() || P2.isEmpty())) {

            if (!P1.isEmpty()) {
                L3.add(P1.pop());
            }
            if (!P2.isEmpty()) {
                L3.add(P2.pop());
            }

        }
        printList(L3, "Questao 12 - L3");

        return L3;
    }

    /**
     * 13 – Faça um método para criptografar uma mensagem a partir de um mapa
     * (dicionário), com isso, você poderá utilizar a seguinte regra:
     */
    public static String questao13Encript(String mensagem) {
        //Populando o mapa com os caracteres correspondentes
        HashMap<Character, Character> mapa = new HashMap<>();
        for (char caractere = 'A'; caractere <= 'Z'; caractere++) {
            if (caractere >= 'A' && caractere <= 'E') {
                mapa.put(caractere, '#');
            } else if (caractere >= 'F' && caractere <= 'L') {
                mapa.put(caractere, '$');
            } else if (caractere >= 'M' && caractere <= 'R') {
                mapa.put(caractere, '&');
            } else if (caractere >= 'S' && caractere <= 'Z') {
                mapa.put(caractere, '*');
            }
        }

        mensagem = mensagem.toUpperCase();
        char[] caracteres = mensagem.toCharArray();
        String msgEncript = "";
        for (int i = 0; i < caracteres.length; i++) {
            char caractere = caracteres[i];
            if (mapa.get(caractere) != null) {
                msgEncript += String.valueOf(mapa.get(caractere));
            } else {
                msgEncript += "-";
            }
        }

        return msgEncript;
    }

    /**
     * 14 – Faça um método que receba duas listas do mesmo tamanho sendo a
     * primeira lista de string um conjunto de chaves e a segunda lista de
     * inteiros os valores. O método deve retornar um mapa com tal estrutura.
     */
    public static HashMap<String, Integer> questao14GetMapa(List<String> L1, List<Integer> L2) {
        HashMap<String, Integer> mapa = new HashMap<>();
        if (L1.size() != L2.size()) {
            System.out.println("Tamanhos das listas são diferentes");
        } else {
            for (int i = 0; i < L1.size(); i++) {
                String key = L1.get(i);
                Integer value = L2.get(i);
                mapa.put(key, value);
            }
        }
        System.out.println("MAPA");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        return mapa;

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\n\n================Questao 1================");
        LinkedList<Integer> fila = new LinkedList();
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        Stack<Integer> pilha = new Stack<Integer>();
        questao1Preenche(fila, pilha);

        System.out.println("\n\n================Questao 2================");
        LinkedList<Integer> fila2 = new LinkedList();
        fila2.add(4);
        fila2.add(3);
        fila2.add(2);
        fila2.add(1);
        questao2Ordena(fila2);

        System.out.println("\n\n================Questao 3================");
        questao3Calcular(fila2);

        System.out.println("\n\n================Questao 4================");
        LinkedList<Integer> fila3 = new LinkedList();
        fila3.add(4);
        fila3.add(3);
        printList(fila2, "F1");
        printList(fila3, "F2");
        System.out.println("F1 mais elemento que F2? " + questao4MaisElemento(fila2, fila3));

        System.out.println("\n\n================Questao 5================");
        LinkedList<Integer> L1 = new LinkedList();
        L1.add(1);
        L1.add(2);
        L1.add(3);
        LinkedList<Integer> L2 = new LinkedList();
        L2.add(4);
        L2.add(5);
        L2.add(6);
        LinkedList<Integer> L3 = new LinkedList();
        questao5PreencheEordena(L1, L2, L3);

        System.out.println("\n\n================Questao 6================");
        questao6preenche(L3);

        System.out.println("\n\n================Questao 7================");
        LinkedList<Integer> L7 = new LinkedList();
        L7.add(4);
        L7.add(40);
        L7.add(400);
        L7.add(4000);
        printList(L7, "Lista Questao 7");
        System.out.println(questao7PegarPrimeiro(L7));

        System.out.println("\n\n================Questao 8================");
        LinkedList<Integer> L8 = new LinkedList();
        for (int i = 0; i < 10; i++) {
            L8.add(i);
        }
        printList(L8, "Lista Questao 8");
        System.out.println("Impares de L8 = " + questao8QuantidadeImpar(L8));

        System.out.println("\n\n================Questao 9================");
        LinkedList<Integer> L9 = new LinkedList();
        for (int i = 0; i < 12; i++) {
            L9.add(i);
        }
        printList(L9, "Lista Questao 9");
        System.out.println("Pares de L9 = " + questao9QuantidadePar(L9));

        System.out.println("\n\n================Questao 10================");
        Stack<Integer> pilha10 = new Stack<>();
        pilha10.push(1);
        pilha10.push(2);
        pilha10.push(3);
        pilha10.push(4);
        pilha10.push(5);
        printList(pilha10, "Pilha Questao 10");
        System.out.println("Quantas desempilhadas para o numero 2 = " + questao10NumeroDesempilhado(pilha10, 2));

        System.out.println("\n\n================Questao 11================");
        List<Integer> questao11L1 = Arrays.asList(new Integer[]{10, 20, 30, 6, 3, 2, 1, 100});
        System.out.println("Maior par = " + questao11MaiorPar(questao11L1));

        System.out.println("\n\n================Questao 12================");
        LinkedList<Integer> lista12L1 = new LinkedList<>();
        LinkedList<Integer> lista12L2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            lista12L1.push(i);
            lista12L2.push(i);
            lista12L2.push(i);
        }

        questao12Embaralha(lista12L1, lista12L2);

        System.out.println("\n\n================Questao 13================");
        String entrada = "ESTE É UM TESTE";
        System.out.println("ENTRADA: " + entrada);
        System.out.println("SAIDA: " + questao13Encript(entrada));

        System.out.println("\n\n================Questao 14================");
        List<String> questao14L1 = Arrays.asList(new String[]{"A", "B", "C", "D"});
        List<Integer> questao14L2 = Arrays.asList(new Integer[]{10, 20, 30, 6});
        printList(questao14L1, "Lista L1");
        printList(questao14L2, "Lista L2");
        questao14GetMapa(questao14L1, questao14L2);

    }

}
