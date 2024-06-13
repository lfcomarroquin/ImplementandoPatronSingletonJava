public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        config.setServerUrl("http://miapi.com");
        System.out.println("Claro! Aca tienes la informacion de la API:");
        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto: " + config.getPort());
        System.out.println("HostName: " + config.getHostName());
        System.out.println("Version: " + config.getVersion());
    }
}