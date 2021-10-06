@Test
    public void testEquals() {
        HighLowRenderer r1 = new HighLowRenderer();
        HighLowRenderer r2 = new HighLowRenderer();
        assertEquals(r1, r2);

        // drawOpenTicks
        r1.setDrawOpenTicks(false);
        assertFalse(r1.equals(r2));
        r2.setDrawOpenTicks(false);
        assertTrue(r1.equals(r2));

        // drawCloseTicks
        r1.setDrawCloseTicks(false);
        assertFalse(r1.equals(r2));
        r2.setDrawCloseTicks(false);
        assertTrue(r1.equals(r2));

        // openTickPaint
        r1.setOpenTickPaint(Color.RED);
        assertFalse(r1.equals(r2));
        r2.setOpenTickPaint(Color.RED);
        assertTrue(r1.equals(r2));

        // closeTickPaint
        r1.setCloseTickPaint(Color.BLUE);
        assertFalse(r1.equals(r2));
        r2.setCloseTickPaint(Color.BLUE);
        assertTrue(r1.equals(r2));

        // tickLength
        r1.setTickLength(99.9);
        assertFalse(r1.equals(r2));
        r2.setTickLength(99.9);
        assertTrue(r1.equals(r2));
    }

    