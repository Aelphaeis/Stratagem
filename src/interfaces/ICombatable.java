package interfaces;

public interface ICombatable extends IStatable {
	public Integer getTotalHealth();
	public Integer getCurrentHealth();
	public void setCurrentHealth(Integer value);
	
	public Double getPhysicalDefense();
	public Double getMagicalDefense();
	
	public Double getPhysicalAttack();
	public Double getMagicalAttack();
}
