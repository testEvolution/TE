@Test
    public void testIsNaNRange() {
        assertTrue(new Range(Double.NaN, Double.NaN).isNaNRange());
        assertFalse(new Range(1.0, 2.0).isNaNRange());
        assertFalse(new Range(Double.NaN, 2.0).isNaNRange());
        assertFalse(new Range(1.0, Double.NaN).isNaNRange());
    }
}