package interfaces;

/**
 * Certain entities in the game that have stats and implement the IStatable interface
 * @author joseph.morain
 */
public interface IStatable {
	/**
	 * @return The Level of the entity
	 */
	Integer getLevel();
	
	/**
	 * @return The Intelligence of the entity
	 */
	Double getIntelligence();
	/**
	 * @return The Strength of the entity
	 */
	Double getStrength();
	
	/**
	 * @return The Dexterity of the entity
	 */
	Double getDexterity();
	/**
	 * @return The Agility of the entity
	 */
	Double getAgility();
	
	/**
	 * @return The Vitality of the entity
	 */
	Double getVitality();
}
