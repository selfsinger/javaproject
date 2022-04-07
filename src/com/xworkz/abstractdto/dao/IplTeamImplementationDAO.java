package com.xworkz.abstractdto.dao;

import com.xworkz.abstractdto.dto.IplTeamDTO;

public class IplTeamImplementationDAO extends IplTeamDAO {

	public void display() {
		for (int i = 0; i < iplTeamdto.length; i++) {
			System.out.println(iplTeamdto[i].getId() + " \n" + iplTeamdto[i].getName() + " \n"
					+ iplTeamdto[i].getCaptain() + " \n" + iplTeamdto[i].getSponser() + " \n"
					+ iplTeamdto[i].getNoOfWins() + " \n" + iplTeamdto[i].getNoOfLostMatch());
		}
	}

	public IplTeamDTO findByName(String name) {

		for (int i = 0; i < iplTeamdto.length; i++) {
			IplTeamDTO a = iplTeamdto[i];
			if (a != null && a.getName().equals(name)) {
				System.out.println("name is suitable:" + name);
				return a;
			}

		}
		return null;

	}

	public IplTeamDTO findByNameAndSponsor(String name, String sponsor) {
		for (int i = 0; i < iplTeamdto.length; i++) {
			IplTeamDTO d = iplTeamdto[i];
			if (d != null && d.getName().equals(name) && d.getSponser().equals(sponsor)) {
				System.out.println("name and sponser are suitable");
				return d;
			}
		}
		return null;

	}

	public IplTeamDTO findByNameAndSponsorAndCaptain(String name, String sponsor, String captain) {
		for (int i = 0; i < iplTeamdto.length; i++) {
			IplTeamDTO t = iplTeamdto[i];
			if (t != null && t.getName().equals(name) && t.getSponser().equals(sponsor)
					&& t.getCaptain().equals(captain)) {
				System.out.println("name ,sponser and captain are suitable");
			}
		}
		return null;

	}

	public void saveMultiple(IplDTO dto1, IplDTO dto2) {
//		if(dto1!=null && dto2!=null)
//		{
//			System.out.println("its not null");
//		}
//		else {
//			System.out.println("its null,we cant add");
//		}

	}

	public void updateSponsorByName(String name, String sponsor) {
		System.out.println("updating sponser by name");
		for (int i = 0; i < index; i++) {
			IplTeamDTO t = iplTeamdto[i];
			if (t.getName() == name) {
				t.setSponser(sponsor);
			}
		}
		System.out.println("sponser is updated");

	}

	public void updateCaptainByName(String captain, String name) {
		System.out.println("updating captain by name");
		for (int i = 0; i < index; i++) {
			IplTeamDTO p = iplTeamdto[i];
			if (p.getName() == name) {
				p.setCaptain(captain);
				System.out.println("captain updated");
			}

		}

	}

	public int total() {
		int t = 0;
		for (int i = 0; i < iplTeamdto.length; i++) {
			if (iplTeamdto[i] != null) {
				t++;
			}
		}
		return t;
	}

}
