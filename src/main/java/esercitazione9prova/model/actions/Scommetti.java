package esercitazione9prova.model.actions;

import esercitazione9prova.model.Model;
import esercitazione9prova.model.components.State;

public class Scommetti extends Action {

	public Scommetti() {
	}

	@Override
	public void esegui(Model gioco) {
		//System.out.println(gioco.getPrigionieri().toString());
		//System.out.println(gioco.prigionieriInTheRoom().toString());
		if (gioco.prigionieriInTheRoom().containsAll(gioco.getPrigionieri())) {
			gioco.setState(State.WIN);
		} else {
			gioco.setState(State.LOSE);
		}
	}
}