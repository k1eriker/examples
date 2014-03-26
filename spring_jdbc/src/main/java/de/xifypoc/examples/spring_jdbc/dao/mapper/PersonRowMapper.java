package de.xifypoc.examples.spring_jdbc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import de.xifypoc.examples.spring_jdbc.entity.Person;

public class PersonRowMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int line) throws SQLException {
		PersonResultSetExtractor extractor = new PersonResultSetExtractor();
		return extractor.extractData(rs);
	}

}
