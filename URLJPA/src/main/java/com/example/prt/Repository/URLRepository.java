package com.example.prt.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.prt.Model.URL;

@Repository
@Component
public interface URLRepository extends JpaRepository<URL,String>{
	URL findByEncodedurl(String encodedurl);
}
