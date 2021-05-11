package Entities;

public class Campaign {
	int id;
	String CampaignName;
	double Discount;
	
	
	public Campaign(int id, String campaignName, double discount) {
		super();
		this.id = id;
		CampaignName = campaignName;
		Discount = discount;
	}
	
	public Campaign() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return CampaignName;
	}


	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}


	public double getDiscount() {
		return Discount;
	}


	public void setDiscount(double discount) {
		Discount = discount;
	}

}
