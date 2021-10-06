@Test
    public void testEquals2() {
        FastScatterPlot plot1 = new FastScatterPlot();
        FastScatterPlot plot2 = new FastScatterPlot();
        assertTrue(plot1.equals(plot2));
        assertTrue(plot2.equals(plot1));

        float[][] a = new float[2][];
        float[][] b = new float[2][];
        plot1.setData(a);
        assertFalse(plot1.equals(plot2));
        plot2.setData(b);
        assertTrue(plot1.equals(plot2));

        a[0] = new float[6];
        assertFalse(plot1.equals(plot2));
        b[0] = new float[6];
        assertTrue(plot1.equals(plot2));

        a[0][0] = 1.0f;
        assertFalse(plot1.equals(plot2));
        b[0][0] = 1.0f;
        assertTrue(plot1.equals(plot2));

        a[0][1] = Float.NaN;
        assertFalse(plot1.equals(plot2));
        b[0][1] = Float.NaN;
        assertTrue(plot1.equals(plot2));

        a[0][2] = Float.POSITIVE_INFINITY;
        assertFalse(plot1.equals(plot2));
        b[0][2] = Float.POSITIVE_INFINITY;
        assertTrue(plot1.equals(plot2));

        a[0][3] = Float.NEGATIVE_INFINITY;
        assertFalse(plot1.equals(plot2));
        b[0][3] = Float.NEGATIVE_INFINITY;
        assertTrue(plot1.equals(plot2));
    }

    