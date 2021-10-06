@Test
    public void testEquals() {
        // default instances
        DeviationStepRenderer r1 = new DeviationStepRenderer();
        DeviationStepRenderer r2 = new DeviationStepRenderer();
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));

        r1.setAlpha(0.1f);
        assertFalse(r1.equals(r2));
        r2.setAlpha(0.1f);
        assertTrue(r1.equals(r2));
    }

    