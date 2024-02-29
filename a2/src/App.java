import java.util.Scanner;
 
public class App {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
 
        String [][]login = {{"Bru@bru","111"},
                            {"Ana@ana", "222"},
                            {"Gab@gab", "333"},
                            {"Rose@rose","444"},
                            {"Jao@jao", "555"},
                            {"Tom@tom", "666"}};
       
        System.out.println("Digite seu email: ");
        String tentativa = scan.nextLine();
        int i=0;
      while (!tentativa.equals(login)) {
 
        System.out.println("Sua senha esta incorreta ");
        i++;
       
      };
      System.out.println("Email correto, digite sua senha: ");
      String senha = scan.nextLine();
     
      scan.close();

    }

}