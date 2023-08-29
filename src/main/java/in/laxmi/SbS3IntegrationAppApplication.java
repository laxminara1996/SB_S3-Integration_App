package in.laxmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amazonaws.auth.BasicAWSCredentials;

@SpringBootApplication
public class SbS3IntegrationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbS3IntegrationAppApplication.class, args);
		//BasicAWSCredentials awsCredentials= new BasicAWSCredentials(accessKey, secretKey);
	}

}
