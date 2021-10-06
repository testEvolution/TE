@Test
    public void testEqual() {
        assertTrue(DataUtils.equal(null, null));
        
        double[][] a = new double[5][];
        double[][] b = new double[5][];
        assertTrue(DataUtils.equal(a, b));

        a = new double[4][];
        assertFalse(DataUtils.equal(a, b));
        b = new double[4][];
        assertTrue(DataUtils.equal(a, b));

        a[0] = new double[6];
        assertFalse(DataUtils.equal(a, b));
        b[0] = new double[6];
        assertTrue(DataUtils.equal(a, b));

        a[0][0] = 1.0;
        assertFalse(DataUtils.equal(a, b));
        b[0][0] = 1.0;
        assertTrue(DataUtils.equal(a, b));

        a[0][1] = Double.NaN;
        assertFalse(DataUtils.equal(a, b));
        b[0][1] = Double.NaN;
        assertTrue(DataUtils.equal(a, b));

        a[0][2] = Double.NEGATIVE_INFINITY;
        assertFalse(DataUtils.equal(a, b));
        b[0][2] = Double.NEGATIVE_INFINITY;
        assertTrue(DataUtils.equal(a, b));

        a[0][3] = Double.POSITIVE_INFINITY;
        assertFalse(DataUtils.equal(a, b));
        b[0][3] = Double.POSITIVE_INFINITY;
        assertTrue(DataUtils.equal(a, b));

        a[0][4] = Double.POSITIVE_INFINITY;
        assertFalse(DataUtils.equal(a, b));
        b[0][4] = Double.NEGATIVE_INFINITY;
        assertFalse(DataUtils.equal(a, b));
        b[0][4] = Double.POSITIVE_INFINITY;
        assertTrue(DataUtils.equal(a, b));
    }

    