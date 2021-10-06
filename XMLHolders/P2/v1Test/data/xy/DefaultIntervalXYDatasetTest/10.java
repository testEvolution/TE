@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultIntervalXYDataset d1 = new DefaultIntervalXYDataset();
        DefaultIntervalXYDataset d2 = (DefaultIntervalXYDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // try a dataset with some content...
        d1 = createSampleDataset1();
        d2 = (DefaultIntervalXYDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));
    }

    