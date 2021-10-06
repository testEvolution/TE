@Test
    public void testEquals() {
        StackedAreaRenderer r1 = new StackedAreaRenderer();
        StackedAreaRenderer r2 = new StackedAreaRenderer();
        assertEquals(r1, r2);

        r1.setRenderAsPercentages(true);
        assertFalse(r1.equals(r2));
        r2.setRenderAsPercentages(true);
        assertTrue(r1.equals(r2));
    }

    