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

    public void falhaPilhaCheia(){
        for(int i = pilha.ocupacao; i < pilha.dados.length; i++){
            pilha.push(i);
        }

        assertThrows(RuntimeException.class, ()-> pilha.push(11));
    }
}
