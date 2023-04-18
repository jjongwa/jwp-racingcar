package racingcar.dao;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import racingcar.domain.TrialCount;

@SpringBootTest
public class GameDaoTest {

    @Autowired
    private GameDao gameDao;

    @Test
    void saveGameTest() {
        int trialCount = 10;
        assertThat(gameDao.saveGame(TrialCount.of(trialCount))).isEqualTo(1);
        assertThat(gameDao.saveGame(TrialCount.of(trialCount))).isEqualTo(2);
    }
}
