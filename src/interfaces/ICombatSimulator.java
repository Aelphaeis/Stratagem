package interfaces;

/**
 * All classes that do combat simulation implement this interface
 * @author joseph.morain
 *
 */
public interface ICombatSimulator {
	/**
	 * 
	 * @param combatant The attacker
	 * @param target The target being attacked
	 */
	public void Emulate(IStatable combatant, IStatable target);
}
