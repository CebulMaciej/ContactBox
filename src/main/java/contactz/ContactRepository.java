package contactz;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Maciej Cebula on 15.04.2017.
 */
@Repository
public class ContactRepository {
    private JdbcTemplate jdbc;
    //private List<Contact> contactz;

    public ContactRepository() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/mydb");
        driverManagerDataSource.setUsername("postgres");
        driverManagerDataSource.setPassword("postgres");
        jdbc = new JdbcTemplate(driverManagerDataSource);
    }
    public List<Contact> findAll(){
        return jdbc.query("select id, firstName, lastName, phoneNumber, emailAddress from contact order by lastName",
                new RowMapper<Contact>(){
                    public Contact mapRow(ResultSet rs, int rowNum)
                        throws SQLException {
                    Contact contact = new Contact();
                    contact.setId(rs.getInt(1));
                    contact.setFirstName(rs.getString(2));
                    contact.setLastName(rs.getString(3));
                    contact.setPhoneNumber(rs.getString(4));
                    contact.setEmailAddress(rs.getString(5));
                    return contact;
                    }
                });
    }

    public void save(Contact contact){
        jdbc.update("insert into contact(id,firstName, lastName, phoneNumber, emailAddress) values (?,?,?,?,?)",Contact.liczba++,contact.getFirstName(),contact.getLastName(),contact.getPhoneNumber(),contact.getEmailAddress());
    }
}
