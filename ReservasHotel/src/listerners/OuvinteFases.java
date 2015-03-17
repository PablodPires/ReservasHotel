package listerners;

import java.util.logging.Logger;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import com.sun.jersey.core.header.reader.HttpHeaderReader.Event;

public class OuvinteFases implements PhaseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void afterPhase(PhaseEvent event) {
	
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info(event.getPhaseId() + "Encerrou");

	}

	@Override
	public void beforePhase(PhaseEvent event) {
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info(event.getPhaseId() + "iniciou");
	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}

}
