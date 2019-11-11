package com.pyramid;

import com.pyramid.controller.PyramidWordController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PyramidWordTest {

    @Autowired
    private PyramidWordController pyramidWordController;

    @Test
    public void testIsPyramidWord_PASS() {
        String word = "banana";
        boolean result = pyramidWordController.callIsPyramidWord(word);

        assertTrue(result);
    }

    @Test
    public void testIsPyramidWord_FAIL() {
        String word = "bandana";
        boolean result = pyramidWordController.callIsPyramidWord(word);

        assertFalse(result);
    }
}
