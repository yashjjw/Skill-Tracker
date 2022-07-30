package com.tracker.model;

public class SkillRatingModel {
	
	private int skillId;
	private int skillRating;

	/**
	 * Gets the skill id.
	 *
	 * @return the skill id
	 */
	public int getSkillId() {
		return skillId;
	}

	/**
	 * Sets the skill id.
	 *
	 * @param skillId the new skill id
	 */
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	/**
	 * Gets the skill rating.
	 *
	 * @return the skill rating
	 */
	public int getSkillRating() {
		return skillRating;
	}

	/**
	 * Sets the skill rating.
	 *
	 * @param skillRating the new skill rating
	 */
	public void setSkillRating(int skillRating) {
		this.skillRating = skillRating;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SkillRatingModel [skillId=" + skillId + ", skillRating=" + skillRating + "]";
	}
	
	

}
