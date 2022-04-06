package com.xworkz.abstractdto.dto;

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

	public IplTeamDTO updateNameById(String id, String name) {
		System.out.println("updating name by id");
		for (int i = 0; i < index; i++) {
			IplTeamDTO b = iplTeamdto[i];
			if (b.getId() == id) {
				b.setName(name);
			}
		}
		System.out.println("updated");
		return null;

	}

}
