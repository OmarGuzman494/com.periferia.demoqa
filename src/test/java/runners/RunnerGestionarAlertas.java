package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



	
public class RunnerGestionarAlertas {

		private static final Logger LOGGER = LoggerFactory.getLogger(RunnerGestionarAlertas.class);
		
		@Test
		public void subRunner() {
			try {
				LOGGER.info("Medio");
				JUnitCore.runClasses(CRunnerGestionarAlertas.class);
			}
			catch (Exception e) {
				LOGGER.error("Error Runner: RunnerGestionarAlertas {}", e.getMessage());	
			}
		}
		
		@Before
		public void test()  {
		try {
				LOGGER.info("Inicio test runner gestionar alertas");
				com.periferia.demoqa.modelo.FeatureOverright.overrideFeatureFiles("src/test/resources");
			}
			catch(Exception e){
				LOGGER.error("Error Runner gestionar alertas: {}", e.getMessage());		
			}
		}
		
		@RunWith(CucumberWithSerenity.class)
		@CucumberOptions(features = "src/test/resources/features/GestionarAlertas.feature"
		,tags = "@GestionAlertas"
		,plugin = {"pretty","html:target/cucumber-reports"}
		,glue = {"com.periferia.demoqa.definition"}) 
		
		

public class CRunnerGestionarAlertas {

		}
}



