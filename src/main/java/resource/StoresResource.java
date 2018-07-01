package resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tuxpuckpepe.monitoring.api.EventCounterMBean;

/**
 * 
 * @author Tuxpuckpepe
 *
 */
@Component
@Path("/stores")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StoresResource {
	private static final Logger log = LoggerFactory.getLogger(StoresResource.class);
	
	@Autowired
	private EventCounterMBean eventCounter;
	
	@GET
	public String getStores() {
		log.info("get stores");
		eventCounter.addEventCounter();
		return String.format("[{\"idStore\": \"1\",\"storeName\": \"Store Calz. del Hueso\"},{\"idStore\": \"2\",\"storeName\": \"Store Periferico\"}]");
	}
	
	@GET
	@Path("/{IdStore}")
	public String getById(@PathParam("IdStore") Integer idStore) {
		log.info("idStore: " + idStore);
		return String.format("{\"idStore\": \"" + idStore + "\",\"storeName\": \"name of the store\"}");
	}
}
