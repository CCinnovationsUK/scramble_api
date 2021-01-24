package ai.ccinnov.scramble.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        dbInterface _dbInterface = new dbInterface();
        SpringApplication.run(ApiApplication.class, args);
        _dbInterface.initDbConnection();
    }

}
