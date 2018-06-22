package br.com.main;

import br.com.domain.Control;
import java.util.Scanner;
import static javafx.application.Platform.exit;

public class Main {
    
    //TRANFORMAR PROFESSOR E MONITOR EM UM ARRAY UNICO DE FUNCIONÁRIO E REALIZAR VERIFICAÇÃO PELO CARGO;
    
    public static void main(String[] args) {
        
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Cadastro de Alunos");
        System.out.println("2 - Cadastro de Professores(Funcionários)");
        System.out.println("3 - Cadastro de turmas");
        System.out.println("5 - Sair");
            
        String comando = null;
    while(!"5".equals(comando) ){
        Scanner teclado = new Scanner(System.in);
        comando = teclado.next();
        switch(comando){
            case "1":
                System.out.println("1 pra cadastro e 2 pra listar");
                while(!"3".equals(comando))
                comando = teclado.nextLine();
                switch(comando){    
                    case "1":
                        String nome = teclado.nextLine();
                        if(teclado.nextLine().equals("4")){
                            System.out.println("Menu de Alunos:\n");
                            break;
                        }                        
                        String matricula = teclado.nextLine();
                        if(Control.Consultainsercaoaluno(nome)==null){
                            Control.Addaluno(nome, matricula);
                            break;
                        }
                        break;
                    case "2":
                        Control.Listaralunos();
                        break;
                }
                break;
            case "2":
                String nome = teclado.next();
                String cargo = teclado.next();
                String codigo = teclado.next();
                double salario = teclado.nextDouble();
                if(Control.Consultainsercaofuncionario(nome)==null){
                    Control.Addfuncionario(nome, cargo, codigo, salario);
                }
                break;
            case "3":
                break;
            case "4":
                break;   
            case "5":
                break;
            default:
                System.out.println("Os dados inseridos não correspondem a nenhuma das opções fornecidas.");
            }
    }
    }
}
        
        
        
        
        
        
        
        /*System.out.println("Sistema de Gerenciamento Escolar");
        OUTER:            
        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastro de Alunos");
            System.out.println("2 - Cadastro de Professores(Funcionários)");
            System.out.println("3 - Cadastro de turmas");
            System.out.println("4 - Sair");
            //adicionar nos proximos cases que o 4 é saida
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
            switch (opt) {
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                case 1:
                    /** Cadastrando Alunos */
         /*           System.out.flush();
            OUTER_1:
            while (true) {
                System.out.println("Selecione uma opção:");
                System.out.println("1 - Cadastro de Alunos");
                System.out.println("2 - Mostrar Alunos Cadastrados");
                Scanner sc2 = new Scanner(System.in);
                int opt2 = 0;
                try{
                    opt2 = sc2.nextInt();
                }
                catch(InputMismatchException e){
                    System.out.println("Opção invalida, tente novamente.\n");
                }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                switch (opt2) {
                    case 1:
                         System.out.println("Informe o número de matricula:");
                            Scanner sc3 = new Scanner(System.in);
                            String matricula = sc3.nextLine();
                            for(int i = 0; i < alunos.size(); i++){
                                if(alunos.get(i).getMatricula().equals(matricula)){
                                    System.out.println("Número de Matricula já cadastrado!.\n");
                                    break OUTER_1;
                                }
                            }
                            System.out.println("Informe o nome do aluno:");
                            String nome = sc3.nextLine();
                            for(int i = 0; i < alunos.size(); i++){
                                if(alunos.get(i).getNome().equals(nome)){
                                    System.out.println("Nome do Aluno já cadastrado!.\n");
                                    break OUTER_1;
                                }
                            }
                            if (matricula.equals("0") || nome.equals("0")) {
                                break;
                            } else {
                                alunos.add(new Aluno(matricula, nome));
                              
                            }
                       
                        break OUTER_1;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                    
                    case 2:
                    while (true) {
                            if(!alunos.isEmpty()) {
                                Listaralunos();
                                break;
                            }else {
                                System.out.println("Nenhum aluno cadastrado.\n");
                                    break OUTER_1;
                             }
                        }
 
                    default:
                        break OUTER_1;
                }
            }
break;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                case 2:
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/** Cadastrando Funcionários(Professores) */
    /*    case 2:
            System.out.flush();
            OUTER_2:
            while (true) {
                System.out.println("Selecione uma opção:");
                System.out.println("1 - Cadastro de Funcionarios");
                System.out.println("2 - Mostrar Funcionarios Cadastrados");
                Scanner sc4 = new Scanner(System.in);
                int opt3 = 0;
                try{
                    
                    opt3 = sc4.nextInt();
                }
                catch(InputMismatchException e){
                      System.out.println("Opção invalida, tente novamente.\n");
                }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                switch (opt3) {
                    case 1:
                            System.out.println("Informe o codigo do funcionario:");
                            Scanner sc5 = new Scanner(System.in);
                            String codigo = sc5.nextLine();
                            //VERIFICA SE JÁ EXISTE 
                            for(int i = 0; i < professores.size(); i++){
                                        if(professores.get(i).getCodigo().equals(codigo)){
                                            System.out.println("Número de Codigo já cadastrado!\n");
                                            break OUTER_2;
                                        }
                                    }
                             for(int i = 0; i < monitores.size(); i++){
                               if(monitores.get(i).getCodigo().equals(codigo)){
                                            System.out.println("Número de Codigo já cadastrado!\n");
                                            break OUTER_2;
                                        }   
                              }

                            System.out.println("Informe o nome do funcionario:");
                            String nome = sc5.nextLine();
                            for(int i = 0; i < professores.size(); i++){
                                        if(professores.get(i).getNome().equals(nome)){
                                            System.out.println("Nome de Funcionário já cadastrado!\n");
                                            break OUTER_2;
                                        }
                                    }
                             for(int i = 0; i < monitores.size(); i++){
                               if(monitores.get(i).getNome().equals(nome)){
                                            System.out.println("Nome de Funcionário já cadastrado!\n");
                                            break OUTER_2;
                                        }   
                              }
                                                         
                            System.out.println("Informe o cargo do funcionario:");
                            String cargo = sc5.nextLine();
                            
                            if(("Professor".equals(cargo)) || (("professor".equals(cargo)))) {
                                professores.add(new Professor(codigo, cargo, nome));
                                System.out.println("\n");
                            }else if (("Monitor".equals(cargo)) || ("monitor".equals(cargo))){
                                monitores.add(new Monitoria(codigo,cargo,nome));
                                System.out.println("\n");
                            }else {
                                System.out.println("Cargo Invalido!\n");
                                break OUTER_2;
                            }
                     break;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    case 2:
                      while (true) {
                            if (!professores.isEmpty() || !monitores.isEmpty()) {
                                Listarprofessor();
                                Listarmonitores();
                                break;
                            }else {
                                System.out.println("Nenhum Funcionário cadastrado.\n");
                                break OUTER_2;
                                
                            }
                        }

                    default:
                        break OUTER_2;
                }
            }
break;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/** Cadastrando Turmas */
        /*        case 3:
                System.out.flush();
            OUTER_3:
            while (true) {
                System.out.println("Selecione uma opção:");
                System.out.println("1 - Cadastro de Turmas");
                System.out.println("2 - Mostrar Turmas Cadastradas");
                System.out.println("3 - Adicionar Alunos à Turma");
                System.out.println("4 - Listar Alunos de uma Turma");
                Scanner sc5 = new Scanner(System.in);
                int opt4 = 0;
                try{
                    opt4 = sc5.nextInt();
                }
                catch(InputMismatchException e){
                    System.out.println("Opção invalida, tente novamente.\n");
                }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
                switch (opt4) {
                    case 1:
                        while (true) {
                            if (!professores.isEmpty() || !alunos.isEmpty()) {
                            
                            Professor p = null;
                            Aluno a = null;
                            List<Aluno> turma = new ArrayList<>();
                            
                            String prof;
                            String aluno;
                            String codigo = "0";
                           
                           
                            
                            System.out.println("Informe o nome do professor da turma:\n");
                            Scanner sc6 = new Scanner(System.in);
                            prof = sc6.nextLine();  
                            for(int i = 0; i < professores.size(); i++){
                                    if(professores.get(i).getNome().equals(prof)){
                                       p = professores.get(prof);
                                        System.out.println("Professor cadastrado com sucesso!.\n");   
                                        break;
                                            }
                                            System.out.println("Professor não cadastrado!.\n");
                                           break; 
                                        }
                              while(true){
                                    System.out.println("Informe o aluno:\n");
                                    aluno = sc6.nextLine();
                                        for(int i = 0; i < alunos.size(); i++){
                                            if(alunos.get(i).getNome().equals(aluno)){
                                                a = alunos.get(aluno);
                                                
                                                break;
                                            }
                                            System.out.println("Aluno não cadastrado!.\n");
                                        }
                                }
                         System.out.println("Informe o nome da turma:\n");
                         codigo = sc6.nextLine();
                            
                         turmas.add(new Turma(p, alunos, codigo));
                        }
                  }
                            

                            
                            
                            
                           
                     
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    case 2:
                        while (true) {
                            if (turmas.isEmpty()) {
                                System.out.println("Nenhuma turma cadastrada, tecle 'V' pra voltar!");
                                Scanner exit = new Scanner(System.in);
                                String letra = exit.nextLine();
                                if (letra.equals("V")) {
                                    break;
                                } else {
                                    System.out.println("Erro, tecle 'V' para voltar!");
                                }
                            } else {
                                for (int i = 0; i < turmas.size(); i++) {
                                    List<Aluno> t = turmas.get(i).getAlunos();
                                    System.out.println(turmas.get(i).getCodigo()+ " - " + turmas.get(i).getProfessor().getNome());
                                    for (int j = 0; j < t.size(); j++) {
                                        System.out.println(alunos.get(i).getNome());
                                    }
                                }
                                Scanner exit2 = new Scanner(System.in);
                                String letra = exit2.nextLine();
                                System.out.println("Tecle 'V' para voltar!");
                                if (letra.equals("V")) {
                                    break;
                                } else {
                                    System.out.println("Erro, tecle 'V' para voltar!");
                                }
                            }
                        }
                        break;
                    default:
                        break OUTER_3;
                }
            }
break;
*/
                   // default:
        /*            System.exit(0);*/
                   /* break OUTER;*/
                        /*}}}}}*/
        
    


