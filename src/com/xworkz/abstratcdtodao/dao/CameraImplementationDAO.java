package com.xworkz.abstratcdtodao.dao;

import com.xworkz.abstratcdtodao.dto.CameraDTO;

public class CameraImplementationDAO extends CameraDAO{
	
    CameraDTO c[]=new CameraDTO[4];
	 int index=0;
	
		
	

	@Override
	public void save(CameraDTO dto) {
		System.out.println("save method of cameraDTO to save data");
		c[index]=dto;
		index++;
		System.out.println("data is saved");
		
	}

	@Override
	public CameraDTO findById(int id) {
	
	for(int i=0; i<c.length;i++) 
	{
		CameraDTO m=c[i];
		if(m!=null && m.getId()==id)
		{
			System.out.println("id is suitable");

			return m;
		}
	}
	return null;
	
}

	public CameraDTO findByMaxPrice() {
		System.out.println("here the max price is:");
		double mp=0;
		int mi=0;
		
		for(int i=0;i<c.length;i++) 
			        //1<4
		{       
			if(c[i]!=null)
			{//c[0] not equal to null
				double price=c[i].getPrice();//c[0].53590.00
				if(price>mp) //53590.00>0
				{
					mp=price;//53590.00
					mi=i;//0
				}
		}
			
			
		}
		System.out.println("the max cost of camera is:"+mp+" @ the index of "+mi);
		return c[mi];
		
	}
		
	@Override
	public CameraDTO findMinPrice() {
		System.out.println("finding min cost");
		double mp1 =c[0].getPrice();
		int mi1=0;
		
		for(int i=0;i<c.length;i++) 
			        //1<4
		{       
			if(c[i]!=null)
			{//c[0] not equal to nu
				double price=c[i].getPrice();//c[0].53590.00
				if(price<mp1) //53590.00>0
				{
					mp1=price;//53590.00
					mi1=i;//0
				}
		}
			
			
		}
		System.out.println("the min cost of camera is:"+mp1+"&found @ index"+mi1);
		return c[mi1];
	}


	
	
}
