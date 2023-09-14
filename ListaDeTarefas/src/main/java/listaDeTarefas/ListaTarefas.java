package listaDeTarefas;
import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> tarefas;

    public ListaTarefas(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        this.tarefas.removeIf(t -> t.getDescricao().equals(descricao));
    }

    public int obterNumeroTotalTarefas(){
        return this.tarefas.size();
    }

    public List<String> obterDescricoesTarefas(){
        List<String> descricoes = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            descricoes.add(tarefa.getDescricao());
        }
        return descricoes;
    }
}
