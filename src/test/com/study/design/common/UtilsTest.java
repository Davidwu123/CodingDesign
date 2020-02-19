package test.com.study.design.common;

import com.study.design.common.Log;
import com.study.design.common.Utils;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Date;

/**
 * Utils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 16, 2020</pre>
 */
public class UtilsTest {
    private Utils utils;

    @Before
    public void before() throws Exception {
        utils = new Utils();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getDate(Date date)
     */
    @Test
    public void testGetDate() throws Exception {
        //TODO: Test goes here...
        Date date = new Date();
        Log.d(UtilsTest.class, date.toString());
        Log.d(UtilsTest.class, utils.trimTimeFieldsToZeroOfNextDay(date).toString());
        assert date != utils.trimTimeFieldsToZeroOfNextDay(date);
    }


} 
