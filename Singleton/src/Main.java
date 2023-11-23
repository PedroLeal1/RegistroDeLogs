public class Main {
    public static void main(String[] args) {
        Log log = Log.getInstance(); // Obtém a instância única da 
        //classe Log

        log.addLog("Inicialização do sistema."); // Adiciona uma
        //mensagem de inicialização ao log
        log.displayLog(); // Exibe o log após a inicialização do 
        // sistema

        ErrorLogger errorLogger = new ErrorLogger(); // Cria uma 
        //instância de ErrorLogger
        errorLogger.logError("Erro encontrado!"); // Chama o método
        //para registrar um erro no log
    }
}
