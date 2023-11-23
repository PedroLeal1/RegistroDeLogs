public class ErrorLogger {
    public void logError(String errorMessage) {
        Log log = Log.getInstance(); 
        // Obtém a instância única da classe Log
        log.addLog("Erro: " + errorMessage); 
        // Adiciona uma mensagem de erro ao log
        log.displayLog(); 
        // Exibe o log após adicionar a mensagem de erro
    }
}
