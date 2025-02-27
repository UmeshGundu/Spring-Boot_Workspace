package in.ashokit.generator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

	private static final String PREFIX = "OD"; // Prefix for order ID

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String suffix = "";
		String updateSQL = "UPDATE sequence_table SET next_val = LAST_INSERT_ID(next_val + 1) WHERE sequence_name = 'order_id_seq'";
		String selectSQL = "SELECT LAST_INSERT_ID()";

		try (Connection con = session.createNativeQuery();
				PreparedStatement updateStmt = con.prepareStatement(updateSQL);
				PreparedStatement selectStmt = con.prepareStatement(selectSQL)) {

			// Execute update to increment sequence
			updateStmt.executeUpdate();

			// Fetch the next sequence number
			try (ResultSet rs = selectStmt.executeQuery()) {
				if (rs.next()) {
					suffix = String.valueOf(rs.getInt(1)); // Convert next_val to string
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return PREFIX + suffix; // Generate ID in format "OD1", "OD2", "OD3", etc.
	}
}
