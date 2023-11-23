public class Log {
    private static Log instance; // Declaração da instância única (Singleton)
    private StringBuilder logData; // Armazena os dados do log

    private Log() {
        logData = new StringBuilder(); // Inicializa o StringBuilder para armazenar o log
    }

    public static Log getInstance() {
        if (instance == null) { // Verifica se a instância ainda não foi criada
            instance = new Log(); // Cria uma nova instância se não existir
        }
        return instance; // Retorna a instância existente ou recém-criada
    }

    public void addLog(String logMessage) {
        logData.append(logMessage).append("\n"); // Adiciona uma mensagem ao log
    }

    public void displayLog() {
        System.out.println("Log:"); // Exibe cabeçalho do log
        System.out.println(logData); // Exibe o conteúdo do log
    }
}
