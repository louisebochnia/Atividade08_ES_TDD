public class Pilha{
    private No topo;
    // construtor é padrão, herdado de Object, topo = null
    // o atributo de controle topo n é visível para o cliente

    public boolean pilhaVazia(){
        return topo == null;
    }

    // empilhar dados
    public void push(int info){
        No novo = new No(info);
        if(!pilhaVazia()){
            novo.setProximo(topo);
        }
        topo = novo;
    }

    // desempilhar dados
    public int pop(){
        if(pilhaVazia()) throw new RuntimeException("falha no desempilhamento, nao ha o que remover ;(");
        int temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }

    // consulta do topo
    public int peek(){
        if(pilhaVazia()) throw new RuntimeException("falha na consulta");
        return topo.getInfo();
    }

    @Override
    public String toString(){
        if(pilhaVazia()) return "pilha vazia\n";
        String s = "---------------\n";
        No runner = topo;
        while(runner != null){
            s += runner + "\n"; // é a msm coisa q s += runner.toString()
            runner = runner.getProximo(); // seria tipo o i++
        }
        return s + "\n";
    }

    // invertendo pilha
    public void invertePilha(){
        Pilha aux = new Pilha();
        while(pilhaVazia()){
            aux.push(this.pop());
        }
        this.topo = aux.topo;
    }
}

class No{
    private int info;
    private No proximo;

    public No(int info){
        this.info = info;
    }

    // Getters and Setters
    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public int getInfo(){
        return info;
    }

    @Override
    public String toString(){
        return "[" + info + "]";
    }
}
