@Test
    public void testClone() {
        double[][] a = new double[1][];
        double[][] b = DataUtils.clone(a);
        assertTrue(DataUtils.equal(a, b));
        a[0] = new double[] { 3.0, 4.0 };
        assertFalse(DataUtils.equal(a, b));
        b[0] = new double[] { 3.0, 4.0 };
        assertTrue(DataUtils.equal(a, b));

        a = new double[2][3];
        a[0][0] = 1.23;
        a[1][1] = Double.NaN;
        b = DataUtils.clone(a);
        assertTrue(DataUtils.equal(a, b));

        a[0][0] = 99.9;
        assertFalse(DataUtils.equal(a, b));
        b[0][0] = 99.9;
        assertTrue(DataUtils.equal(a, b));
    }

}