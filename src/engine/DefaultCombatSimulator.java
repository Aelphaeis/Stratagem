package engine;

import java.util.Random;

import interfaces.ICombatSimulator;
import interfaces.ICombatable;

/** 
 * This is a bare bones default combat simulator.
 * @author joseph.morain
 *
 */
public class DefaultCombatSimulator implements ICombatSimulator {

	Random numberGenerator;
	
	public DefaultCombatSimulator(){
		numberGenerator = new Random();
	}
	
	@Override
	public void EmulateFight(ICombatable combatant, ICombatable target) {
		Double combatantStatMultiplier = combatant.getLevel()/100D + 1;
		Double targetStatMultiplier = target.getLevel()/100D + 1;

		Double accuracy = combatant.getDexterity() * 5 * combatantStatMultiplier;
		Double dodge = target.getAgility() * 3 * targetStatMultiplier;
		
		Double hitChance = accuracy/dodge;
		if(isAttackHitting(hitChance))
			EmulateAttack(combatant, target);
	}
	
	@Override
	public void EmulateAttack(ICombatable combatant, ICombatable target) {
		Double combatantStatMultiplier = combatant.getLevel()/100D + 1;
		Double targetStatMultiplier = target.getLevel()/100D + 1;
		
		Double damage = combatant.getPhysicalAttack();
		damage *= combatantStatMultiplier;
		
		Double defense = target.getPhysicalDefense() * targetStatMultiplier;
		defense = defense > .85D? .85D : defense;
		
		damage *= (1 - defense);
		target.setCurrentHealth(target.getCurrentHealth() - new Integer((int) Math.round(damage)));
	}
	boolean isAttackHitting(Double hitChance){
		//If the chance to hit is over 100% the attack hit
		if(hitChance > 1)
			return true;
		
		//Randomly determine if attack hit an return true if it did
		if(numberGenerator.nextDouble() < hitChance)
			return true;
		
		//Attack failed to hit.
		return false;
	}

	


	

}
