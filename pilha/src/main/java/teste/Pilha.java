package teste;

public class Pilha {
    public int[] dados = new int[10];
    public int ultimo, ocupacao;
    // construtor é padrão, herdado de Object, topo = null
    // o atributo de controle topo n é visível para o cliente

    public boolean pilhaVazia(){
        return ocupacao == 0;
    }

    public boolean pilhaCheia(){
        return ocupacao == dados.length;
    }

    public void push(int novo){
        if(pilhaCheia()) throw new RuntimeException("falha no empilhamento :(");
        dados[ultimo] = novo;
        ultimo++;
        ocupacao++;
    }

    public int pop(){
        if(pilhaVazia()) throw new RuntimeException("falha no desempilhamento :C");
        int temp = ultimo;
        dados[--ultimo] = dados[temp];
        ocupacao--;
        return temp;
    }

    public int peek(){
        if(pilhaVazia()) throw new RuntimeException("Falha na consulta :C");
        return dados[ultimo];
    }
}
