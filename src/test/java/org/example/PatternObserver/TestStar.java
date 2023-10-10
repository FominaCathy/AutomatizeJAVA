package org.example.PatternObserver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class TestStar extends AbstractTestPO {

    @Test
    void testSender() {
        Assumptions.assumeTrue(sun.addSender(priest));
        Assumptions.assumeTrue(sun.addSender(astro));

        Assertions.assertEquals(2, sun.notifySubscriber("message Sun"));

    }

    @Test
    void testRemove() {
        Assumptions.assumeTrue(sun.addSender(priest));
        Assumptions.assumeTrue(sun.addSender(astro));

        Assumptions.assumeTrue(sun.removeSender(astro));

        Assertions.assertEquals(1, sun.notifySubscriber("message Sun"));

    }

    @Test
    void testEmptySender() {
        Assertions.assertEquals(0, sun.notifySubscriber("message Sun"));

    }

    @Test
    void testNotRemove() {
        Assumptions.assumeTrue(sun.addSender(priest));
        Assumptions.assumeFalse(sun.removeSender(astro));

        Assertions.assertEquals(1, sun.notifySubscriber("message Sun"));

    }
}
