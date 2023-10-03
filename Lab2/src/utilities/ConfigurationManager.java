package utilities;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String configuration;

    private ConfigurationManager() {
        // private constructor to restrict instantiation
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
