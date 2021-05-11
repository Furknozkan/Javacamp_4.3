package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignCheckManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("kampanya eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("kampanya silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("kampanya güncellendi");
		
	}

}
