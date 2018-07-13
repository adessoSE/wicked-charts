package de.adesso.wickedcharts.highcharts.jackson;

import de.adesso.wickedcharts.highcharts.options.series.Point;
import org.junit.Test;

public class NullPointSerializerTest extends AbstractSerializerTest {

    /**
     * Tests that the y-value of a point is serialized even when it is null.
     *
     * @see <a href="https://github.com/thombergs/wicked-charts/issues/31">https://github.com/thombergs/wicked-charts/issues/31</a>
     */
    @Test
    public void test() {

        // given
        Point point = new Point(null);
        JsonRenderer renderer = new JsonRenderer();

        // when
        String json = renderer.toJson(point);

        // then
        assertIgnoreWhitespaces("{\"y\":null}", json);
    }
}
