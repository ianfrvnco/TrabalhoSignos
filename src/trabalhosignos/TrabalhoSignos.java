package trabalhosignos;

import java.util.Scanner;
import java.util.Calendar;

public class TrabalhoSignos {

    public static void main(String[] args) {

        String nome, signo = " ", resSexo = " ";
        int sexo, dia, mes, ano, diaAtual, mesAtual, anoAtual, idade = 0;
        int numeroSorte = 0, corSorte;
        boolean masculino = false, feminino = false;

        Scanner ler = new Scanner(System.in);
        Calendar hoje = Calendar.getInstance();
        diaAtual = hoje.get(Calendar.DATE);
        mesAtual = hoje.get(Calendar.MONTH);
        anoAtual = hoje.get(Calendar.YEAR);

        System.out.println("Nome: ");
        nome = ler.nextLine();
        System.out.println("Sexo (1 para feminino e 2 para masculino): ");
        sexo = ler.nextInt();
        System.out.println("Dia do nascimento: ");
        dia = ler.nextInt();
        System.out.println("Mês do nacimento (1 para janeiro, "
                + "2 para fevereiro...): ");
        mes = ler.nextInt();
        System.out.println("Ano do nascimento: ");
        ano = ler.nextInt();

        //processamento
        if (sexo == 1) {
            resSexo = "Sra.";
        } else {
            resSexo = "Sr.";
        }

        if (nome.length() <= 8) {
            System.out.println("Insira o nome completo. ");
        } else {
            if (ano < 1900 || ano > anoAtual) {
                System.out.println("Ano inválido.");
            } else {
                
                switch (mes) {

                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (dia < 1 || dia > 31) {
                            System.out.println("Dia inválido.");
                            System.exit(0);
                        } else {
                            if (mes > mesAtual || (mes == mesAtual
                                    && +dia > diaAtual)) {
                                idade = anoAtual - ano;
                                idade--;

                            } else {
                                System.out.println("Insira uma data válida.");
                                System.exit(0);

                            }
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (dia < 1 || dia > 30) {
                            System.out.println("Dia inválido. ");
                            System.exit(0);
                        } else {
                            if (mes > mesAtual || (mes == mesAtual
                                    && +dia > diaAtual)) {
                                idade = anoAtual - ano;
                                idade--;

                            } else {
                                System.out.println("Insira uma data válida.");
                                System.exit(0);

                            }

                        }
                        break;
                    case 2:
                        if (dia < 1 || dia > 28) {
                            System.out.println("Dia inválido. ");
                            System.exit(0);
                        } else {
                            if (mes > mesAtual || (mes == mesAtual
                                    && +dia > diaAtual)) {
                                idade = anoAtual - ano;
                                idade--;

                            } else {
                                System.out.println("Insira uma data válida.");
                                System.exit(0);

                            }

                        }
                        break;
                    default:
                        System.out.println("Mês inválido. ");
                        System.exit(0);
                        break;

                }

                if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
                    signo = "Áries";
                } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
                    signo = "Touro";
                } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                    signo = "Gêmeos";
                } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 20)) {
                    signo = "Câncer";
                } else if ((mes == 7 && dia >= 21) || (mes == 8 && dia <= 20)) {
                    signo = "Leão";
                } else if ((mes == 8 && dia >= 21) || (mes == 9 && dia <= 20)) {
                    signo = "Virgem";
                } else if ((mes == 9 && dia >= 21) || (mes == 10 && dia <= 20)) {
                    signo = "Libra";
                } else if ((mes == 10 && dia >= 21) || (mes == 11 && dia <= 20)) {
                    signo = "Escorpião";
                } else if ((mes == 11 && dia >= 21) || (mes == 12 && dia <= 20)) {
                    signo = "Sagitário";
                } else if ((mes == 12 && dia >= 21) || (mes == 1 && dia <= 20)) {
                    signo = "Capricórnio";
                } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 20)) {
                    signo = "Aquário";
                } else {
                    signo = "Peixes";
                }

                numeroSorte = 1 + (int) (Math.random() * 99);
                corSorte = 1 + (int) (Math.random() * 12);
                String cor = "azul";

                switch (corSorte) {
                    case 1:
                        cor = "vermelho";
                        break;
                    case 2:
                        cor = "azul";
                        break;
                    case 3:
                        cor = "branco";
                        break;
                    case 4:
                        cor = "rosa";
                        break;
                    case 5:
                        cor = "rosa";
                        break;
                    case 6:
                        cor = "preto";
                        break;
                    case 7:
                        cor = "roxo";
                        break;
                    case 8:
                        cor = "laranja";
                        break;
                    case 9:
                        cor = "bordô";
                        break;
                    case 10:
                        cor = "verde";
                        break;
                    case 11:
                        cor = "amarelo";
                        break;
                    case 12:
                        cor = "lilás";
                        break;
                    default:
                        break;
                }

                if (sexo == 1) {
                    System.out.println(resSexo + nome
                            + ", nascida em " + dia + "/" + mes + "/" + ano + ", é do signo "
                            + signo + ". Você tem " + idade + " anos. Seu "
                            + "número da sorte é " + numeroSorte + " e sua cor é " + cor + ".");
                } else {
                    System.out.println(resSexo + nome
                            + ", nascido em " + dia + "/" + mes + "/" + ano + ", é do signo "
                            + signo + ". Você tem " + idade + " anos. Seu "
                            + "número da sorte é " + numeroSorte + " e sua cor é " + cor + ".");
                }

            }
        }
    }

}
