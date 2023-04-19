package com.eng;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            SistemaRegistroInterface sistema =  new SistemaRegistro();

        JOptionPane.showMessageDialog(null,"Sistema de Registro","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);

        boolean sair = false;
        while (!sair){
            int opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma OPÇÃO \n 1 -- Cadastrar Usuario"
                            +"\n 2 -- Listar Dados do Usuario"
                            +"\n 3 -- sair"));

            switch (opc) {
                case 1:
                    String nomeCrianca = JOptionPane.showInputDialog("Digite o nome da criaça");
                    String idCrianca = JOptionPane.showInputDialog("Digite o id da crianca");
                    JOptionPane.showMessageDialog(null,"Agora vamos adicionar os registros dessa Criança","Atenção",JOptionPane.INFORMATION_MESSAGE);
                    String doencaCrianca = JOptionPane.showInputDialog("Digite a doenca");
                    String medicacoes = JOptionPane.showInputDialog("Digite as medicaçoes");
                    Crianca crianca = new Crianca(nomeCrianca,idCrianca,doencaCrianca,medicacoes);
                    sistema.cadastraCri(crianca);
                    break;
                case 2:
                    String criancaPesq = JOptionPane.showInputDialog("Digite o id da criança que deseja pesquisar");
                    Crianca crincaAchada = sistema.listarRegis(criancaPesq);
                    JOptionPane.showMessageDialog(null,"Criança pesquisada com o Nome: "
                            + crincaAchada.getNome()+ " e ID: "+crincaAchada.getId()+"\n" +crincaAchada.toString());
                    break;
                case 3:
                    sair = true;
                    break;
            }



        }//while
    }
}