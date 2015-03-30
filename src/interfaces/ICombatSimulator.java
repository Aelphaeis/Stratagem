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
	public void EmulateFight(ICombatable combatant, ICombatable target);
	public void EmulateAttack(ICombatable combatant, ICombatable target);
}
