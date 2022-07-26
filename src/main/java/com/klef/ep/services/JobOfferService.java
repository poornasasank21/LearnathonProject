package com.klef.ep.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.JobOffer;

@Remote
public interface JobOfferService
{
	public String insertjoboffer(JobOffer j);
	public List<JobOffer> getJoboffer();

}
