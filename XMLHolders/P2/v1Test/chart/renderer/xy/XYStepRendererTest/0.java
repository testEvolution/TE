@Test
    public void testEquals() {
        XYStepRenderer r1 = new XYStepRenderer();
        XYStepRenderer r2 = new XYStepRenderer();
        assertEquals(r1, r2);

        r1.setStepPoint(0.44);
        assertFalse(r1.equals(r2));
        r2.setStepPoint(0.44);
        assertTrue(r1.equals(r2));

        // try something from the base class
        r1.setDefaultCreateEntities(false);
        assertFalse(r1.equals(r2));
        r2.setDefaultCreateEntities(false);
        assertTrue(r1.equals(r2));
    }

    