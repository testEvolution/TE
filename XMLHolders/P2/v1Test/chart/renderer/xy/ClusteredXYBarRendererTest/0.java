@Test
    public void testEquals() {
        ClusteredXYBarRenderer r1 = new ClusteredXYBarRenderer();
        ClusteredXYBarRenderer r2 = new ClusteredXYBarRenderer();
        assertEquals(r1, r2);
        assertEquals(r2, r1);

        r1 = new ClusteredXYBarRenderer(1.2, false);
        assertFalse(r1.equals(r2));
        r2 = new ClusteredXYBarRenderer(1.2, false);
        assertTrue(r1.equals(r2));

        r1 = new ClusteredXYBarRenderer(1.2, true);
        assertFalse(r1.equals(r2));
        r2 = new ClusteredXYBarRenderer(1.2, true);
        assertTrue(r1.equals(r2));
    }

    