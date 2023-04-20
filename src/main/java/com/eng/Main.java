package com.eng;

import javafx.scene.input.DataFormat;
import javafx.util.converter.LocalDateStringConverter;

import javax.swing.*;
import javax.xml.crypto.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException,CriancaNaoExisteExecption {
        SistemaRegistroInterface sistema = new SistemaRegistro();
        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\Documentos\\GitHub\\EngSoft\\icon.png");
        JOptionPane.showMessageDialog(null, "Sistema de Historico de Saúde Infaltil", "Bem Vindo",
                JOptionPane.INFORMATION_MESSAGE,icon);

        boolean sair = false;
        while (!sair) {
            int opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma OPÇÃO " +
                            "\n 1 -- Cadastrar Criança e Suas Informações"
                            + "\n 2 -- Listar Dados da Criança"
                            + "\n 3 -- sair"));
            switch (opc) {
                case 1:
                    SimpleDateFormat formDate = new SimpleDateFormat("dd/MM/yyyy");
                    String nomeCrianca = JOptionPane.showInputDialog("Digite o NOME da Criança");
                    String idCrianca = JOptionPane.showInputDialog("Digite o ID da Crianca");
                    Object[] itens = { "Masculino","Feminino" };
                    Object selectedValue = JOptionPane.showInputDialog(null,
                        "Escolha o Sexo da Criança", "Opçao",
                            JOptionPane.INFORMATION_MESSAGE, null,
                            itens, itens [0]);
                    String dataNas = JOptionPane.showInputDialog("Digite a Data de Nascimento\n");
                    JOptionPane.showMessageDialog(null, "Criança Cadastrada!", "Atenção", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, "Agora vamos adicionar algumas informações dessa Criança",
                            "Atenção!!!", JOptionPane.WARNING_MESSAGE);
                    String doencaCrianca = JOptionPane
                            .showInputDialog("Digite a Doenca :\nOBS: se tiver mais de uma doença separe com virgula ',' ");
                    String medicacoes = JOptionPane.showInputDialog("Digite as medicaçoes");
                    JOptionPane.showMessageDialog(null,"Informações cadastradas","Atenção",JOptionPane.INFORMATION_MESSAGE);

                    Crianca crianca = new Crianca(nomeCrianca, idCrianca, selectedValue,dataNas, doencaCrianca, medicacoes);
                    sistema.cadastraCri(crianca);
                    break;
                case 2:
                    try {
                        String criancaPesq = JOptionPane.showInputDialog("Digite o id da criança que deseja pesquisar");
                        Crianca crincaAchada = sistema.listarRegis(criancaPesq);
                        JOptionPane.showMessageDialog(null, "---Dados da Criança Pesquisada--- \n"+"ID: "+ crincaAchada.getId() +"\n"+ "Nome: "
                                + crincaAchada.getNome() + "\n" + "Sexo : "+crincaAchada.getSexoCria()+"\n"+"Data de Nacimento :"
                                + crincaAchada.getDataNascimento() + "\n" + crincaAchada.toString());
                    }catch (CriancaNaoExisteExecption naoExisteExecption){
                        JOptionPane.showMessageDialog(null,naoExisteExecption.getMessage());
                    }
                    break;
                case 3:
                    sair = true;
                    JOptionPane.showMessageDialog(null, "Fim do programa", "Atenção", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } // while
    }
}