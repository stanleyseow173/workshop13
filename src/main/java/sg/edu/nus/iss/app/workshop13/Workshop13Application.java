package sg.edu.nus.iss.app.workshop13;

import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static sg.edu.nus.iss.app.workshop13.util.IOUtil.*;

@SpringBootApplication
public class Workshop13Application {
	private static final Logger logger = LoggerFactory.getLogger(Workshop13Application.class);
	public static void main(String[] args) {
		//SpringApplication.run(Workshop13Application.class, args);
	
		SpringApplication app = new SpringApplication(Workshop13Application.class);
		DefaultApplicationArguments appArgs = new DefaultApplicationArguments(args);

		List<String> opsVal = appArgs.getOptionValues("dataDir");
		System.out.println("before CreatDir");
		if(null!=opsVal){
			logger.info(""+ (String)opsVal.get(0));
			createDir((String)opsVal.get(0));
		}else{
			System.exit(1);
		}

		app.run(args);
	}

}
