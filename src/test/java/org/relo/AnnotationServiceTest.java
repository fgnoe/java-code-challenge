package org.relo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.relo.AnnotationService.findBucketWithMostOverlap;
import static org.relo.BucketEnum.SIDES;

public class AnnotationServiceTest {

    @Test
    public void testOverlap() {
        assertEquals(SIDES, findBucketWithMostOverlap(
                new Size(900, 900),
                new BoundingBox(100, 450, 300, 200)));
    }
}
