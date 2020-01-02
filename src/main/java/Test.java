import com.example.SpringProject.dao.Ingredient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class Test {

    public static void main(String[] args) {

        JdbcTemplate template = new JdbcTemplate();

        System.out.println(template.query("select * from ingredient where id=?", Test::mapRowToIngredient, "FLTO"));

    }

    private static Ingredient mapRowToIngredient(ResultSet rs, int row) throws SQLException {

        return new Ingredient(rs.getString("id"),
                rs.getString("name"),
                Ingredient.Type.valueOf(rs.getString("type")));
    }
}
