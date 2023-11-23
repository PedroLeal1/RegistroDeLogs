public class Log {
    private static Log instance; // Declara��o da inst�ncia �nica (Singleton)
    private StringBuilder logData; // Armazena os dados do log

    private Log() {
        logData = new StringBuilder(); // Inicializa o StringBuilder para armazenar o log
    }

    public static Log getInstance() {
        if (instance == null) { // Verifica se a inst�ncia ainda n�o foi criada
            instance = new Log(); // Cria uma nova inst�ncia se n�o existir
        }
        return instance; // Retorna a inst�ncia existente ou rec�m-criada
    }

    public void addLog(String logMessage) {
        logData.append(logMessage).append("\n"); // Adiciona uma mensagem ao log
    }

    public void displayLog() {
        System.out.println("Log:"); // Exibe cabe�alho do log
        System.out.println(logData); // Exibe o conte�do do log
    }
}
