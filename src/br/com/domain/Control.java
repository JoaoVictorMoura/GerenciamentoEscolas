package br.com.domain;

import br.com.domain.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Lacerda
 */
public class Control{
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static List<Turma> turmas = new ArrayList<>();
    private static List<Aluno> alunos = new ArrayList<>();
    
    public static Aluno Consultainsercaoaluno(String nome){
        for (int i = 0 ; i < alunos.size();i++){
            if(alunos.get(i).getNome().equals(nome)){
                System.out.println("Aluno já cadastrado: "+alunos.get(i).getNome());
                return alunos.get(i);
            }
        }
        return null;
    }
    
    public static Funcionario Consultainsercaofuncionario(String codigo){
        for (int i = 0 ; i < funcionarios.size();i++){
            if(funcionarios.get(i).getCodigo().equals(codigo)){
                System.err.println("Funcionario(a) já cadastrado(a): " 
                        + funcionarios.get(i).getNome() 
                        + " " + funcionarios.get(i).getCargo() 
                        + " " + funcionarios.get(i).getCodigo() 
                        + ".\n");
                return funcionarios.get(i);
            }
        }
        return null;
    }
        
    public static void Removealuno(String nome) { 
            for (int i = 0 ; i < alunos.size();i++){
                if(nome.equals(alunos.get(i).getNome())){
                    alunos.remove(alunos.get(i));
                    break;
                }
                else{
                    System.out.println("Aluno nao cadastrado: "+nome);
            }
        }
    }
    
    public static void Removefuncionario(String nome) { 
            for (int i = 0 ; i < funcionarios.size();i++){
                if(nome.equals(funcionarios.get(i).getNome())){
                    funcionarios.remove(funcionarios.get(i));
                    break;
                }
                else{
                    System.out.println("pessoa nao cadastrada: "+nome);
            }
        }
    }
    
    public static void Listaralunos(){
        for(int j = 0; j < alunos.size(); j++){
            System.out.println("Nome: "+alunos.get(j).getNome());
            System.out.println("Matricula: "+alunos.get(j).getMatricula());
            System.out.print("\n");
        }
    }
        public static void Listarfuncionarios(){
        for(int j = 0; j < funcionarios.size(); j++){
            System.out.println("Nome: " + funcionarios.get(j).getNome());
            System.out.println("Codigo: " + funcionarios.get(j).getCodigo());
            System.out.println("Cargo: " + funcionarios.get(j).getCargo());
            System.out.println("Salario: " + funcionarios.get(j).getSalario());
            System.out.print("\n");
        }
    }
        
        public static void Listarturma(){
        for(int j = 0; j < turmas.size(); j++){
            System.out.println(turmas.get(j).getCodigo());                
        }
    }
        
        public static void Addaluno(String nome,String matricula) {
        Aluno A1 = new Aluno(matricula, nome);
        alunos.add(A1);
    }
        
        public static void Addfuncionario(String codigo, String cargo, String nome, double salario) {
        Funcionario F1 = new Funcionario(codigo, cargo, nome, salario);
        funcionarios.add(F1);
    }
        
        public static void Addturma(Funcionario professor, List<Aluno> alunos, String nome) {
        Turma T1 = new Turma(professor, alunos, nome);
        if (("Professor".equals(professor.getCargo())) || ("professor".equals(professor.getCargo()))){
        turmas.add(T1);
        }
        else{
            System.err.println("Este Funcionario não é um professor.");
        }
    }    
}
