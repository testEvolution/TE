@Test
    public void testHashCodeForDoubleArray() {
        double[] a1 = new double[] {1.0};
        double[] a2 = new double[] {1.0};
        int h1 = HashUtils.hashCodeForDoubleArray(a1);
        int h2 = HashUtils.hashCodeForDoubleArray(a2);
        assertEquals(h1, h2);

        double[] a3 = new double[] {0.5, 1.0};
        int h3 = HashUtils.hashCodeForDoubleArray(a3);
        assertFalse(h1 == h3);
    }
}