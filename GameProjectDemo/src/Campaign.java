
public class Campaign {
	private String campaignName;
	private String startTime;
	private String finishTime;
	private int discount;
	
	public Campaign(String campaignName, String startTime, String finishTime, int discount) {
		super();
		this.campaignName = campaignName;
		this.startTime = startTime;
		this.finishTime = finishTime;
		this.discount = discount;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
