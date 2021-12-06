package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



	
public class RunnerDiligenciarFechas {

		private static final Logger LOGGER = LoggerFactory.getLogger(RunnerDiligenciarFechas.class);
		
		@Test
		public void subRunner() {
			try {
				LOGGER.info("Medio");
				JUnitCore.runClasses(CRunnerDiligenciarFechas.class);
			}
			catch (Exception e) {
				LOGGER.error("Error Runner: RunnerDiligenciarFechas {}", e.getMessage());	
			}
		}
		
		@Before
		public void test()  {
		try {
				LOGGER.info("Inicio test runner diligenciar fechas");
				com.periferia.demoqa.modelo.FeatureOverright.overrideFeatureFiles("src/test/resources");
			}
			catch(Exception e){
				LOGGER.error("Error Runner Diligenciar fechas {}", e.getMessage());		
			}
		}
		
		@RunWith(CucumberWithSerenity.class)
		@CucumberOptions(features = "src/test/resources/features/AgregarFechas.feature"
		,tags = "@AgregarFecha"
		,plugin = {"pretty","html:target/cucumber-reports"}
		,glue = {"com.periferia.demoqa.definition"}) 
		
		
public class CRunnerDiligenciarFechas {

		}
		
}
