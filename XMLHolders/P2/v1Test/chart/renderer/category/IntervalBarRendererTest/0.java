@Test
    public void testEquals() {
        IntervalBarRenderer r1 = new IntervalBarRenderer();
        IntervalBarRenderer r2 = new IntervalBarRenderer();
        assertEquals(r1, r2);

        // the renderer should not be equal to a BarRenderer
        BarRenderer br = new BarRenderer();
        assertFalse(r1.equals(br));
    }

    