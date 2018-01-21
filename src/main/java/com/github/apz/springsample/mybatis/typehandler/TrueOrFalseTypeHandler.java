/**
 *
 */
package com.github.apz.springsample.mybatis.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.github.apz.springsample.mybatis.model.TrueOrFalse;


/**
 * @author A-pZ
 *
 */
public class TrueOrFalseTypeHandler extends BaseTypeHandler<TrueOrFalse> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, TrueOrFalse parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.getValue());
	}

	@Override
	public TrueOrFalse getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return TrueOrFalse.getTrueOrFalse(rs.getString(columnName));
	}

	@Override
	public TrueOrFalse getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return TrueOrFalse.getTrueOrFalse(rs.getString(columnIndex));
	}

	@Override
	public TrueOrFalse getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return TrueOrFalse.getTrueOrFalse(cs.getString(columnIndex));
	}
}
