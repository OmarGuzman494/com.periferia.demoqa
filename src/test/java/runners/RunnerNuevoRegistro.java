package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



	
public class RunnerNuevoRegistro {

		private static final Logger LOGGER = LoggerFactory.getLogger(RunnerNuevoRegistro.class);
		
		@Test
		public void subRunner() {
			try {
				LOGGER.info("Medio");
				JUnitCore.runClasses(CRunnerNuevoRegistro.class);
			}
			catch (Exception e) {
				LOGGER.error("Error Runner: RunnerNuevoRegistro {}", e.getMessage());	
			}
		}
		
		@Before
		public void test()  {
		try {
				LOGGER.info("Inicio test runner nuevo registro");
				com.periferia.demoqa.modelo.FeatureOverright.overrideFeatureFiles("src/test/resources");
			}
			catch(Exception e){
				LOGGER.error("Error Runner nuevo registro: {}", e.getMessage());		
			}
		}
		
		@RunWith(CucumberWithSerenity.class)
		@CucumberOptions(features = "src/test/resources/features/NuevoRegistro.feature"
		,tags = "@AgregarNuevoRegistro"
		,plugin = {"pretty","html:target/cucumber-reports"}
		,glue = {"com.periferia.demoqa.definition"}) 
		
		public class CRunnerNuevoRegistro {

		}
}


