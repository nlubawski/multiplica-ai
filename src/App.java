public class App {
    public static void main(String[] args) throws Exception {

        Integer number = null;
        while(number == null){
            System.out.println("Digite um número: ");
            String entry = System.console().readLine();

            try{
                number = Integer.parseInt(entry);
            }
            catch(NumberFormatException nfe){
                System.out.println("entrada inválida");
            }
        }

        System.out.println("Tabela de multiplicação de " + number);
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " * " + number + " = " + i*number);
        }

    }
}
