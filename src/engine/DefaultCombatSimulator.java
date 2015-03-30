package engine;

import interfaces.ICombatSimulator;
import interfaces.IStatable;

/** 
 * This is a bare bones default combat simulator.
 * @author joseph.morain
 *
 */
public class DefaultCombatSimulator implements ICombatSimulator {

	@Override
	public void Emulate(IStatable combatant, IStatable target) {
		throw new UnsupportedOperationException();
	}

}
