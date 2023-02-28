

package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Models.Player;
import com.example.demo.Respositary.PlayerRespositary;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRespositary pr;
	
	public Player savedetails(Player p) {
		return pr.save(p);
	}
	public List<Player> getAllDetails()
	{
		return pr.findAll();
	}
	public boolean deletePlayerById(int id) {
		try {
			pr.deleteById(id);
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public Player updatePlayerById(int id,Player b) {
		Player bb=pr.findById(id).orElse(null);
		
		bb.setId(b.getId());
		bb.setName(b.getName());
		bb.setSport(b.getSport());
		bb.setAge(b.getAge());
		bb.setAname(b.getAname());
		
		return pr.save(bb);
		
		
	}
	public List<Player> getSorted(String field) {
		return pr.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<Player> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<Player> page =pr.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
	
}
