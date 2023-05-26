package ru.rentTaxi.application.repository;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.rentTaxi.application.entity.Spends;


import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
public class StatsRepository {
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public int getSpendFromIsDate(Date date) {
        Map<String, Object> parametrs = new HashMap<>();
        parametrs.put("date", date);
        return namedParameterJdbcTemplate.queryForObject("SELECT Spend from SPENDS WHERE DATE > :date", parametrs, new StatsRowMapper());
    }
//    public int getAllSpend(BigDecimal amount){
//        Map<String,Object> parametrs = new HashMap<>();
//        parametrs.put("amount",amount);
//        return  jdbcTemplate.queryForObject("SELECT count(*) FROM SPENDS" , Spends.class);
//    }

    private static final class StatsRowMapper implements RowMapper<Integer> {

        @Override
        public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
            return rs.getInt("Spend");
        }
    }
}
