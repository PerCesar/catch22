package com.beltran.catch22.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beltran.catch22.entity.Participants;
import com.beltran.catch22.repository.ParticipantsRepository;

@Service
public class ParticipantsServiceImpl implements ParticipantsService{

	@Autowired
	private ParticipantsRepository participantsRepository;
	
	@Override
	public List<Participants> getAllParticipants() {
		return participantsRepository.findAll();
	}

}
