@Test
    public void testEquals() {
        GroupedStackedBarRenderer r1 = new GroupedStackedBarRenderer();
        GroupedStackedBarRenderer r2 = new GroupedStackedBarRenderer();
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));

        // map
        KeyToGroupMap m1 = new KeyToGroupMap("G1");
        m1.mapKeyToGroup("S1", "G2");
        r1.setSeriesToGroupMap(m1);
        assertFalse(r1.equals(r2));
        KeyToGroupMap m2 = new KeyToGroupMap("G1");
        m2.mapKeyToGroup("S1", "G2");
        r2.setSeriesToGroupMap(m2);
        assertTrue(r1.equals(r2));
    }

    