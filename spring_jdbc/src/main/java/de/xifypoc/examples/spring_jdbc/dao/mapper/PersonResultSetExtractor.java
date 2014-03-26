package de.xifypoc.examples.spring_jdbc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.ResultSetExtractor;

import de.xifypoc.examples.spring_jdbc.entity.Person;

public class PersonResultSetExtractor implements ResultSetExtractor<Person> {

  public Person extractData(ResultSet rs) throws SQLException {
    Person person = new Person();
    person.setFirstName(rs.getString(1));
    person.setLastName(rs.getString(2));
    return person;
  }
} 
