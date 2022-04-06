package com.xworkz.abstractdto.dto;

public abstract class IplTeamDAO {
	
//		abstract IplTeamDAO :  save(IplTeamDTO dto);

		IplTeamDTO iplTeamdto[] = new IplTeamDTO[14];
		int index = 0;

		public void save(IplTeamDTO dto) {
			iplTeamdto[index] = dto;
			index++;
			System.out.println("Data is saved");

		}

	}
