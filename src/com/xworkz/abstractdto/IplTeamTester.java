package com.xworkz.abstractdto;

import com.xworkz.abstractdto.dao.IplTeamImplementationDAO;
import com.xworkz.abstractdto.dto.IplTeamDTO;

public class IplTeamTester {

	public static void main(String[] args) {
		IplTeamDTO dto1 = new IplTeamDTO();
		// DTO
		dto1.setId("@royalchallengersbangalors");
		dto1.setName("Royal Challengers Bangalore");
		dto1.setSponser("Muthoot FinCorp");
		dto1.setCaptain("Virat kohli");
		dto1.setNoOfWins(98);
		dto1.setNoOfLostMatch(106);
		// DAO
		IplTeamImplementationDAO dao = new IplTeamImplementationDAO();
		dao.save(dto1);

		System.out.println();
		IplTeamDTO dto2 = new IplTeamDTO();
		dto2.setId("chennaiipl");
		dto2.setName("Chennai Super Kings");
		dto2.setSponser("TVS Eurogrip");
		dto2.setCaptain("Ravindra Jadeja");
		dto2.setNoOfWins(117);
		dto2.setNoOfLostMatch(77);
		dao.save(dto2);

		System.out.println();
		IplTeamDTO dto3 = new IplTeamDTO();
		dto3.setId("mumbaiindians");
		dto3.setName("Mumbai Indians");
		dto3.setSponser("Samsung");
		dto3.setCaptain("Rohit Sharma");
		dto3.setNoOfWins(120);
		dto3.setNoOfLostMatch(83);
		dao.save(dto3);

		System.out.println();
		IplTeamDTO dto4 = new IplTeamDTO();
		dto4.setId("@punjabkiingsipl");
		dto4.setName("punjabkings");
		dto4.setSponser("Bodycare Creations");
		dto4.setCaptain("Mayank Agarwal");
		dto4.setNoOfWins(91);
		dto4.setNoOfLostMatch(109);
		dao.save(dto4);

		System.out.println();
		IplTeamDTO dto5 = new IplTeamDTO();
		dto5.setId("@rajasthanroyals");
		dto5.setName("rajasthan royals");
		dto5.setSponser("Dollar Industries Ltd");
		dto5.setCaptain("Sanju Samson");
		dto5.setNoOfWins(84);
		dto5.setNoOfLostMatch(86);
		dao.save(dto5);

		System.out.println();
		IplTeamDTO dto6 = new IplTeamDTO();
		dto6.setId("@sunrisershyd");
		dto6.setName("sunrisers hyderabad");
		dto6.setSponser(" CARS24 ");
		dto6.setCaptain("Kane Williamson ");
		dto6.setNoOfWins(6);
		dto6.setNoOfLostMatch(9);
		dao.save(dto6);

		System.out.println();
		IplTeamDTO dto7 = new IplTeamDTO();
		dto7.setId("@kkriders");
		dto7.setName("kolkata knight riders");
		dto7.setSponser(" WinZO Sports ");
		dto7.setCaptain("Shreyas Iyer ");
		dto7.setNoOfWins(106);
		dto7.setNoOfLostMatch(97);
		dao.save(dto7);

		System.out.println();
		IplTeamDTO dto8 = new IplTeamDTO();
		dto8.setId("@delhicap");
		dto8.setName("Delhi Capitals");
		dto8.setSponser("Bolt partners");
		dto8.setCaptain("Rishabh Pant ");
		dto8.setNoOfWins(96);
		dto8.setNoOfLostMatch(113);
		dao.save(dto8);

		System.out.println();
		IplTeamDTO dto9 = new IplTeamDTO();
		dto9.setId("@lucknowipl");
		dto9.setName("Lucknow Super Giants");
		dto9.setSponser("Gigabyte Technology");
		dto9.setCaptain("K L Rahul ");
		dto9.setNoOfWins(85);
		dto9.setNoOfLostMatch(120);
		dao.save(dto9);

		System.out.println();
		IplTeamDTO dto10 = new IplTeamDTO();
		dto10.setId("@gujaratlionsipl");
		dto10.setName("Gujarat Lions");
		dto10.setSponser("Ather");
		dto10.setCaptain("Hardik Pandya");
		dto10.setNoOfWins(70);
		dto10.setNoOfLostMatch(110);
		dao.save(dto10);

		System.out.println();
		IplTeamDTO dto11 = new IplTeamDTO();
		dto11.setId("@raisepune");
		dto11.setName("raising pune supergiant");
		dto11.setSponser("new Moto");
		dto11.setCaptain("Yuvraj Singh ");
		dto11.setNoOfWins(10);
		dto11.setNoOfLostMatch(6);
		dao.save(dto11);

		System.out.println();
		IplTeamDTO dto12 = new IplTeamDTO();
		dto12.setId("@hyderabaddeccan");
		dto12.setName("Hyderabad Deccan Chargers");
		dto12.setSponser("Emirates");
		dto12.setCaptain("Robin Singh  ");
		dto12.setNoOfWins(29);
		dto12.setNoOfLostMatch(48);
		dao.save(dto12);

		System.out.println();
		IplTeamDTO dto13 = new IplTeamDTO();
		dto13.setId("@punewarriors");
		dto13.setName("Pune Warriors India");
		dto13.setSponser("TVS Motors");
		dto13.setCaptain("Yuvraj Singh");
		dto13.setNoOfWins(11);
		dto13.setNoOfLostMatch(33);
		dao.save(dto13);

		System.out.println();
		IplTeamDTO dto14 = new IplTeamDTO();
		dto14.setId("@kovhtuskers");
		dto14.setName("Kochi Tuskers Kerala");
		dto14.setSponser("Federal Bank");
		dto14.setCaptain("Mahela JayaWardene");
		dto14.setNoOfWins(30);
		dto14.setNoOfLostMatch(40);
		dao.save(dto14);		

		System.out.println();
		dao.display();

		System.out.println();
		System.out.println(dao.findByName("Royal Challengers Bangalore"));

		System.out.println();
		System.out.println(dao.findByNameAndSponsor("Pune Warriors India", "TVS Motors"));

		System.out.println();
		System.out.println(dao.findByNameAndSponsorAndCaptain("Kochi Tuskers Kerala", "Federal Bank", "Mahela JayaWardene"));

		System.out.println();
		System.out.println("Total ipl teams we have rt now :" + dao.total());
		
		System.out.println();
		//dao.saveMultiple(null,null);
		System.out.println();
		dao.updateSponsorByName("Delhi Capitals", "Ather");

		System.out.println();
		dao.updateCaptainByName("MS Dhoni", "Chennai Super Kings");

		System.out.println();
		// System.out.println(dto1.toString()+" \n"+dto2.toString());

	}
}
