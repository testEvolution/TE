@Test
    public void testPublicCloneable() {
        GanttRenderer r1 = new GanttRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    