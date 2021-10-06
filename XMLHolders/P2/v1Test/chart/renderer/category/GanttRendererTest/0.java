@Test
    public void testEquals() {
        GanttRenderer r1 = new GanttRenderer();
        GanttRenderer r2 = new GanttRenderer();
        assertEquals(r1, r2);

        r1.setCompletePaint(Color.YELLOW);
        assertFalse(r1.equals(r2));
        r2.setCompletePaint(Color.YELLOW);
        assertTrue(r1.equals(r2));

        r1.setIncompletePaint(Color.GREEN);
        assertFalse(r1.equals(r2));
        r2.setIncompletePaint(Color.GREEN);
        assertTrue(r1.equals(r2));

        r1.setStartPercent(0.11);
        assertFalse(r1.equals(r2));
        r2.setStartPercent(0.11);
        assertTrue(r1.equals(r2));

        r1.setEndPercent(0.88);
        assertFalse(r1.equals(r2));
        r2.setEndPercent(0.88);
        assertTrue(r1.equals(r2));
    }

    