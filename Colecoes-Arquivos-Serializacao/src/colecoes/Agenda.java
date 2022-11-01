/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import io.Arquivos;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* @author aluno*/
public class Agenda {
    private Map<String, Contato> colecao;
    
    public Agenda() {
        colecao = new TreeMap<String, Contato>();
    }
    
    //funcionalidade para as operações básicas (inclusão, exclusão, listar e pesquisa)
    //obs: no mapa, tudo gira em torno da chave (key)
    //usar keySet para pegar os nomes
    
    public void inserir(Contato c){
        colecao.put(c.getNome(), c);
    }
    
    public Contato remover(String nome){
        return colecao.remove(nome);
    }
    
    public Contato buscarPorNome(String nome){
        return colecao.get(nome);
    }
    
    public void listar(){
        System.out.println("-- Lista de Contatos ---------- \n");
        for(Contato c : colecao.values()){
            System.out.println(c);
        }
    }
    
    public void salvarArquivo(String caminho){
        try {
            Arquivos.serializar(caminho, colecao);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: O arquivo " + caminho + "nao foi encontrado ");
        } catch (IOException e){
            System.out.println("Erro: Nao foi possivel abrir o arquivo " + caminho + ".");
        }
    }
        
        public void lerArquivo(String caminho){
            try {
            colecao = (Map<String, Contato>)Arquivos.desserializar(caminho);
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Nao foi encontrada a definicao da classe apropriada ");
        } catch (FileNotFoundException e){
            System.out.println("Erro: Nao foi possivel abrir o arquivo " + caminho + ".");
        } catch (IOException e){
            System.out.println("Erro: Nao foi possivel abrir o arquivo " + caminho + ".");
        }
                
        }
    
    public static void main(String[] args){
        Agenda agenda = new Agenda();
        
        //agenda.lerArquivo("Contatos.dat");

        
        Contato c = 
            new Contato("Renata",
            new Data(2001, 05, 8), 
            new Telefone("55", "99999999"));
        
        agenda.inserir(c);
        
            c = new Contato("Lucas",
            new Data(2001, 06, 7), 
            new Telefone("51", "222222"));
            
        
        agenda.inserir(c);
        
            c = new Contato("Cleber",
                new Data(2001, 06, 7), 
                new Telefone("51", "222222"));
            
        agenda.inserir(c);
         
        //c = agenda.remover("Cleber");
        
        agenda.listar();
        
        /*System.out.println("-- Contato Removido --");
        System.out.println(c);*/
        
        agenda.salvarArquivo("Contatos.dat");
    } 
}


