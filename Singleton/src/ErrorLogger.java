public class ErrorLogger {
    public void logError(String errorMessage) {
        Log log = Log.getInstance(); 
        // Obt�m a inst�ncia �nica da classe Log
        log.addLog("Erro: " + errorMessage); 
        // Adiciona uma mensagem de erro ao log
        log.displayLog(); 
        // Exibe o log ap�s adicionar a mensagem de erro
    }
}
