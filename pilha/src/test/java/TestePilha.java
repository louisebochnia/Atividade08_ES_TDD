import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import teste.Pilha;

public class TestePilha {
    Pilha pilha = new Pilha();

    @Test
    @DisplayName("Push:")

    public void deveEmpilhar(){
        pilha.push(56);

        assertEquals(false, pilha.pilhaCheia());
        assertEquals(1, pilha.ocupacao);
        assertEquals(56, pilha.dados[0]);
    }

    @Test
    @DisplayName("Falha no push:")

    public void falhaPushPilhaCheia(){
        for(int i = pilha.ocupacao; i < pilha.dados.length; i++){
            pilha.push(i);
        }

        assertEquals(true, pilha.pilhaCheia());
        assertThrows(RuntimeException.class, ()-> pilha.push(11));
    }

    @Test
    @DisplayName("Pop:")

    public void deveDesempilhar(){
        pilha.push(23);
        assertEquals(false, pilha.pilhaVazia());
        assertEquals(1, pilha.pop());
        assertEquals(0, pilha.ultimo);
        assertEquals(0, pilha.ocupacao);
    }

    @Test
    @DisplayName("Falha no pop:")

    public void falhaPopPilhaVazia(){
        assertEquals(true, pilha.pilhaVazia());
        assertThrows(RuntimeException.class, ()-> pilha.pop());
    }

    @Test
    @DisplayName("Peek:")

    public void deveConsultarUltimo(){
        pilha.push(34);
        pilha.push(12);
        assertEquals(pilha.dados[pilha.ultimo], pilha.peek());
    }

    @Test
    @DisplayName("Falha no Peek:")
    
    public void falhaPeekPilhaVazia(){
        assertEquals(true, pilha.pilhaVazia());
        assertThrows(RuntimeException.class, ()-> pilha.peek());
    }
}
