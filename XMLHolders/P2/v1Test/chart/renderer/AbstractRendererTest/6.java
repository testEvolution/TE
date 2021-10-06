@Test
    public void testEquals2() {
        TestRenderer r1 = new TestRenderer();
        TestRenderer r2 = new TestRenderer();
        assertTrue(r1.equals(r2));
        r1.setTreatLegendShapeAsLine(true);
        assertFalse(r1.equals(r2));
        r2.setTreatLegendShapeAsLine(true);
        assertTrue(r1.equals(r2));
    }

    