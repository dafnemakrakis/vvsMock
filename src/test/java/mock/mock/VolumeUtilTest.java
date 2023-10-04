package mock.mock;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import io.quarkus.test.Mock;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@ExtendWith(MockitoExtension.class)
public class VolumeUtilTest {
    
    @Mock
    AudioManager audioManager;

    @InjectMocks
    VolumeUtil volumeUtil;

    @Test
    public void testAudioManagerSetVolume() {
        // 3 - realize uma chamada para o método maximizeVolume do objeto VolumeUtil
       
        volumeUtil.maximizeVolume(max:100);

        // 4 - Verifique se o método setVolume foi chamado uma única vez
        verify(audioManager).setVolume(volume:100);


    }
}
