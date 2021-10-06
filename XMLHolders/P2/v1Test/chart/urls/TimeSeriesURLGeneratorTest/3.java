@Test
    public void testPublicCloneable() {
        TimeSeriesURLGenerator g1 = new TimeSeriesURLGenerator();
        assertFalse(g1 instanceof PublicCloneable);
    }

}