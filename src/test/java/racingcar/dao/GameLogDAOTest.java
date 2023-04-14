package racingcar.dao;

import static org.assertj.core.api.Assertions.assertThatNoException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureTestDatabase
public class GameLogDAOTest {

    @Autowired
    private GameLogDAO gameLogDao;

    @Test
    void insert() {
        assertThatNoException().isThrownBy(() -> gameLogDao.insert(5, "달리", 10));

    }
}
