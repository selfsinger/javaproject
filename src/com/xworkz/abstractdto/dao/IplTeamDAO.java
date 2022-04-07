package com.xworkz.abstractdto.dao;

import com.xworkz.abstractdto.dto.IplTeamDTO;

public abstract class IplTeamDAO {



	protected IplTeamDTO iplTeamdto[] = new IplTeamDTO[14];
	protected int index = 0;

	public void save(IplTeamDTO dto) {
		iplTeamdto[index] = dto;
		index++;
		System.out.println("Data is saved");
	}

}
