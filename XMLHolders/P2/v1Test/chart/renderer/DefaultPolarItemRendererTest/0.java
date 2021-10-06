@Test
    public void testEquals() {
        DefaultPolarItemRenderer r1 = new DefaultPolarItemRenderer();
        DefaultPolarItemRenderer r2 = new DefaultPolarItemRenderer();
        assertEquals(r1, r2);

        r1.setSeriesFilled(1, true);
        assertFalse(r1.equals(r2));
        r2.setSeriesFilled(1, true);
        assertTrue(r1.equals(r2));

    }

    