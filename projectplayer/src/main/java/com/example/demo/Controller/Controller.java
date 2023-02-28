package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Player;
import com.example.demo.Service.PlayerService;

@RestController
public class Controller {
   @Autowired
   private PlayerService prservice;
   @PostMapping("/addPlayer")
   public String postDetails(@RequestBody Player p) {
	   prservice.savedetails(p);
	   return "Value Successfully Added";
   }
   @GetMapping("/getPlayer")
   public List<Player>getDetails(){
	   return prservice.getAllDetails();
   }
  @RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
   public Player updatePlayerById(@PathVariable int id, @RequestBody Player p) {
       return prservice.updatePlayerById(id, p);
   }
   @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
   public boolean deletePlayerById(@PathVariable int id) {
       return prservice.deletePlayerById(id);
   }
   @GetMapping("/product/{field}")
	public List<Player> getWithSort(@PathVariable String field) {
		return prservice.getSorted(field);
	}
   @GetMapping("/product/{offset}/{pageSize}")
	public List<Player> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		return prservice.getWithPagination(offset, pageSize);
	}
 
}
