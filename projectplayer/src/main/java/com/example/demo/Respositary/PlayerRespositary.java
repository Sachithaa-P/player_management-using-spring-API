package com.example.demo.Respositary;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Models.Player;

public interface PlayerRespositary extends JpaRepository<Player,Integer>{
	//@Query("From player_management1 where id<45")
	//List<Player> findAll();

}
