// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Random;
import java.util.Scanner;

public class TestePilha1 {
   public TestePilha1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      Pilha pilha = new Pilha();

      for(int var4 = menu(var1); var4 != 0; var4 = menu(var1)) {
         switch (var4) {
            case 1:
               pilha.push(var2.nextInt(100));
               break;
            case 2:
               try {
                  pilha.pop();
               } catch (RuntimeException var6) {
                  System.out.println(var6.getMessage());
               }
               break;
            case 3:
               System.out.println(pilha);
               break;
            default:
               System.out.println("Opcao invalida! :(");
         }
      }

      System.out.println("Obrigado, volte sempre! :)");
      var1.close();
   }

   static int menu(Scanner var0) {
      System.out.println("escolha uma opcao:\n");
      System.out.println("1 - Empilhar\n");
      System.out.println("2 - Desempilhar\n");
      System.out.println("3 - Exibir\n");
      System.out.println("0 - Sair\n");
      return var0.nextInt();
   }
}
