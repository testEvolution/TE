@Test
    public void testEquals() {
        WaterfallBarRenderer r1 = new WaterfallBarRenderer();
        WaterfallBarRenderer r2 = new WaterfallBarRenderer();
        assertEquals(r1, r2);

        // firstBarPaint;
        r1.setFirstBarPaint(Color.cyan);
        assertFalse(r1.equals(r2));
        r2.setFirstBarPaint(Color.cyan);
        assertTrue(r1.equals(r2));

        // lastBarPaint;
        r1.setLastBarPaint(Color.cyan);
        assertFalse(r1.equals(r2));
        r2.setLastBarPaint(Color.cyan);
        assertTrue(r1.equals(r2));

        // positiveBarPaint;
        r1.setPositiveBarPaint(Color.cyan);
        assertFalse(r1.equals(r2));
        r2.setPositiveBarPaint(Color.cyan);
        assertTrue(r1.equals(r2));

        //private Paint negativeBarPaint;
        r1.setNegativeBarPaint(Color.cyan);
        assertFalse(r1.equals(r2));
        r2.setNegativeBarPaint(Color.cyan);
        assertTrue(r1.equals(r2));

    }

    