@Test
    public void testHashcode() {
        DeviationStepRenderer r1 = new DeviationStepRenderer();
        DeviationStepRenderer r2 = new DeviationStepRenderer();
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    