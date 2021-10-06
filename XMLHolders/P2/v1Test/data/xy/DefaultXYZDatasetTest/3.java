@Test
    public void testSerialization() {
        DefaultXYZDataset d1 = new DefaultXYZDataset();
        DefaultXYZDataset d2 = (DefaultXYZDataset) TestUtils.serialised(d1);
        assertEquals(d1, d2);

        // try a dataset with some content...
        double[] x1 = new double[] {1.0, 2.0, 3.0};
        double[] y1 = new double[] {4.0, 5.0, 6.0};
        double[] z1 = new double[] {7.0, 8.0, 9.0};
        double[][] data1 = new double[][] {x1, y1, z1};
        d1.addSeries("S1", data1);
        d2 = (DefaultXYZDataset) TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

    