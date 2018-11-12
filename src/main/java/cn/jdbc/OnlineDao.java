package cn.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class OnlineDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Online> getAll(){
        return  jdbcTemplate.query("select * from online", new RowMapper<Online>() {
            @Override
            public Online mapRow(ResultSet resultSet, int i) throws SQLException {
                Online online = new Online();
                online.setIp(resultSet.getString(1));
                online.setQq(resultSet.getString(2));
                return online;
            }
        });
    }

    public void addOnline(Online online){
        jdbcTemplate.update("insert into online values (?,?)",online.getIp(),online.getQq());
    }

    public void deleteOnline(Online online){
        jdbcTemplate.update("delete from online where  ip=? and qq=?",online.getIp(),online.getQq());
    }

    @Transactional
    public void addBantch(Online... onlines){

    }
}
