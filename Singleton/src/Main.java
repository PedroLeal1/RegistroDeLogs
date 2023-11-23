public class Main {
    public static void main(String[] args) {
        Log log = Log.getInstance(); // Obt�m a inst�ncia �nica da 
        //classe Log

        log.addLog("Inicializa��o do sistema."); // Adiciona uma
        //mensagem de inicializa��o ao log
        log.displayLog(); // Exibe o log ap�s a inicializa��o do 
        // sistema

        ErrorLogger errorLogger = new ErrorLogger(); // Cria uma 
        //inst�ncia de ErrorLogger
        errorLogger.logError("Erro encontrado!"); // Chama o m�todo
        //para registrar um erro no log
    }
}
