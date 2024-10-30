package bean;

public class Leader extends Shared {
	private Double position;
	private String leaderTeam;
	
	public Leader() {
		// TODO Auto-generated constructor stub
	}

	public Leader(Double position, String leaderTeam) {
		this.position = position;
		this.leaderTeam = leaderTeam;
	}

	public Double getPosition() {
		return position;
	}

	public void setPosition(Double position) {
		this.position = position;
	}

	public String getLeaderTeam() {
		return leaderTeam;
	}

	public void setLeaderTeam(String leaderTeam) {
		this.leaderTeam = leaderTeam;
	}

	@Override
	public String toString() {
		return "Leader [position=" + position + ", leaderTeam=" + leaderTeam + "]";
	}
	

	
	
}
