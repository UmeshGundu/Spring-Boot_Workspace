package in.ashokit.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.ashokit.dto.BookDTO;

public class BookRowMapperImpl implements RowMapper {

	@Override
	public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookDTO dto = new BookDTO();
		dto.setBId(rs.getInt(1));
		dto.setBName(rs.getString(2));
		dto.setBPrice(rs.getDouble(3));

		return dto;
	}

}
