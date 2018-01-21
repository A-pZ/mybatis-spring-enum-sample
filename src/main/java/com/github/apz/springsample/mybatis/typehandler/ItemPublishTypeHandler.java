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

import com.github.apz.springsample.mybatis.model.ItemPublish;


/**
 * @author A-pZ
 *
 */
public class ItemPublishTypeHandler extends BaseTypeHandler<ItemPublish> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, ItemPublish parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.getValue());
	}

	@Override
	public ItemPublish getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return ItemPublish.getDisplayStatus(rs.getString(columnName));
	}

	@Override
	public ItemPublish getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return ItemPublish.getDisplayStatus(rs.getString(columnIndex));
	}

	@Override
	public ItemPublish getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return ItemPublish.getDisplayStatus(cs.getString(columnIndex));
	}
}
